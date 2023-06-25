public class megaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else {
            int fixedNumber = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes +"kb = " + fixedNumber + "Mb And " + remainder + "kb");
        }
    }
}
