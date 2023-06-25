
public class minutesToYearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long year = minutes / (365 * 24 * 60); // convert minutes to year
            long days = minutes % (365 * 24 * 60 ); // take the remained minutes that is 36000 = 25Days
            long remainedMinutesToDay = days / (24 * 60); // convert the remained minutes to day that is 36000 = 25Days
            System.out.println(minutes + " min = " + year + " y and " + remainedMinutesToDay + " d");
        }
    }
}
