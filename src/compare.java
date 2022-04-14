public class compare {

    public static void lineCompare(){
        String simpleString = "This is simple string";
        String simpleString2 = "This is 2 simple string";

        String [] sAr = {"123","000","200"};
        String [] sAr2 = {"124","001","200"};
        String [] sAr3 = {"123","000","200"};

        for(String index : sAr){
            System.out.println(index);
        }

        System.out.println(sAr==sAr2);
        System.out.println(sAr==sAr3);

        System.out.println(sAr.equals(sAr2));
        System.out.println(sAr.equals(sAr3));
    }
}
