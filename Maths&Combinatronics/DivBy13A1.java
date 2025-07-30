public class DivBy13A1 {
    static boolean divBy13(String s) {
        int num = Integer.parseInt(s);
        return (num%13 == 0);
    }

    public static void main (String[] args) {
        String s = "2911285";
        boolean isDivisible = divBy13(s);

        if(isDivisible) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}