import java.awt.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Percentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Please enter number a: ");
        double a = scan.nextDouble();
        System.out.print("Please enter number b: ");
        double b = scan.nextDouble();
        double percent = (b/a)*100;
        System.out.println(b+" is "+percent+"% of "+a);




    }

}
