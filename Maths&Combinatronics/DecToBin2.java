class DecToBin2 {

    // Recursive function to convert decimal to binary
    static void decToBinaryRec(int n, StringBuilder bin) {
        // Base Case
        if (n == 0)
            return;

        // Recur for smaller bits.
        decToBinaryRec(n / 2, bin);

        // Add MSB of current number to the binary string
        bin.append(n % 2);
    }

    // Function to convert decimal to binary
    static String decToBinary(int n) {
        if (n == 0)
            return "0";

        StringBuilder bin = new StringBuilder();
        decToBinaryRec(n, bin);
        return bin.toString();
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(decToBinary(n));
    }
}