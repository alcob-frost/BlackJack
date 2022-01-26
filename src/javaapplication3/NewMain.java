package javaapplication3;

/**
 *
 * @author phine_gille352
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double rn = Math.random();
        int max = 10;
        int min = 0;
        int num = (int) (rn * max) + min;

        System.out.println(num);
    }

}
