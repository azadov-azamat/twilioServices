package ai.ecma;


import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Say;

import static spark.Spark.post;

public class ReceiveCall {
    public static void main(String[] args) {

        post("receive-call", (req, res) -> {

            VoiceResponse twiml = new VoiceResponse.Builder()
                    .say(new Say.Builder("Hello! Welcome to ECMA. Have fun!")
                    .build())
                    .build();

            return twiml.toXml();

        });
    }
}
