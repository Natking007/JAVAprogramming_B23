public class quiz {
    public static void main(String[] args) {
        int num = 10;
        if(--num > 10){
            System.out.println("hello world"+ num);
        }else {
            System.out.println("hello universe"+ num);
        }
        int x = 10;
        int y = x++;
        System.out.println(y++ + " " + x++ + " " + y);

        boolean a = true, b = !false;
        if(b){
            System.out.println("b");

        }else if(a){
            System.out.println("a");

        }else {
            System.out.println("c");
        }

    }
}
