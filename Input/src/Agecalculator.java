import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Agecalculator {

    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your date of birth: ");

        int i = Integer.parseInt(br.readLine().trim());

        System.out.print("Enter the current date: ");

        String nn=br.readLine();
        String y=nn.trim();
        int j = Integer.parseInt(y);

        int val= j-i;
        System.out.print(val);

    }
}
