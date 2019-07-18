package SqsQueue;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import java.util.List;

public class SqsReceive {

    public static void processData(String queueUrl){
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();

        for(Message m: messages){
            System.out.println(m.getBody());
            sqs.deleteMessage(queueUrl, m.getReceiptHandle());
        }
    }

    public static void main(String[] args){

        String queueApple = System.getenv("APPLE_QUEUE_URL");
        String queueAndroid = System.getenv("ANDROID_QUEUE_URL");
        String queueEmail = System.getenv("EMAIL_QUEUE_URL");

        while(true){
            processData(queueApple);
            processData(queueAndroid);
            processData(queueEmail);
        }


    }

}
