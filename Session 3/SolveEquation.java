import javax.swing.JOptionPane;
import java.awt.*;

public class SolveEquation
{
    public static void main(String[] args) {
        String aStr = JOptionPane.showInputDialog("Please enter number a: ");
        double a = Double.parseDouble(aStr);

        String bStr = JOptionPane.showInputDialog("Please enter number b: ");
        double b= Double.parseDouble(bStr);

        double x = -b / a;
        JOptionPane.showMessageDialog(null , "            The answer of :  \n             a*x + b = 0 is...\n            " + x);
        System.out.println(x);
    }


}
