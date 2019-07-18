# SqsQueue
For this lab, I created a few Message Queues and Broadcasters and wired them through code.

Feature Tasks

## Create 3 Standard Queues

queueApple

queueAndroid

queueEmail

## Create command line applications in Java that use these queues

Queue Publisher

Sends a message to a queue, using its ARN or URL

Queue Client

Receives messages from a Queue (by ARN) and displays them


# Test
![alt_text](https://github.com/wosunkwo/SqsQueue/blob/master/assests/Screen%20Shot%202019-07-18%20at%2012.45.30%20PM.png)


## Wiring Instructions

- Create three different queues in AWS SQS console as standard queue.

- Create a java library sqs_lab
    - For Sender:
        - Create Java class sqsSend.java
        - Write code that will send messages to three different queues
        - [Link to sqsSend.java](https://github.com/wosunkwo/SqsQueue/blob/master/src/main/java/SqsQueue/SqsSend.java)

    - For Receiver:
        - Create Java class sqsRecieve.java
        - Create methods for three different recievers
        - Write code for each methods to get messages from the queues
        - [Link to sqsRecieve.java](https://github.com/wosunkwo/SqsQueue/blob/master/src/main/java/SqsQueue/SqsReceive.java)

    - For both:
        - Get the URLs from SQS
        - Store URLs in environment variables

## For running:
- For sending:
    - On intellij, click on green play button next to the method that sends messages.
    - On terminal: ./gradlew run

- For recieving:
     - On intellij, click on green play button next to the method that recieves messages.
          -On terminal:  ./gradlew run
