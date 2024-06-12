package Programs;

public class Program_3 {
    public static void main(String[] args) {
        String time = "8:01:00AM"; 
        String militaryTime = convertToMilitaryTime(time);
        System.out.println(militaryTime);
    }

    public static String convertToMilitaryTime(String time) {
        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        String minutes = timeParts[1];
        String seconds = timeParts[2].substring(0, 2); 
        String period = timeParts[2].substring(2);

        if (period.equals("PM") && hour != 12) {
            hour += 12;
        } else if (period.equals("AM") && hour == 12) {
            hour = 0; 
        }

        String hourFormatted = String.format("%02d", hour);

        String result = hourFormatted + ":" + minutes + ":" + seconds;

        return result;
    }
}
