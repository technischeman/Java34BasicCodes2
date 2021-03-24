package triangle;

public class main {
    public static void main(String[] args) {
        triangle triangle = new triangle();
        trianglewithparameters triangle1 = new trianglewithparameters(3, 4, 5);
        int perimeter = triangle.perimeter;
        int area = triangle.area;
        int perimeter1 = triangle1.perimeter;
        int area1 = triangle1.area;

        System.out.println("tiangle perimeter: " + perimeter);
        System.out.println("triangle area: " + area);
        System.out.println("triangle1 perimeter" + perimeter1);
        System.out.println("triangle1 area" + area1);
    }
}
