
//9. Să se afişeze pentru şirurile de caractere „Acesta este primul SIR”,
// „cel de-al doilea sir de caractere”. Să se aplice metodele clasei java.lang.String pentru afişarea caracterelor
// şi a codului Unicode a caracterelor de pe poziţia 5 şi 15,
// compararea celor două şiruri, transformarea primului numai cu litere mici,
// lungimea, înlocuirea lui „SIR” din primul şir cu „string”.

//        10. Să se afişeze următorul şir de caractere „sir in oglinda" citit în ordine inversă.

//        11. Să se testeze metodele clasei java.lang.Math.
import java.io.*;
import java.lang.String;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) { //ex 9
        /*
         //Pozitia
         String  sir1 = "Acesta este primul SIR", sir2 ="cel de-al doilea sir de caractere";
         char ch1 = sir1.charAt(5), c1 = sir2.charAt(5);
         char ch2 = sir1.charAt(15),c2 = sir2.charAt(15);
         System.out.println(ch1 + " " + ch2);

         //Unicode
         int uni1=sir1.codePointAt(5);
         int uni2 =sir1.codePointAt(15);
         System.out.println(uni1 + " " +uni2);

         //Comparare
         int compar = sir1.compareTo(sir2);
         System.out.println( compar);

         //Litere mici
         //sir1.toLowerCase();
         System.out.println(sir1.toLowerCase());
         System.out.println(sir1.length());
         System.out.println(sir1.replace("SIR","sirul"));
         System.out.println(sir1);
         */

        //ex10
        //Oglindita
        /*String o = "sir in oglinda";
        String og = "";
        char ch;
        for (int i = 0; i < o.length(); i++) {
            ch = o.charAt(i);
            og = ch + og;
        }
        System.out.println("Oglindita"+ og);
        */

        //ex11
        int a = 30;
        int b=-8;
        float p = 2.5F;
        double d = 222.64635;
        System.out.println(Math.max(a,b));
        System.out.println(Math.abs(b));
        System.out.println(Math.abs(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(p));
        System.out.println(Math.sqrt(121));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.multiplyExact(a,b));






    }
}