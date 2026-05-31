import java.util.Scanner;

public class ChatBot {

    private ChatHistory history;
    private ResponseManager responseManager;

    public ChatBot() {

        history = new ChatHistory();
        responseManager = new ResponseManager();
    }

    public void startChat() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== CHAT STARTED =====");
        System.out.println("Type 'bye' to end the chat.");

        while (true) {

            System.out.print("You: ");
            String userMessage = sc.nextLine();

            history.addMessage("You: " + userMessage);

            String response =
                    responseManager.getResponse(userMessage);

            System.out.println("Bot: " + response);

            history.addMessage("Bot: " + response);

            if (userMessage.equalsIgnoreCase("bye")) {
                break;
            }
        }
    }

    public void showHistory() {
        history.showHistory();
    }
}






//import java.util.Scanner;
//
//public class ChatBot {
//
//    private ChatHistory history;
//    private ResponseManager responseManager;
//
//    public ChatBot() {
//
//        history = new ChatHistory();
//        responseManager = new ResponseManager();
//    }
//
//    public void startChat() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("\n===== CHAT STARTED =====");
//        System.out.println("Type 'bye' to end chat.");
//
//        while (true) {
//
//            System.out.print("You: ");
//            String userMessage = sc.nextLine();
//
//            history.addMessage("You: " + userMessage);
//
//            String response =
//                    responseManager.getResponse(userMessage);
//
//            System.out.println("Bot: " + response);
//
//            history.addMessage("Bot: " + response);
//
//            if (userMessage.equalsIgnoreCase("bye")) {
//                break;
//            }
//        }
//    }
//
//    public void showHistory() {
//        history.showHistory();
//    }
//}