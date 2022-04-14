import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\test1.csv"));
        ArrayList<Numbers> numbers = new ArrayList<>();
        String currentLine;
        while ((currentLine = br.readLine())!=null){
            String [] detailed = currentLine.split(";");
            if(detailed[0].equals("\"\""))
                continue;
            String num1 = detailed[0].substring(1, detailed[0].length()-1);
            String num2 = detailed[1].substring(1, detailed[1].length()-1);
            String num3 = detailed[2].substring(1, detailed[2].length()-1);

          //  System.out.println(num1+" "+num2+" "+num3);
            //получаем таблицу нужноного типа. num1..3 это столбцы.

            numbers.add(new Numbers(num1,num2,num3));
        }


       System.out.println(numbers);

        System.out.println();
        
      Object [] numArr = numbers.toArray();
        for (Object chis : numArr){
           System.out.println(chis);
       }


    }
}