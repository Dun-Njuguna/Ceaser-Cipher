import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        Cipher userInput = new Cipher("sample", "sample", 26);
        System.out.println(userInput.getMinput());
        System.out.println("Add your string");
        String userString = myConsole.readLine();
        userInput.setMinput(userString);
        System.out.println(userInput.getMinput());

    }
}