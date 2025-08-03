import java.util.Arrays;
import java.util.Scanner;

public class BJ1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        char[] input1Arr = input1.toCharArray();
        char[] input2Arr = input2.toCharArray();
        int count = 0;

        for(int i = 0; i<input1Arr.length; i++) {
            for (int j = 0; j<input2Arr.length; j++) {
                if (input1Arr[i] == input2Arr[j]) {
                    input1Arr[i] = input2Arr[j] = '0';
                    break;
                }

            }
        }

        for(int i = 0; i<input1Arr.length; i++) {
            if (input1Arr[i] != '0')
                count +=1;
        }
        for(int i = 0; i<input2Arr.length; i++) {
            if (input2Arr[i] != '0')
                count +=1;
        }

        System.out.println(count);
    }
}