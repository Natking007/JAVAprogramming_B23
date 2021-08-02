package Day10;

public class DaysInWeekWithPreCondition {
    public static void main(String[] args) {
        int number = 0;
        String name = "";
      if(number >1 && number <= 7) { // This precondition means this takes precedence over all the other
                                     // conditions.
          if(number == 1) {
              name = "Monday";
          }else if(number == 2){
              name = "Tuesday";
          }else if(number == 3){
              name = "Wednesday";
          }else if(number == 4){
              name = "Thursday";
          }else if(number == 5){
              name = "Friday";
          }else if(number == 6){
              name = "Saturday";
          }else {
              name = "Sunday";
          }
      }
      else {
          name = "NO such day";
      }
        System.out.println("Today is " + name);
    }
}
