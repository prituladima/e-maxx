final class EMathLong {

    private EMathLong() {
    }

    static long phi(long n) {
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

    static boolean is_prime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

}