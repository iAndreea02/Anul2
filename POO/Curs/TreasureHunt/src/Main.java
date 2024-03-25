
import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          //  Scanner in = new Scanner(System.in);
        try {
            String line;
            File myObj = new File("D:/Facultate/POO/Curs/TreasureHunt/src/line.txt");
            Scanner myReader = new Scanner(myObj);
            int i=0;
            while (myReader.hasNextLine()) {
                 line = myReader.nextLine();
                //System.out.println((i++)+" "+line);
                char min ='a';int ok=0;
                for (char arg : line.toCharArray()){


                    if (arg>=min) {
                        min = arg;

                    }
                    else {
                        //System.out.println("Nu am gasit nmk aici la "+line);
                        ok=0;
                        break;
                    }
                    ok=1;

                }
                if(ok==1){
                    System.out.println(line);

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
