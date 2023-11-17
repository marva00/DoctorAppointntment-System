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
            switch (choice){
                case 1:
                    System.out.println("1:Login + \n" +
                            "2: Exit");
                    int adminLogin = input.nextInt();

                        switch (adminLogin){
                            case 1:
                                //login code

                        }


            }

        } while (choice != 4);
    }
}
