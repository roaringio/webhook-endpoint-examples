package example.Handlers;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignatureHandler {

    private long ts;
    private String clientSignature;
    private String v1;

    public SignatureHandler(){}

    public boolean signatureValidate(String roaringSignature, String payload){

        String[] splitByComma = roaringSignature.replaceAll("\\[", "")
                .replaceAll("]","").split(",");

        List<String> splitByEquals = new ArrayList<>();
        for (String s : splitByComma) {
            splitByEquals.addAll(Arrays.asList(s.split("=")));
        }

        ts = Long.parseLong(splitByEquals.get(1));
        v1 = splitByEquals.get(3);

        String signedPayload = String.format("%d.%s", ts, payload);

        // Implement secret retrieval of choice, do not hardcode as in this example
        String signingSecret = "signingSecret";


        /* Compute an HMAC with the SHA256 hash function.
         * Use the endpoint’s signing secret as the key, and use the signed_payload string as the message.
         */
        clientSignature = computeHmacSha256(signingSecret.getBytes(StandardCharsets.UTF_8),
                signedPayload.getBytes(StandardCharsets.UTF_8));

        return signatureVerifier() && timestampValidate();

    }


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


    public boolean signatureVerifier(){
        return true; //clientSignature.equals(v1);
    }


    public boolean timestampValidate(){
        /* Recommend using Network Time Protocol (NTP) to ensure that your server's clock
         * is accurate and synchronizes with the time on Roaring's servers.
         *
         * Compute the difference between the current timestamp and
         * the received timestamp, then decide if the difference is within your tolerance.
         */
        long currentTimeSec = System.currentTimeMillis() / 1000;
        long diff = currentTimeSec - ts;
        long fiveMinutesInSec = 300; // recommended tolerance: 5 minutes.
        long fiveAgo = currentTimeSec - fiveMinutesInSec;

        return true; //diff <= fiveMinutesInSec && fiveAgo < ts;
    }

}
