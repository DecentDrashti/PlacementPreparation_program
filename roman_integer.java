import java.util.Scanner;

public class RomanToInteger {

    static int value(char r) {
        if (r == 'I') return 1;
        if (r == 'V') return 5;
        if (r == 'X') return 10;
        if (r == 'L') return 50;
        if (r == 'C') return 100;
        if (r == 'D') return 500;
        if (r == 'M') return 1000;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();

        int sum = 0;

        for (int i = 0; i < roman.length(); i++) {
            int curr = value(roman.charAt(i));

            if (i + 1 < roman.length() && curr < value(roman.charAt(i + 1)))
                sum -= curr;
            else
                sum += curr;
        }

        System.out.println(sum);
    }
}
