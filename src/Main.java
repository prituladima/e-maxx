public class Main {

    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i <= n; i++) {
            System.out.println("N = " + i + " - " + " phi(N) = " + EMaxxMath.phi(i));
        }

        System.out.println(EMaxxMath.phi(7654321));

        long k = 1897876500909766664L;

        k--;
        long d = 0L;
        for (long ki = 1; ; ++ki) {
            long buf = EMaxxMathLong.phi(ki);
            if (k > buf)
                k -= buf;
            else {
                d = ki;
                break;
            }

        }

        System.out.println(d);

        long counter = d;
        int nn = 0;
        for (int i = 1; ;nn =  ++i) {
            if (EMaxxMathLong.gcd(d, i) == 1) {
                if(k!=0) k--;
                else break;
            }
        }

        System.out.println(nn-2 + "/" + d);


    }
}