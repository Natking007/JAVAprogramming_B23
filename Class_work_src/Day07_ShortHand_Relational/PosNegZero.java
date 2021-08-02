package Day07_ShortHand_Relational;

public class PosNegZero {
    public static void main(String[] args) {
        int num = -24;
         boolean typeNum = num > 0;
          boolean typeNum2 = num < 0;
          boolean typeNum3 = num == 0;
        System.out.println(num + "  number is positive: " + typeNum);
        System.out.println(num + "  number is negative : " + typeNum2);
        System.out.println(num + "  number is zero : " + typeNum3);
        // we can also write....
        // boolean typeNum3 = typeNum2 == false && typeNum == false;
    }
}
