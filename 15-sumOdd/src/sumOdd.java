//find odd numbers from range of numbers and calculate sum of them.

public class sumOdd {

    //main
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10));
    }

    //find odd number
    public static boolean isOdd(int number){
        if(number > 0 && number % 2 != 0){
            return true;
        }
        return false;
    }

    //add odd numbers
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start>0 && end > 0 && end>=start) {
            for(int i=start; i<=end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
