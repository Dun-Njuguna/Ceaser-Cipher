public class Encoding {

    public String encrypt(String input, int key){
        if(key > 26){
            key = key % 26;
        }else if(key < 0){
            key = (key % 26) + 26;
        }

        String cipherText = "";
        int cipherLength = input.length();
        for (int i = 0; i < cipherLength; i++){
            char ch = input.charAt(i);
            if (Character.isLetter(ch)){
                char newCharacter = (char)(ch+key);
                if (Character.isLowerCase(ch)){
                    if (newCharacter > 'z'){
                        cipherText += (char)(ch-(26-key));
                    }else{
                        cipherText += newCharacter;
                    }

                }else if (Character.isUpperCase(ch)){
                    if (newCharacter > 'Z'){
                        cipherText += (char)(ch-(26-key));
                    }else{
                        cipherText += newCharacter;
                    }
                }

            }else{

                cipherText += ch;
            }
        }

        return "true";
    }

}
