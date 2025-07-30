class FindLCM1 {
    static int lcm (int a, int b) {
        int g = Math.max(a,b);
        int s = Math.min(a,b);

        for (int i=g; i < a*b; i+=g) {
            if (i%s == 0)
                return i;
        }
        return a*b;
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a,b));
    }
}