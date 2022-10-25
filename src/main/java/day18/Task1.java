package day18;

/// v.1
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int n = 0;

        System.out.println(recursionSum(numbers, n));
    }

    public static int recursionSum(int[] numbers, int n) {
        if (n == numbers.length)
            return 0;

        int sum = numbers[n];
        return sum + recursionSum(numbers, n + 1);
    }
}


/// v.2

//    public static void main(String[] args) {
//        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//        int n = numbers.length;
//
//        System.out.println(recursionSum(numbers, n));
//    }
//
//    public static int recursionSum(int[] numbers, int n) {
//        if (n == 0)
//            return 0;
//
//            int sum = numbers[n - 1];
//            return sum + recursionSum(numbers, n - 1);
//
//    }
//}

