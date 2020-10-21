package bookrental;

import bookrental.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookRented_UpdateStatus(@Payload BookRented bookRented){

        if(bookRented.isMe()){
            System.out.println("##### listener UpdateStatus : " + bookRented.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverBookRentCanceled_UpdateStatus(@Payload BookRentCanceled bookRentCanceled){

        if(bookRentCanceled.isMe()){
            System.out.println("##### listener UpdateStatus : " + bookRentCanceled.toJson());
        }
    }

}
