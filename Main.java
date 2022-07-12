public class Main {

    // datatype
    int x;
    byte a;
    short b;
    long c;
    float f;
    double d;
    char g;;
    boolean h;

    public static void main(String[] args) {
        Main m = new Main();

        System.out
                .println("x " + m.x + " a " + m.a + " b " + m.b + " c " + m.c + " f " + m.f + " d " + m.d + " g " + m.g
                        + " h " + m.h);

        // typecasting

        // implicit type casting 

        m.c = m.x;

        System.out.println("Initializing c with x " + m.c + " " + m.x + "Implicit typecassting");

        // Explicit Type casting

        m.x = (int) m.c;

        System.out.println("Explicit type cating " + " x " + m.x + " c " + m.c);

    }

}
