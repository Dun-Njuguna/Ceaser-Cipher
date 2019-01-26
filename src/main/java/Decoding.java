public class Decoding {
    private String encoded;
    private String decoded;

    public Decoding(String encod,String decod) {
        encoded = encod;
        decoded = decod;
    }


    public String getDecoded() {
        return decoded;
    }

    public void setDecoded(String decoded) {
        this.decoded = decoded;
    }

    public String getEncoded() {
        return encoded;
    }

    public void setEncoded(String encoded) {
        this.encoded = encoded;
    }

    public String decode(String input, int key){
        int cipherLength = input.length();
        for (int i = 0; i < cipherLength; i++){
            char ch = input.charAt(i);

            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch-key);
                    if (c < 'a'){
                        decoded += (char)(ch + (25-key));
                    }else{
                        decoded += c;
                    }
                }else if (Character.isUpperCase(ch)){
                    char c = (char)(ch-key);
                    if (c<'A'){
                        decoded += (char)(ch + (25-key));
                    }else{
                        decoded += c;
                    }
                }

            }else{

                decoded += ch;
            }

        }

        return "true";

    }

}
