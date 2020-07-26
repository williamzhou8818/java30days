package william.com.company;

import java.util.Scanner;

public class Main {

    public static  Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter you name: ");
//        String s = in.nextLine();

//        int i = 0; // init
//        while (i < 10) { // condition
//            System.out.println("i is: " + i);
//            i++; // update
//        }
//
//        for (int i=0; i<10; i++) {
//            System.out.println("i is: " + i);
//        }
        int i = 0;
        do {
            System.out.println("i is: " + i);
            i++;
        } while(i < 10);

//        if (s.equals("Caleb")) {
//            System.out.println("Hey Caleb");
//        } else if (s.equals("Sally")) {
//            System.out.println("Hey Sally");
//        } else {
//            System.out.println("You're not welcome here");
//        }

//        switch (s) {
//            case "Caleb":
//                System.out.println("Hey Caleb");
//                break;
//            case "Sally":
//                System.out.println("Hey Sally");
//            default:
//                System.out.println("You not welcome here");
//        }

        in.close();


    }
}
