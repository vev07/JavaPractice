package Lesson2103;

public class Main {
    public static void main(String[] args) {



        String word = "word";
        StringBuffer stringBuffer = new StringBuffer(word);
        String word2 = reversWordMethod(word);
        char x = 'r';
        System.out.println("this is method revers -"+reversWordMethod(word));
        System.out.println(word.equals(word2));
        foundChar(word,x);
        System.out.println(putOnChar(word,'$',3));
        String nWord = word.substring(0,3)+x+word.substring(4,word.length());
        System.out.println(nWord);





    }
    public static String reversWordMethod(String word) {
        String reversWord = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversWord += word.charAt(i);
        }
        return reversWord;
    }
    public static void foundChar(String word, char x) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) {
                System.out.println("index char is -"+i);
            }

        }

    }
    public static String putOnChar(String word, char x, int j) {
        String newWord = "";
        if(word.length() < j) {
            System.out.println("number I is more then arrays word");
        } else {
            for (int i = 0; i < j; i++) {
                newWord += word.charAt(i);
            }
                    newWord += x;
            for (int i = j; i < word.length(); i++) {
                newWord +=  word.charAt(i);
            }

            }
        return newWord;
    }

}
