public class Main {

    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i <= n; i++) {
            System.out.println("N = " + i + " - " + " phi(N) = " + EMaxxMath.phi(i));
        }

        System.out.println(EMaxxMath.phi(7654321));
    }
}