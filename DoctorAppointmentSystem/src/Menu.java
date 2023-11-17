import java.util.Scanner;

public class Menu {

    {
        Scanner input = new Scanner(System.in);
        int choice;
        do {

            System.out.println("1: Admin\n" +
                    "2: Patient\n" +
                    "3: Doctor\n" +
                    "4: Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1:Login + \n" +
                            "2: Exit");
                    int adminLogin = input.nextInt();

                    switch (adminLogin) {
                        case 1:
                            //login code
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("invalid");
                    }

                case 2:
                    System.out.println("1:login + \n" +
                            "2: Exit");
                    int patientLogin = input.nextInt();

                    switch (patientLogin) {
                        case 1:
                            //patient code
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("invalid");
                    }
                case 3:
                    System.out.println("1:login + \n" +
                            "2: Exit");
                    int doctorLogin = input.nextInt();

                    switch (doctorLogin) {
                        case 1:
                            //doc code
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("invalid");
                    }
//comitted the code
            }
            while (choice != 4) ;

        }
    }
}