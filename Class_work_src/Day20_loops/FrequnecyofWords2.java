package Day20_loops;

public class FrequnecyofWords2 {
    public static void main(String[] args) {
        String sentence = "Python Python";
        int count = 0;
        for (int i = 0; i <=sentence.length()-6; i++) {
            String each = sentence.substring(i,i+6);
            if (each.equals("Python")){
                count++;
                System.out.println(each);
            }
        }
        System.out.println("Count = "+count);

        System.out.println("-------------------------------------------------------------");

          String sentence2 = "I love books,reading books is fun";
          String word2 = "book";
        int count2 = 0;
        for (int i = 0; i <=sentence2.length()-word2.length(); i++) {
            // if one was to find the frequency of any word that is written
            // you can do (sentence.length()-word.length())
            String each = sentence2.substring(i,i+word2.length());
            if (each.equalsIgnoreCase(word2)){
                count2++;
                System.out.println(each);
            }
        }
        System.out.println("Count = "+count2);

        System.out.println("-------------------------------------------------");
        String sentence3 = "Cat Dog Dog Cat";
        //             i=   01234567891011121314
        int numberofCats = 0;
        int numberofDogs = 0; //"Cat"- the counter for how many times the word cat occurs.
                             // every time cat comes it will be increased by 1.
        for (int i = 0; i <sentence3.length()-3 ; i++) { // you always need to subtract the same index number
            String each = sentence3.substring(i,i+3);
            if (each.equals("Cat")){
                numberofCats++;                       // from the length of the sentence that you add to in the
                                                     // substring in the new string(each) to set a limit other
                                                    //-wise it will be out of bounds when index keeps adding
            }
            if(each.equals("Dog")){
                numberofDogs++;
            }
        }
        System.out.println("Count: "+numberofCats);
            System.out.println("Count: "+numberofDogs);
            boolean isEqual = numberofCats==numberofDogs;
        System.out.println(isEqual);
    }
    }


