import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encoding encoding = new Encoding("","",22,"");

// encoding

        System.out.println("Add your string");
        String userString = scanner.nextLine();
        encoding.setMinput(userString);
        encoding.encrypt(userString,22);
        System.out.println("Input: " + encoding.getMinput() );
        System.out.println("Encoded: " + encoding.getResult());

// decoding

        Decoding decoding = new Decoding("","");
        String encoded = encoding.getResult();
        decoding.setEncoded(encoded);
        decoding.decode(encoded,22);
        System.out.println("Decoded: " + decoding.getDecoded());

    }
}