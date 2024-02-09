// we set n to 5. The shapeArea method is called, passing n as an argument. 
// The method checks if n is less than 0. If it is, the method returns 0 to indicate an invalid input. 
// Otherwise, the method calculates the area of the shape using the formula (n * n) + ((n - 1) * (n - 1)). 
// In our example, the area will be 25 + 16 = 41. 

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int area = shapeArea(n);
        System.out.println("Area: " + area);
    }
    
    public static int shapeArea(int n) {
        if (n < 0) {
            return 0;
        } else {
            return (n * n) + ((n - 1) * (n - 1));
        }
    }
}
