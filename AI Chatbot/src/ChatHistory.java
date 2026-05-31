import java.util.ArrayList;

public class ChatHistory {

    private ArrayList<String> history;

    public ChatHistory() {
        history = new ArrayList<>();
    }

    public void addMessage(String message) {
        history.add(message);
    }

    public void showHistory() {

        if (history.isEmpty()) {
            System.out.println("No chat history available.");
            return;
        }

        System.out.println("\n===== CHAT HISTORY =====");

        for (String message : history) {
            System.out.println(message);
        }
    }
}







//import java.util.ArrayList;
//
//public class ChatHistory {
//
//    private ArrayList<String> messages;
//
//    public ChatHistory() {
//        messages = new ArrayList<>();
//    }
//
//    public void addMessage(String message) {
//        messages.add(message);
//    }
//
//    public void showHistory() {
//
//        if (messages.isEmpty()) {
//            System.out.println("No chat history found.");
//            return;
//        }
//
//        System.out.println("\n===== CHAT HISTORY =====");
//
//        for (String message : messages) {
//            System.out.println(message);
//        }
//    }
//}