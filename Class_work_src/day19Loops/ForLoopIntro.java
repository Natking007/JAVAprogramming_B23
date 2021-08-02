package day19Loops;
/*
Loop: repeated statements

for loop: gets executed if the condition is true, and stops if the condition is false

		for(initialization; Condition; Iterator){
				statements;
		}

		initialization: starting point
					int i = 0;

		Condition: ending point of the loop. created based on the initialization
						i < 5

		Iterator: Co-related to the condition. responsible for making the condition false
						i++: 0, 1, 2, 3, 4, 5

 */

public class ForLoopIntro {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("_-------------------------------");
        for(int i = 1; i<=5;i++){ // if the iterator(i) reaches more than 5 then it will stop executing
                                   // it prevents the loop running infinitely.
            System.out.println("Hello world");
            break; // forced exit from for loop
        }

    }
}
