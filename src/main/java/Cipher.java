public class Cipher {

    private String minput;
    private int mkey;
    Boolean res = false;
    private String moutput;

    public Cipher(String input, String output, int key) {
        minput = input;
        moutput = output;
        mkey = key;
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
}