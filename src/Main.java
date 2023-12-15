public class Main {
    public static void main(String[] args) {
        System.out.println(changeVariablesInt(5, 10));
        System.out.println(changeVariablesString("aaaa", "ssssssss"));
        System.out.println(changeVariablesTwoInt(55, 100));
        System.out.println(countWords("Привет мир и джава"));


        System.out.println(reversWord("absdefg"));
        String s = new  StringBuilder("absdefg").reverse().toString();
        System.out.println("так же реверс = " + s);

    }
    public static String reversWord(String line){
        System.out.print( line + " <=> " );
        String reversLine = "";

        for (int i = line.length() -1; i >= 0 ; i-- ){
            reversLine +=  line.charAt(i);
        }
        return reversLine;
    }

    public static int changeVariablesInt(int a, int b) {
        System.out.print("До [ a = " + a + " ; b = " + b + " ], после ");
        int c;
        c = a;
        a = b;
        b = c;

        System.out.print("a = " + a + " ; b = ");
        return b;
    }

    public static String changeVariablesString(String a, String b) {
        System.out.print("До [ a = " + a + " ; b = " + b + " ], после ");
        String c;
        c = a;
        a = b;
        b = c;

        System.out.print("a = " + a + " ; b = ");
        return b;
    }

    public static int changeVariablesTwoInt(int a, int b) {
        System.out.print("До [ a = " + a + " ; b = " + b + " ], после ");
        a += b;
        b = a - b;
        a = a - b;
        System.out.print("a = " + a + " ; b = ");
        return b;
    }

    public static String changeVariablesTwoString(String a, String b) {
        System.out.print("До [ a = " + a + " ; b = " + b + " ], после ");
        System.out.print("a = " + a + " ; b = ");
        return b;
    }

    public static int countWords(String text) {
        System.out.print("слов в тексте " + text + " = ");
        String[] word = text.split(" ");

        System.out.println(word);
        return word.length;
    }
}