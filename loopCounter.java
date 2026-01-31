public class loopCounter {

    public static void countUp(int start, int end) {
        if (start > end) {
            System.out.println("Invalid range");
            return;
        }

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void countDown(int start, int end) {
        if (start < end) {
            System.out.println("Invalid range");
            return;
        }

        int i = start;
        while (i >= end) {
            System.out.println(i);
            i--;
        }
    }
    public static int countEvenNumbers(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void loopSelector(int option, int start, int end) {
        switch (option) {
            case 1:
                countUp(start, end);
                break;

            case 2:
                countDown(start, end);
                break;

            case 3:
                int evenCount = countEvenNumbers(start, end);
                System.out.println("Even numbers count: " + evenCount);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    public static void main(String[] args) {

        int option = 2;
        int start = 1;
        int end = 10;
        loopSelector(option, start, end);
    }
}
