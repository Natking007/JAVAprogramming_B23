package Day23_Arrays;
// look at day 19- max numbers
public class MaximumNUmbers {
    public static void main(String[] args) {
        int[] num = {10,5,400,50,0,-1};
        int max = num[0];//10 // it is set at zero because it has to run
        int min = num[0];//10// through every value in the array
        for (int i = 0; i <= num.length-1 ; i++) {
         //  int each = num[i]; this will print out each value in the
         //   System.out.println(each); in the array
            int each = num[i];//each:10,5,4,400,50,0,-1
            if(each > max){ // if each variable brings
                max = each;// a number greater than 10(max), then max
                          // is that number
            }if (each<min){
                min = each;
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
/*
 write a program that can find the maximum number from an array of integers
    ex:
            array = {10,5, 4, 400, 50, 0, -1};
            output: 400
write a program that can find the minimum number from an array of integers
    ex:
            array = {10,5, 4, 400, 50, 0, -1};
            output: -1
 */
