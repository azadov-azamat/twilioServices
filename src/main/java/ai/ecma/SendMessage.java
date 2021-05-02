package ai.ecma;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SendMessage {

    public static final String ACCOUNT_SID = "ACff5b734c02c051375b84b1af8c66cd21";
    public static final String AUTH_TOKEN = "56b54b8efb8eb4d335580b44b44248c1";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+998996802208"),
                new com.twilio.type.PhoneNumber("+14085338692"),
                "Ishladi akaxon ").create();
        System.out.println(message.getSid());
    }

}
