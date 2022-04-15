import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\test.csv"));
      //  ArrayList<Numbers> numbers = new ArrayList<>();//15.04
        ArrayList<String> string_numbers = new ArrayList<>();
        String currentLine;
        while ((currentLine = br.readLine())!=null){
            String [] detailed = currentLine.split(";");
            if(detailed[0].equals("\"\""))
                continue;
            String num1 = detailed[0].substring(1, detailed[0].length()-1);
            String num2 = detailed[1].substring(1, detailed[1].length()-1);
            String num3 = detailed[2].substring(1, detailed[2].length()-1);
            string_numbers.add(num1);
            string_numbers.add(num2);
            string_numbers.add(num3);
            //-----
           // System.out.println(num1+" "+num2+" "+num3);
            //получаем таблицу нужноного типа. num1..3 это столбцы.
          //  numbers.add(new Numbers(num1,num2,num3));//15.04
        }
        //System.out.println(string_numbers);
     //  System.out.println(numbers);//15.04




        
      Object [] numArr = string_numbers.toArray();//15.04
        for (Object chis : numArr){//15.04
           System.out.print(chis);//15.04
        }

      //  Test.teting();
    }
}