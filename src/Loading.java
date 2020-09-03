public class Loading {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 3;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        int summa = 0;
        int[] massa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            summa += massa[i];
        }
        System.out.println(summa);
        int le = 1;
        int sum2 = 0;
        while (le <= massa.length) {
            sum2 += massa[le - 1];
            le += 1;
        }
        System.out.println(sum2);
        int le2 = 1;
        int sum3 = 0;
        do {
            sum3 += massa[le2 - 1];
            le2 += 1;
        }
        while (le2 <= massa.length);
        System.out.println(sum3);
    }
}