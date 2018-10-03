import java.math.*;

public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(double dividend, double divisor) {
        return dividend / divisor;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(double base, int exp) {
        /* Set initial result to be just the number */
        double res = base;

        if (exp == 0) { //if exp is 0, it is always 1
            return 1;
        }

        if (base == 0) { //if base is 0 and exp is not 0, return 0
            return 0;
        }

        if (exp == 1) { //if exp is 1, return base
            return base;
        }

        /* Determine if the exponent is negative */
        if (exp < 0) { // exp is negative
            exp *= -1;
            for (int i = 1; i < exp; i++) { //it has already been squared so count from 1
                res = res * base;
            }
            return 1 / res;

        } else { // exp is positive
            for (int i = 1; i < exp; i++) {
                res = res * base;
            }
            return res;
        }

    }    
}