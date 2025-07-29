import java.util.*;

class DecToBin1 {
    static String decToBinary(int n) {
        StringBuilder bin = new StringBuilder();

        while (n > 0) {
            int bit = n % 2;
            bin.append((char) ('0' + bit));
            n /= 2;
        }

        // reverse the string
        bin.reverse();
        return bin.toString();
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(decToBinary(n));
    }
}