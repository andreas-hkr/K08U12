import java.util.Scanner;

public class Main {
    static double sin(double x) {
        double t = x;
        double n = 1;
        double sum = 0;

        while (Math.abs(t) >= 0.00001) {
            sum += t;
            n += 2;
            t = -t*x*x/n/(n-1);
        }
        return sum;
    }

    public static void main (String[] arg) {
        // Beräkna sin(x) med hjälp av en Maclaurin-serie. Tricket är att inte beräkna
        // varje term för sig utan att utgå från föregående (annars kommer det att ta lång tid).

        Scanner input = new Scanner(System.in);
        System.out.print("Vänligen ange x: ");
        double x = input.nextDouble();

        System.out.println("sin(x) = " + sin(x));
    }
}