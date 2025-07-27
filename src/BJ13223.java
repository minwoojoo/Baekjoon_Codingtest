import java.util.Scanner;

public class BJ13223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] current_time = sc.nextLine().split(":");
        String[] drop_time = sc.nextLine().split(":");

        int current_hour = Integer.parseInt(current_time[0]);
        int current_minute = Integer.parseInt(current_time[1]);
        int current_second = Integer.parseInt(current_time[2]);

        int drop_hour = Integer.parseInt(drop_time[0]);
        int drop_minute = Integer.parseInt(drop_time[1]);
        int drop_second = Integer.parseInt(drop_time[2]);

        int current_total = 3600*current_hour+60*current_minute+current_second;
        int drop_total = 3600*drop_hour+60*drop_minute+drop_second;



        if (drop_total<current_total)
            drop_total += 3600*24;

        int final_total = drop_total-current_total;
        int final_hour = final_total/3600;
        int final_minute = final_total%3600/60;
        int final_second = final_total%60;

        if (drop_total == current_total) {
            final_hour = 24;
            final_minute = 0;
            final_second = 0;
        }

        System.out.printf("%02d:%02d:%02d", final_hour, final_minute, final_second);

    }
}
