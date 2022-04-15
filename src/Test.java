import java.util.ArrayList;

public class Test {

   static Integer [] x = {10,14,17,24,10};
   static Integer [] y = {34,12,17,24,61};

    public static void teting(){

        int temp = 24;
        for(int i =0;i<x.length;i++){
           for(int z = 1; z< x.length;z++){
               if(x[i]==x[z]){
                   System.out.println("Match");
               }
           }
        }

    }

    public static void teting1(){
        ArrayList<Integer[]> number = new ArrayList<>();
        number.add(x);
        number.add(y);
        System.out.println(number.get(0));

    }

}
