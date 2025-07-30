class FindLCM2 {
    static int gcd (int a, int b) {
        return (b == 0) ? a : gcd(b,a%b);
    }

    static int lcm (int a, int b) {
        return (a / (gcd(a,b)) * b);
    }

    public static void main (String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a,b));
    }
}