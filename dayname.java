import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dayname {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String strtday = input.nextLine().trim();
        int givendate = input.nextInt();
        Map<String, Integer> dayindias = new HashMap<>();
        dayindias.put("Monday", 0);
        dayindias.put("Tuesday", 1);
        dayindias.put("Wednesday", 2);
        dayindias.put("Thursday", 3);
        dayindias.put("Friday", 4);
        dayindias.put("Saturday", 5);
        dayindias.put("Sunday", 6);
        int strtindex = dayindias.get(strtday);
        int targetindex = (strtindex + (givendate - 1)) % 7;
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String targetday = daysOfWeek[targetindex];
        System.out.println(targetday);
    }
}