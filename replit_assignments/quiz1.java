public class quiz1 {
    public static void main(String[] args) {
        String str ="";
        str.trim();
        boolean A = str.isEmpty();
        String ta="A";
        ta = ta.concat("B");
        String tb = "C";
        ta= ta+tb;
        ta.replace('C','D');
        ta = ta + tb;
        System.out.println(ta);
        String str2 = "Batch 21";
        int z = str2.trim().length();
        System.out.println(z);
    }
}
