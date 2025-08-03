import java.util.Scanner;

public class BJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] inputArr = input.toCharArray();
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i]<97)
                System.out.print((char)(32 + inputArr[i]));
            else
                System.out.print((char)(inputArr[i]-32));
        }
    }
}
