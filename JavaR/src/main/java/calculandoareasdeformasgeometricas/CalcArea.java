package calculandoareasdeformasgeometricas;

public class CalcArea {
    public static void calculateArea(int number) {
        System.out.printf("Square area with side %d: %d\n", number, number*= number);
    }
    public static void calculateArea(int number, int number2) {

        System.out.printf("Rectangle area with length %d and width %d: %d\n",number, number2, number *= number2 );
    }
    public static void calculateArea(double number) {
        double radiusSquared = number * number;
        double valueOfπ = 3.14;
        double multiplyByTheValueOfπ = radiusSquared * valueOfπ ;

        System.out.printf("Circle area with radius %.1f: %.3f\n",number, multiplyByTheValueOfπ);
    }

    public static void main(String[] args) {

        calculateArea(5);          // square
        calculateArea(4, 6);       // rectangle
        calculateArea(2.5);        // circle
    }
}
