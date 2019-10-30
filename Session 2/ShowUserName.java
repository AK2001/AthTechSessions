import java.util.Scanner;


public class ShowUserName {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.print("Please enter when you were born: ");
        int birthyear = scan.nextInt();
        int age = (2019 - birthyear);
        System.out.println("Hello, " + name +"! You are "+ age +" years old.");



    }
}
