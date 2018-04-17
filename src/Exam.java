import java.util.Scanner;

public class Exam {

    //http://acm.timus.ru/problem.aspx?space=1&num=1673

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long K = scanner.nextLong();

        if(isPrime(K)) {
            System.out.println(0);
            return;
        }

        for (long i = 0; ; i++) {

            if (phi(i) == K) {
                System.out.println(i);
                return;
            }

        }



    }

    public static long phi(long n) {
        long result = n;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;
                result -= result / i;
            }
        }
        if (n > 1)
            result -= result / n;
        return result;

    }

    static boolean isPrime(long n) {
        for (long i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

}
