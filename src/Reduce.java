public class Reduce {
    public static void main(String[] args) {
        System.out.println(countReduce(100));
    }
    static int reduce(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return n - 1;
    }
    static int countReduce(int n) {
        int count = 0;
        while (n != 0) {
            n = reduce(n);
            count++;
        }
        return count;
    }
}
