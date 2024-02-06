import java.io.*;
import java.math.BigInteger;

public class Zadanie1 {
    public static void main(String[] args) {
        final String fileName = "liczby.txt";
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        BigInteger number4 = new BigInteger("0");
        BigInteger number5 = new BigInteger("0");;

        try(FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr)){
            number1 = Integer.parseInt(br.readLine());
            number2 = Integer.parseInt(br.readLine());
            number3 = Integer.parseInt(br.readLine());
            number4 = new BigInteger(br.readLine());
            number5 = new BigInteger(br.readLine());

        } catch (IOException e){

        }

        System.out.println(number1 + number2 + number3);
        System.out.println(number4.add(number5));
    }
}
