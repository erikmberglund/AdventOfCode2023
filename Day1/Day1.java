import java.util.Scanner;

/**
 * Day1
 */
public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char c;
        char[] number = new char[2];
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("Line is " + line);

            for (int i = 0; i < line.length(); i++) {
               c = line.charAt(i);
                if(Character.isDigit(c)) {
                    number[0] = c; 
                    break;
               }
            }
            for(int j = line.length()-1; j>=0 ; j--) {
                c = line.charAt(j);
                if (Character.isDigit(c)) {
                    number[1] = c;
                    break;
                }
            }
            System.out.println("number is " + new String(number));
            sum += Integer.parseInt(String.valueOf(number)); 
        }
        System.out.println("sum is " + sum);    
    }
}