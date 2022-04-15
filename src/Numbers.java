public class Numbers {
    private String num1;
    private String num2;
    private String num3;


    public Numbers(String num1, String num2, String num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
       // int [] x;
       // x = new int[]{Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3)};

    }

    @Override
    public String toString(){
        return num1+" "+num2+" "+num3;

    }


}
