import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file = new File("D:\\1.txt");
        try {
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            line = br.readLine();
            System.out.println(line);
            boolean b = true;

            while (b) {

                Scanner vVod = new Scanner(System.in);
                String s = vVod.nextLine();
                switch (s) {
                    case "\"Start\"":
                        System.out.println("Start");
                        break;
                    case "\"Stop\"":
                        b = false;
                        System.out.println("Stop");
                        break;
                    case "3":
                        break;
                    default:
                        Random rand = new Random();
                        System.out.println(rand.nextInt());
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
