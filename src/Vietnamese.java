import java.util.Scanner;

public class Vietnamese {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        String all = str.toLowerCase();

        int countW = countOccurrences(all, "w");
        int countAW = countOccurrences(all, "aw");
        int countOW = countOccurrences(all, "ow");
        int countDD = countOccurrences(all, "dd");
        int countEE = countOccurrences(all, "ee");
        int countOO = countOccurrences(all, "oo");
        int countAA = countOccurrences(all, "aa");

        countW -= countAW + countOW;

        System.out.println(countAA + countEE + countDD + countAW + countOW + countOO + countW);

    }

    public static int countOccurrences(String input, String vnword) {
        int count = 0;
        int index = input.indexOf(vnword);
        while (index != -1) {
            count++;
            index = input.indexOf(vnword, index + 1);
        }
        return count;
    }
}
