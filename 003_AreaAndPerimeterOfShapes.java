import java.util.Scanner;
class AreaAndPerimeterOfShapes {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the radius of circle: ");
        double radiusOfCircle = scanner.nextDouble();

        System.out.println("Please enter the length of rectangle: ");
        double lengthOfRect = scanner.nextDouble();

        System.out.println("Please enter the width of rectangle: ");
        double widthOfRect = scanner.nextDouble();

        System.out.println("Please enter the length of first side of triangle: ");
        double side1OfTriangle = scanner.nextDouble();

        System.out.println("Please enter the length of second side of triangle: ");
        double side2OfTriangle = scanner.nextDouble();

        System.out.println("Please enter the length of third side of triangle: ");
        double side3OfTriangle = scanner.nextDouble();

        double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
        double perimeterOfCircle = 2 * Math.PI * radiusOfCircle;

        double areaOfRect = lengthOfRect * widthOfRect;
        double perimeterOfRect = 2 * (lengthOfRect + widthOfRect);

        double perimeterOfTri = side1OfTriangle + side2OfTriangle + side3OfTriangle;
        double semiPerimeterOfTri = perimeterOfTri / 2;
        double areaOfTri = Math.sqrt(semiPerimeterOfTri * Math.abs(semiPerimeterOfTri - side1OfTriangle) * Math.abs(semiPerimeterOfTri - side2OfTriangle) * Math.abs(semiPerimeterOfTri - side3OfTriangle));

        System.out.printf("Area and Perimeter of Circle of radius: %.2f = %.2f, %.2f%n", radiusOfCircle, areaOfCircle, perimeterOfCircle);
        System.out.printf("Area and Perimeter of Rectangle of length: %.2f and width: %.2f = %.2f, %.2f%n", lengthOfRect, widthOfRect, areaOfRect, perimeterOfRect);
        System.out.printf("Area and Perimeter of Triangle with sides of length: %.2f, %.2f and %.2f = %.2f, %.2f%n", side1OfTriangle, side2OfTriangle, side3OfTriangle, areaOfTri, perimeterOfTri);

        scanner.close();
    }
    
}
