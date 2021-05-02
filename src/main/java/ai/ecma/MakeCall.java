package ai.ecma;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.net.URISyntaxException;

public class MakeCall {

    public static final String ACCOUNT_SID = "ACff5b734c02c051375b84b1af8c66cd21";
    public static final String AUTH_TOKEN = "56b54b8efb8eb4d335580b44b44248c1";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Call call = Call.creator(
                new PhoneNumber("+998996802208"),
                new PhoneNumber("+14085338692"),
                new URI("http://demo.twilio.com/docs/voice.xml")
        ).create();

        System.out.println(call.getSid());

    }

}

