package dragon.me.chameleonAPI2.math;

public class ChameleonMath {


    /**
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of a and b.
     *
     * Added: 2.0.0
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; // Find the remainder
            a = b;         // Update a to b
            b = r;         // Update b to remainder
        }
        return a; // Return the last non-zero remainder
    }

}
