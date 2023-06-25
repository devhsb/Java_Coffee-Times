
public class numberOf_Days_inMonth {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }else {
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if( (month >= 1 && month <=12) && (year >= 1 && year <= 9999 )) {
            switch (month) {
                // months that have 31 days
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                // months that have 30 days
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                // month 2 that have 29 days in leap year, and 28 days when it's not leap year
                case 2:
                    if(isLeapYear(year)){
                        return 29;
                    }else {
                        return 28;
                    }
                default:
                    return -1;
            }
        }

        return -1;
    }

}



