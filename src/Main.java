import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print(getCapitalize("stop RIGHT there"));
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        System.out.println(getCapitalize(inStr));
    }

    public static String getCapitalize(String str){
        // "stop right there"
        // [stop, right, there]
        String[] splittedStr = str.split(" " );
        for( int i = 0; i < splittedStr.length; i++ ) {
            splittedStr[i] = ( Character.toUpperCase( splittedStr[ i ].charAt(0) ) ) + ( splittedStr[ i ].substring(1).toLowerCase() );
        }
        return String.join(" ", splittedStr);
    }
}