public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            if (isMultiple(i)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    static boolean isMultiple(int n) {
        if (n <= 0) {
            return false;
        }
        if (n % 3 == 0) {
            return true;
        }
        if (n % 5 == 0) {
            return true;
        }
        return false;
    }
}
