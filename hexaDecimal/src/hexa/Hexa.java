package hexa;
import java.util.*;
public class Hexa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a decimal number to conver in hexadecimal :");
        int d=s.nextInt();
        String h_digits="0123456789ABCDEF";
        String res="";
        if(d==0){
            System.out.println(0);
        }
        else{
        while (d>0) {
            int digit=d%16;
            res+=h_digits.charAt(digit);
            d/=16;   
        }
        System.out.println( "it's the primary amount :"+res);
        int n=res.length();
        System.out.print("it's the hexa decimal valu :");
        for(int b=n ; b>0;b--) {
            char x=res.charAt(b-1);
            System.out.print(x);
        }
        System.out.println();
    }
    }

}
