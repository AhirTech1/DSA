class EvenOdd {
    public static boolean isEven(int n)
    {
        // taking bitwise and of n with 1
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        int n = 15;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}