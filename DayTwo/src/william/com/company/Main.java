package william.com.company;


import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter integer number ");
        int size =  in.nextInt();
        int[] grades = new int[size];

        System.out.println("Please " + size + " number. Press enter after each");
        for (int i=0; i<grades.length; i++) {
            grades[i] = in.nextInt();
        }
        in.close();

        for (int i=0; i<grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}
