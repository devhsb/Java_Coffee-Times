public class leapYear {
    public static boolean isLeapYear(int year) {

        if(year >= 0 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }else{
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
