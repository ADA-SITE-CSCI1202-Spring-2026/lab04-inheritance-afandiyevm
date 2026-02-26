public class MathDemo {
    static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int sum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    static float mean(int [] args) {
        return sum(args) / args.length;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MathDemo.min(1, 5));
    }
    }

