import java.util.ArrayList;

class FloorCeil {

    // Function to compute floor of a / b
    public static int floorDiv(int a, int b) {
        int q = a / b;

        // adjust down if signs differ and not divisible
        if ((a ^ b) < 0 && a % b != 0) {
            q--;
        }
        return q;
    }

    // Function to compute ceil of a / b
    public static int ceilDiv(int a, int b) {
        int q = a / b;

        // adjust up if signs same and not divisible
        if ((a ^ b) > 0 && a % b != 0) {
            q++;
        }
        return q;
    }

    // Function to return both floor and ceil in an ArrayList
    public static ArrayList<Integer> divFloorCeil(int a, int b) {
        ArrayList<Integer> res = new ArrayList<>();

        res.add(floorDiv(a, b));
        res.add(ceilDiv(a, b));

        return res;
    }

    public static void main(String[] args) {
        int a = -7, b = 2;

        ArrayList<Integer> res = divFloorCeil(a, b);
        System.out.println(res.get(0) + " " + res.get(1));
    }
}