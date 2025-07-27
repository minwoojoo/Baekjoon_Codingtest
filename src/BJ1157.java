import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {
        int max = 0;
        int max_index = 0;
        char[] alpha = new char[26];
        boolean isOne = true;
        Scanner sc = new Scanner(System.in);


        char[] input = sc.nextLine().toCharArray();


        for (int i =0; i<input.length; i++) {
            if ('A'<=input[i] && input[i]<='Z')
                alpha[input[i]-'A']++;
            else if('a'<=input[i] && input[i]<='z')
                alpha[input[i]-'a']++;
        }

        for (int i = 0; i<26; i++) {
            if (max<alpha[i]) {
                max = alpha[i];
                max_index = i;
            }
        }

        for (int i = 0; i<26; i++) {
            if (alpha[max_index] == alpha[i] && i!=max_index) {
                isOne = false;
                break;
            }
        }
        if(isOne)
            System.out.println((char)('A'+max_index));
        else
            System.out.println("?");
    }
}
