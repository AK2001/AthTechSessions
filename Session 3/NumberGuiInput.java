import javax.swing.JOptionPane;


public class NumberGuiInput {
    public static void main(String[] args) {
        String ageStr = JOptionPane.showInputDialog("Please enter your age: "); //ΠΑΝΤΑ δέχεται τη τιμή σε μορφή String!
        //το showInputDialog πάντα επιστρέφει String
        int age = Integer.parseInt(ageStr); //μετατρέπει την τιμή που του δόθηκε σε INT!

        String heightStr = JOptionPane.showInputDialog("Please enter your height: ");
        double height = Double.parseDouble(heightStr);

    }


}