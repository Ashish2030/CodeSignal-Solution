/*The digitsProduct method takes an integer product as input and calculates the reversed value of the 
factors of product. It iterates from 9 down to 2, finding the factors and appending them to a string. 
If all factors are found and product becomes less than 2, it returns the reversed integer value of the 
factors; otherwise, it returns -1 to indicate that the product cannot be represented as a combination 
of single-digit factors.*/

public class Main {
    public static void main(String[] args) {
        int product = 72;
        int result = digitsProduct(product);
        System.out.println("Result: " + result);
    }
    
    static int digitsProduct(int product) {
        StringBuilder r = new StringBuilder();

        if (product < 9 && product > 0) {
            return product;
        } else if (product == 0) {
            return 10;
        } else {
            for (int i = 9; i > 1; i--) {
                if (product % i == 0) {
                    r.append(i);
                    product = product / i;
                    if (product % i == 0) {
                        i++;
                    }
                }
            }
        }

        if (product < 2) {
            return Integer.parseInt(r.reverse().toString());
        } else {
            return -1;
        }
    }
}
