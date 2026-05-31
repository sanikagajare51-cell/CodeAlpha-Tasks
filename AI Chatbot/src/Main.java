import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChatBot bot = new ChatBot();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("      ADVANCED AI CHATBOT");
            System.out.println("=================================");
            System.out.println("1. Start Chat");
            System.out.println("2. View Chat History");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    bot.startChat();
                    break;

                case 2:
                    bot.showHistory();
                    break;

                case 3:
                    System.out.println("Thank you for using the chatbot.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}




//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        ChatBot bot = new ChatBot();
//
//        int choice;
//
//        do {
//
//            System.out.println("\n=================================");
//            System.out.println("          AI CHATBOT");
//            System.out.println("=================================");
//            System.out.println("1. Start Chat");
//            System.out.println("2. View Chat History");
//            System.out.println("3. Exit");
//            System.out.print("Enter Choice: ");
//
//            choice = sc.nextInt();
//            sc.nextLine();
//
//            switch (choice) {
//
//                case 1:
//
//                    bot.startChat();
//                    break;
//
//                case 2:
//
//                    bot.showHistory();
//                    break;
//
//                case 3:
//
//                    System.out.println("Thank You For Using AI Chatbot!");
//                    break;
//
//                default:
//
//                    System.out.println("Invalid Choice!");
//            }
//
//        } while (choice != 3);
//
//        sc.close();
//    }
//}