import java.util.Scanner;
public class StringInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a string: ");
        String str1 = scan.nextLine();

        System.out.print("Type another string: ");
        String str2 = scan.nextLine();

        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
        int halfwayStr1 = lenStr1 / 2;
        int halfwayStr2 = lenStr2 / 2;
        String firstHalfStr1 = str1.substring(0, halfwayStr1);
        String secondHalfStr1 = str1.substring(halfwayStr1);
        String firstHalfStr2 = str2.substring(0, halfwayStr2);
        String secondHalfStr2 = str2.substring(halfwayStr2);
        int str2InStr1 = str1.indexOf(str2);

        if (lenStr1 > lenStr2) {
            System.out.println("\"" + str1 + "\" is longer than \"" + str2 + "\".");

        } else if (lenStr2 > lenStr1) {
            System.out.println("\"" + str2 + "\" is longer than \"" + str1 + "\".");

        } else {
            System.out.println("\"" + str2 + "\" and \"" + str1 + "\"" + " are of equal length.");

        }

        System.out.println();
        System.out.println("First string first half: " + firstHalfStr1);
        System.out.println("First string second half: " + secondHalfStr1);
        System.out.println("Second string first half: " + firstHalfStr2);
        System.out.println("Second string second half: " + secondHalfStr2);
        if (str2InStr1 != -1) {
            System.out.println("\"" + str2 + "\" is found at index " + str2InStr1 + " in \"" + str1 + "\"");
        } else {
            System.out.println("\"" + str2 + "\" is not found in \"" + str1 + "\"");
        }

        scan.close();
    }
}

