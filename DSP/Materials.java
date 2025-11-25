package DSP;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Materials {
    /*
     * Part of the Protoype for rate calculator
     * This is under the DSP prototype
     * 
     * 
     * 
     * 
     * 
     */

    // These functions take Target per minute of the product and the amount of
    // material per product
    // and calculate the material needed per second in a double rounded to 2 decimal
    // places
    public static double resourcePerSec(double TargetPerMin, double PerProduct) {
        double resourcePerSec = (TargetPerMin * PerProduct) * 60;
        return (BigDecimal.valueOf((resourcePerSec)).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }

    public static double ironOrePerSec(double TargetPerMin, double PerProduct) {
        double ironOrePerSec = (TargetPerMin * PerProduct);
        return (BigDecimal.valueOf((ironOrePerSec)).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }

    public static double copperOrePerSec(double TargetPerMin, double PerProduct) {
        double copperPerSec = (TargetPerMin * PerProduct) * 60;
        return (BigDecimal.valueOf((copperPerSec)).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }

    public static double siliconOrePerSec(double TargetPerMin, double PerProduct) {
        double siliconPerSec = (TargetPerMin * PerProduct);
        return (BigDecimal.valueOf((siliconPerSec)).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }

    public static double stonePerSec(double TargetPerMin, double PerProduct) {
        double stonePerSec = (TargetPerMin * PerProduct);
        System.out.println("Calculating stone per second: " + stonePerSec);
        return (BigDecimal.valueOf((stonePerSec)).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }

    public static double TargetMinToSecGreen(float x) {
        // simple implementation to return a double based on x
        float magnetsPerSec = (x / 15f);
        return (BigDecimal.valueOf((double) magnetsPerSec).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }
}
