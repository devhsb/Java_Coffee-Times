public class Main {
    public static void main(String[] args) {
        System.out.println(paintJob.getPacketCount(3.4, 2.1, 1.5, 2));

        //without extra buckets
        System.out.println(paintJob.getPacketCount(7.25, 4.3, 2.35));

        //without width and height
        System.out.println(paintJob.getPacketCount(3.26, 0.75));

    }
}