package Day13;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedlimit = 35;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();
        int overTheSpeedlimit = currentSpeed - speedlimit;
        if(overTheSpeedlimit > 0 ){
            System.out.println("you are driving above the speed limit, SLOW DOWN");

        }else {
            System.out.println("Bon Voyage");
        }
    }
}
/*
Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
 */
