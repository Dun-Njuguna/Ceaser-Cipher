public class Encoding {

    private String minput;
    private int mkey;
    Boolean res = false;
    private String moutput;
    private String result;

    public Encoding(String input, String output, int key, String mresult) {
        minput = input;
        moutput = output;
        mkey = key;
        result = mresult;
    }

    public boolean textInput(String input){

        for (int i = 0; i < input.length(); i++)
            if (Character.isDigit(input.charAt(i)) == false){
                res = true;
            }else {
                res = false;
            }
        return res;
    }


    public boolean textOutput(String output){
        return true;
    }

    public String getMinput() {
        return minput;
    }

    public void setMinput(String minput) {
        this.minput = minput;
    }

    public int getMkey() {
        return mkey;
    }

    public void setMkey(int mkey) {
        this.mkey = mkey;
    }

    public String getMoutput() {
        return moutput;
    }

    public void setMoutput(String moutput) {
        this.moutput = moutput;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



    public String encrypt(String input, int key){
        int cipherLength = input.length();
        for (int i = 0; i < cipherLength; i++){
            char ch = input.charAt(i);

            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch+key);
                    if (c>'z'){
                        result += (char)(ch - (25-key));
                    }else{
                       result += c;
                    }
                }else if (Character.isUpperCase(ch)){
                    char c = (char)(ch+key);
                    if (c>'Z'){
                        result += (char)(ch - (25-key));
                    }else{
                        result += c;
                    }
                }

            }else{

                result += ch;
            }

        }

        return "true";

    }

}
