package Strings;

import java.util.Scanner;

public class SMSmessage {
    public static void main(String[] args) {
        // do not change:
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        //write your codes here:
        String sender;
        String phoneNumber;
        String messageBody;

        int senderIndex1=message.indexOf("<");
        int senderIndex2=message.indexOf(">");

        sender = message.substring(senderIndex1+1,senderIndex2);

        int phoneNumindex1 = message.indexOf("[");
        int phoneNumindex2 = message.indexOf("]");

        phoneNumber = message.substring(phoneNumindex1+1,phoneNumindex2);

        int messageIndex1 = message.indexOf("{");
        int messageIndex2 = message.indexOf("}");

        messageBody = message.substring(messageIndex1+1,messageIndex2);


        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+ messageBody);



    }
}
/*
Given a String **message** in the following format:
` Sender:<Mike Smith>. From Number:[202-123-3456].
Message:{I love programing and problem solving}`
assign the value of the **sender, phoneNumber, and messageBody** variables and print them.

```
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */
