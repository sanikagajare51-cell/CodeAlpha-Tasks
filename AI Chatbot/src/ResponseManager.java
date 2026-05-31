import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class ResponseManager {

    private Random random = new Random();

    public String getResponse(String userMessage) {

        userMessage = userMessage.toLowerCase().trim();

        // Greetings
        if (userMessage.contains("hello")
                || userMessage.contains("hi")) {

            return "Hello! How can I help you today?";
        }

        // Name
        else if (userMessage.contains("your name")) {

            return "My name is JavaBot.";
        }

        // How are you
        else if (userMessage.contains("how are you")) {

            return "I am doing great. Thanks for asking!";
        }

        // Date
        else if (userMessage.contains("date")) {

            return "Today's Date: " + LocalDate.now();
        }

        // Time
        else if (userMessage.contains("time")) {

            return "Current Time: " + LocalTime.now().withNano(0);
        }

        // Java
        else if (userMessage.contains("java")) {

            return "Java is an object-oriented programming language.";
        }

        // Python
        else if (userMessage.contains("python")) {

            return "Python is a popular programming language used in AI and Data Science.";
        }

        // OOP
        else if (userMessage.contains("oop")) {

            return "OOP stands for Object-Oriented Programming.";
        }

        // Internship
        else if (userMessage.contains("internship")) {

            return "An internship helps students gain practical experience.";
        }

        // College
        else if (userMessage.contains("college")) {

            return "College is a great place to learn and build skills.";
        }

        // Joke
        else if (userMessage.contains("joke")) {

            String[] jokes = {
                    "Why do programmers prefer dark mode? Because light attracts bugs.",
                    "Why was the Java developer sad? Because he didn't get arrays.",
                    "Debugging is like being a detective in a crime movie."
            };

            return jokes[random.nextInt(jokes.length)];
        }

        // Motivation
        else if (userMessage.contains("motivate")
                || userMessage.contains("motivation")) {

            String[] quotes = {
                    "Success comes from consistent effort.",
                    "Keep learning and keep growing.",
                    "Every expert was once a beginner."
            };

            return quotes[random.nextInt(quotes.length)];
        }

        // Bye
        else if (userMessage.contains("bye")) {

            return "Goodbye! Have a wonderful day.";
        }

        // Simple Math
        else if (userMessage.matches("\\d+\\s*[+\\-*/]\\s*\\d+")) {

            try {

                String expression =
                        userMessage.replaceAll("\\s+", "");

                char operator = '+';

                int index = -1;

                for (char c : expression.toCharArray()) {

                    if (c == '+' || c == '-' ||
                            c == '*' || c == '/') {

                        operator = c;
                        index = expression.indexOf(c);
                        break;
                    }
                }

                int num1 =
                        Integer.parseInt(
                                expression.substring(0, index));

                int num2 =
                        Integer.parseInt(
                                expression.substring(index + 1));

                switch (operator) {

                    case '+':
                        return "Answer: " + (num1 + num2);

                    case '-':
                        return "Answer: " + (num1 - num2);

                    case '*':
                        return "Answer: " + (num1 * num2);

                    case '/':
                        if (num2 == 0)
                            return "Cannot divide by zero.";

                        return "Answer: " +
                                ((double) num1 / num2);
                }

            } catch (Exception e) {

                return "Invalid calculation.";
            }
        }

        return "Sorry, I don't understand that question.";
    }
}






//import java.time.LocalDate;
//import java.time.LocalTime;
//
//public class ResponseManager {
//
//    public String getResponse(String userMessage) {
//
//        userMessage = userMessage.toLowerCase();
//
//        if (userMessage.contains("hello")
//                || userMessage.contains("hi")) {
//
//            return "Hello! How can I help you today?";
//        }
//
//        else if (userMessage.contains("your name")) {
//
//            return "My name is JavaBot.";
//        }
//
//        else if (userMessage.contains("how are you")) {
//
//            return "I am doing great. Thanks for asking!";
//        }
//
//        else if (userMessage.contains("date")) {
//
//            return "Today's Date: " + LocalDate.now();
//        }
//
//        else if (userMessage.contains("time")) {
//
//            return "Current Time: " +
//                    LocalTime.now().withNano(0);
//        }
//
//        else if (userMessage.contains("bye")) {
//
//            return "Goodbye! Have a nice day.";
//        }
//
//        else {
//
//            return "Sorry, I don't understand that question.";
//        }
//    }
//}