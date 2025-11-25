package DSP;

public class TestCalculator {
        public static void main(String[] args) {

                System.out.println("\n Magnets per minute =" + Materials.TargetMinToSecGreen(4000f) * 60f);
                System.out.println("\ntest=" + Materials.TargetMinToSecGreen(4000f));
                System.out.println("\nIron needed per second for 16000 magnets="
                                + Materials.ironOrePerSec((Materials.TargetMinToSecGreen(4000f)), 1) + "\n");
                System.out.println("Iron needed per Minute for 16000 magnets="
                                + Materials.ironOrePerSec((Materials.TargetMinToSecGreen(4000f)), 1) * 60f + "\n");
                System.out.println("Copper needed per Minute for 16000 magnets="
                                + Materials.copperOrePerSec(Materials.TargetMinToSecGreen(4000f), 1));
        }
}