package Day28_Methods;

public class methodsWithParameters {

    public static void main(String[] args) {
        eligible(21);
    }






    public static void eligible (int age) {// since I am writing a program
        // to verify the eligibility of a person, I need to give a parameter
        // which is governed by age
        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
