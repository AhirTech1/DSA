class DivBy13A3 {
    static boolean divBy13(String s) {
        int rem = 0;
        for(int i = 0; i < s.length(); i++) {
            rem = (rem * 10 + (s.charAt(i) - '0')) % 13;
        }
        return (rem == 0);
    }

    public static void main (String[] args) {
        String s = "2911285";
        if (divBy13(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}