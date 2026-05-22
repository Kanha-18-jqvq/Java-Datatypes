// package Java-Operator;

public class AllTypesOfOperator {
    public static void main(String[] args) {
        int a=10;
        int b=2;


        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println((a > b) && (b < 10));
        System.out.println((a < b) || (b < 10));
        System.out.println(!(a < b));

        // Assignment Operators
        System.out.println("\nAssignment Operators");

        int x = 20;

        x += 5;
        System.out.println("x += 5 : " + x);

        x -= 2;
        System.out.println("x -= 2 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        x /= 3;
        System.out.println("x /= 3 : " + x);

        x %= 2;
        System.out.println("x %= 2 : " + x);

        // Increment and Decrement
        System.out.println("\nIncrement and Decrement");

        int y = 5;

        y++;
        System.out.println("y++ : " + y);

        y--;
        System.out.println("y-- : " + y);

        // Bitwise Operators
        System.out.println("\nBitwise Operators");

        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));

        // Shift Operators
        System.out.println("\nShift Operators");

        System.out.println("a << 1 : " + (a << 1));
        System.out.println("a >> 1 : " + (a >> 1));

        // Ternary Operator
        System.out.println("\nTernary Operator");

        String result = (a > b) ? "a is Greater" : "b is Greater";

        System.out.println(result);
    }
}


    
