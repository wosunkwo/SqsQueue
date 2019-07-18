package SqsQueue;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;

public class SqsSend {

    public static void main(String[] args)
    {
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        String queueApple = System.getenv("APPLE_QUEUE_URL");
        String queueAndroid = System.getenv("ANDROID_QUEUE_URL");
        String queueEmail = System.getenv("EMAIL_QUEUE_URL");
        String[] queues = {queueApple, queueAndroid, queueEmail};

        for(int i =0; i < 2; i++){
            for(int j=0; j<queues.length; j++){
                SendMessageRequest send_msg_request = new SendMessageRequest()
                        .withQueueUrl(queues[j])
                        .withMessageBody("this is a sequence number "+ i)
                        .withDelaySeconds(5);
                sqs.sendMessage(send_msg_request);
            }

        }
    }

}
