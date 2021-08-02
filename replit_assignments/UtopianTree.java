public class UtopianTree {
    public static void main(String[] args) {

        int year = 1;
        int growth = 1;
        int treeSize = 0;
        int time = 10;

        for (int i = year; i <= time ; i++) {

            growth = 1;
            treeSize = i;

            if(i > 3 && i<= time) { //

                growth = growth + 1;
                treeSize +=1;
            }
                System.out.println("year " + i + " - growth" +" "+ growth +" cm"+ "\n" + "tree size: " + treeSize+ "cm");

            System.out.println();


                // for (int j = i ; j < 10 ; j++) {

                //   growth = 2;
                //  treeSize = j;


                //  System.out.println("year "+i+" growth :"+growth+"\n"+"tree size: "+treeSize);


            //  while (i > 4){

            //    growth = 2;
            // treeSize = i;

        }
    }
}









/*
The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10

 */