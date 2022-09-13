<img
     src="https://www.roaring.io/wp-content/uploads/2021/11/roaring-logo-green-1.svg"
     alt="Rroaring logo"
     style="display: inline-block; margin: 0 auto; width: 250px">

# Webhook Endpoint Examples  
Visit us at [Roaring.io](https://www.roaring.io/en/)  

## Description
Roaring can send webhook events that notify your application any time a change of information happens on an object connected to a dataset that you are interested in. These applications in this project combined with [Webhook Guide](https://app.roaring.io/developer/guides#section/Webhooks) are meant to provide working examples of how to integrate your app with Roaring webhooks.

Webhook examples:  
[Java endpoint](https://github.com/roaringio/webhook-endpoint-examples/tree/main/webhook-endpoint-java)  
[C# endpoint](https://github.com/roaringio/webhook-endpoint-examples/tree/main/webhook-endpoint-cs)  


## Table of contents
- [Get started](#get-started)
- [Synchronize](#synchronize)
- [Configure endpoint](#configure-endpoint)
- [Verify Signatures](#verify-signatures)
- [Handle duplicate events](#handle-duplicate-events)
- [Processing](#processing)


## Get started
- When getting started using Roaring services you first create a account on [app.roaring.io/signup](https://app.roaring.io/signup?hl=en)
- Clone the repository: ```git clone https://github.com/roaringio/webhook-endpoint-examples.git ```
- Open either the Java or C# example project depending on your preference.

## Synchronize
We recommend that you use Network Time Protocol (NTP) to ensure that your server's clock is accurate and synchronizes with the time on Roaring's servers.

## Configure endpoint

To set up an endpoint, you need to define a path/route with your server for receiving events.  
- Create a webhook endpoint
<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
    @Path("/endpoint")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(String jsonBody, @Context HttpHeaders httpHeaders) {

        EventHandler eventHandler = new EventHandler();
        return eventHandler.handler(jsonBody, httpHeaders);

    }
</em>
</code></td>
<td><code>
<em>
    
    [Route("/WebhookCs/[controller]")]
    public class EventController : Controller
    {
        [HttpPost] 
        public IActionResult Post([FromBody] string body) {
            Request.Headers.TryGetValue("Roaring-Signature", out var roaringSignature);
            var eventHandler = new EventHandler();
            eventHandler.Handler(body, roaringSignature);
        }
    }   
</em>
</code></td></tr>
</table>

With your endpoint created, you need to tell Roaring about where to send events to. Webhook endpoints are configured in the Webhooks tab on the Developer page at [app.roaring.io](https://app.roaring.io/developer/webhooks).

- Test that your endpoint is working properly. To do this, have your webhook set to sandbox mode.
- Parse JSON to generic class: 
<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
    Event<?> event = new Gson().fromJson(payload, Event.class);
    
</em>
</code></td>
<td><code>
<em>
    
    _event = JsonSerializer.Deserialize<Event<dynamic>>(_signature.Payload, JsonOptions.GetOptions());
    
    
</em>
</code></td></tr>
</table>  

- Do an database lookup to decide whether you accept the payload event connected to the notification identifier or not. 
- Respond to events
<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
    private Response getResponse(String roaringSignature, String payload, Event<?> event) {
        SignatureHandler signatureHandler = new SignatureHandler();
        if(signatureHandler.signatureValidate(roaringSignature, payload)){
            if(requestTypeHandler(event, payload)){
                return Response
                        .status(200, "Accept request")
                        .build();
            }else {
                return Response
                        .status(417, "Decline request.")
                        .build();
            }
        }else{
            return Response
                    .status(400, "Invalid Signature.")
                    .build();
        }
    }
</em>
</code></td>
<td><code>
<em>
    
    return eventHandler.ResponseCodeHandler() switch
    {
        200 => Ok(),
        417 => StatusCode(417),
        _ => BadRequest("Signature doesn't match!")
    };  
</em>
</code></td></tr>
</table>

Response with status code 200 (OK) to accept the payload and 417 (Expectation Failed) to decline.
Acknowledge receipt of the payload event and handle any logic in a thread that needs to take place to prevent timeouts.  

<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
    PostProcessing pp = new PostProcessing(event, payload);
    Thread t = new Thread(pp);
    t.start();
</em>
</code></td>
<td><code>
<em>
    
    var pp = new PostProcessing(_event);
    var t = new Thread(pp.Run);
    t.Start();    
</em>
</code></td></tr>
</table>

## Verify Signatures
- Extract the timestamp and signature from header
- Prepare the signed_payload
- Implement signing secret retrieval of choice, do not hardcode as in these examples
- Determine the expected signature  

<table>
<tr>
<td>Java code block
</td>
<td>C# code block
</td>
</tr>
<tr>
<td>
<code>
<em>
    
    String[] splitByComma = roaringSignature.replaceAll("\\[", "")
        .replaceAll("]","").split(",");

    List<String> splitByEquals = new ArrayList<>();
    for (String s : splitByComma) 
    {
        splitByEquals.addAll(Arrays.asList(s.split("=")));
    }

    ts = Long.parseLong(splitByEquals.get(1));
    v1 = splitByEquals.get(3);
</em>
</code>
</td>
<td>
<code>
<em>
    
    var splitByComma = RoaringSignature.Split(",");
    var splitByEquals = new List<string>();

    foreach (var e in splitByComma)
    {
        var test = e.Split("=");
        splitByEquals.AddRange(test);
    }
    _ts = long.Parse(splitByEquals[1]);
    _v1 = splitByEquals[3];
    
</em>
</code>
</td>
</tr>
</table>

<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
    String signedPayload = String.format("%d.%s", ts, payload);
    
    String clientSecret = "clientsecretkey";
    
</em>
</code></td>
<td><code>
<em>
    
    var signedPayload = Encoder($"{_ts}.{Payload}");
    var clientSecret = Encoder("clientsecretkey");
    

    private static byte[] Encoder(string str)
    {
        var encodedStr = new UTF8Encoding();
        return encodedStr.GetBytes(str);
    }
    
    
</em>
</code></td></tr>
</table>

<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
    clientSignature = computeHmacSha256(clientSecret.getBytes(StandardCharsets.UTF_8),
            signedPayload.getBytes(StandardCharsets.UTF_8));

    public String computeHmacSha256(byte[] secretKey, byte[] message){
        byte[] hmacSha256;
        String formatted;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey, "HmacSHA256");
            mac.init(secretKeySpec);
            hmacSha256 = mac.doFinal(message);

            formatted = String.format("%064x", new BigInteger(1, hmacSha256));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return formatted;
    }
    
    
</em>
</code></td>
<td><code>
<em>
    
    ClientSignature = HmacCalculator(clientSecret, signedPayload);
    
    private static string HmacCalculator(byte[] key, byte[] message)
    {
        var hasher = new HMACSHA256(key);
        var byteHashed = hasher.ComputeHash(message);
        var result = string.Join("", byteHashed.ToList().Select(b => b.ToString("X2")).ToArray()).ToLower();
        return result;
    }
    
    
</em>
</code></td></tr>
</table>
Compare the signature(s) in the header to the expected signature. If a signature matches, compute the difference between the current timestamp and the received timestamp, then decide if the difference is within your tolerance. Recommended time difference tolerance is 5 minutes.  

## Handle duplicate events
Webhook endpoints might occasionally receive the same event more than once. A recommendation is to guard against duplicated event receipts by making event processing Idempotent.

## Processing
The Java and the C# application contains directories that contains JSON objects generated to Java and C# classes.
In the PostProcessing.class we use the generated classes to cast Event.class Object to relevant class. 
- Cast class object to relevant class:
<table>
<tr><td>Java code block</td><td>C# code block</td></tr>
<tr><td><code>
<em>
    
JsonObject json = new JsonParser().parse(payload).getAsJsonObject();
        String eventObject = String.valueOf(json.get("object"));

        String type = event.getType();
        if(type != null ){
            switch (type)
            {
                case "overviewCompanySe" -> {
                    OverviewCompanySe overviewCompanySe = new Gson()
                            .fromJson(eventObject, OverviewCompanySe.class);
                    System.out.println(overviewCompanySe.getAddress());
                }

                case "signingCombinationsSe" -> {
                    SigningCombinationsSe signingCombinationsSe = new Gson()
                            .fromJson(eventObject, SigningCombinationsSe.class);
                    System.out.println(signingCombinationsSe
                            .getCombinations().iterator().next().iterator().next().getName());
                }

            }
        }
</em>
</code></td>
<td><code>
<em>
    
    var type = _event.Type;
    if (type != null)
    {
         switch (_event.Type)
         {
             case "overviewCompanySe":
             {
                 OverviewCompanySe overviewCompanySe = JsonSerializer.Deserialize<OverviewCompanySe>(_event.Object.ToString(), JsonOptions.GetOptions());
                 break;
             }
             case "signingCombinationsSe":
             {
                 SigningCombinationSe signingCombinationSe = JsonSerializer.Deserialize<SigningCombinationSe>(_event.Object.ToString(), JsonOptions.GetOptions());
                 foreach (var position in signingCombinationSe.Combinations.SelectMany(combinations => combinations.SelectMany(combination => combination.Positions)))
                 {
                     Console.WriteLine(position.RoleName);
                 }
                 break;
             }
         }
    }
</em>
</code></td></tr>
</table>
