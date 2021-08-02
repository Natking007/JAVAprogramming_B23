package Day23_Arrays;

public class MyclassMates {
    public static void main(String[] args) {
        // you initialize arrays like so when you know the elements
        // that are going to be included.
        String[] friends = {"Sabit","Ahmet","Tugba","Beryl","Ahmet"};
        System.out.println("size: "+friends.length);

        for (int i = 0; i <= friends.length ; i++) {
            System.out.println(friends[i]);
        }
        System.out.println("---------------------------------");

        //if we dont know the elemnts we store in the array then you do
        // like so
        String[] friends2 = new String[5];// size 5
        System.out.println("size: "+friends2.length);
        friends2[0] ="Dilem";
        friends2[1]="Mohammed";
        friends2[2]="Komiljon";
        friends2[3]="Esraa";
        friends2[4] = "Kemal";
        friends2[5]="Muhtar";// this is going to be out of bound because the length of the array has been exceeded
                             //***** ARRAY SIZE IS FIXED*******
    }
}
