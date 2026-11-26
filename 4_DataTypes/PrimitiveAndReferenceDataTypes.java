import java.util.Arrays;

/**
 * Program 4: Demonstrates all 8 primitive data types in Java,
 * their memory sizes and ranges, reference data types, and type casting.
 */
class SamplePerson {
    String name;
    int age;

    SamplePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PrimitiveAndReferenceDataTypes {
    public static void main(String[] args) {
        // 1. All 8 Primitive Data Types (declaration and initialization)
        byte byteVal = 120;
        short shortVal = 30000;
        int intVal = 100000;
        long longVal = 9000000000L;
        float floatVal = 3.14f;
        double doubleVal = 99.987654;
        char charVal = 'J';
        boolean booleanVal = true;

        System.out.println("=== 8 Primitive Data Types: Values ===");
        System.out.println("byte    : " + byteVal);
        System.out.println("short   : " + shortVal);
        System.out.println("int     : " + intVal);
        System.out.println("long    : " + longVal);
        System.out.println("float   : " + floatVal);
        System.out.println("double  : " + doubleVal);
        System.out.println("char    : " + charVal);
        System.out.println("boolean : " + booleanVal);

        // 2. Memory Size and Range of Numeric Data Types
        System.out.println("\n=== Numeric Data Types: Memory Size & Range ===");
        System.out.printf("%-8s | %-6s | %-6s | %-22s | %-22s%n",
                "Type", "Bytes", "Bits", "Min Value", "Max Value");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-8s | %-6d | %-6d | %-22d | %-22d%n",
                "byte", Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-8s | %-6d | %-6d | %-22d | %-22d%n",
                "short", Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-8s | %-6d | %-6d | %-22d | %-22d%n",
                "int", Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-8s | %-6d | %-6d | %-22d | %-22d%n",
                "long", Long.BYTES, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-8s | %-6d | %-6d | %-22e | %-22e%n",
                "float", Float.BYTES, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-8s | %-6d | %-6d | %-22e | %-22e%n",
                "double", Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-8s | %-6d | %-6d | %-22d | %-22d%n",
                "char", Character.BYTES, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.println("boolean  : JVM-dependent (stores true or false)");

        // 3. Reference Data Types (String, Array, Class)
        String greeting = "Hello, Java!";
        int[] scores = {85, 90, 95};
        SamplePerson person = new SamplePerson("Ananya", 20);

        System.out.println("\n=== Reference Data Types ===");
        System.out.println("String : " + greeting);
        System.out.println("Array  : " + Arrays.toString(scores));
        System.out.println("Class  : SamplePerson{name='" + person.name + "', age=" + person.age + "}");

        // 4. Type Casting (Widening and Narrowing)
        int wholeNum = 42;
        double widenedNum = wholeNum; // Implicit widening: int -> double

        double decimalNum = 42.89;
        int narrowedNum = (int) decimalNum; // Explicit narrowing: double -> int

        System.out.println("\n=== Type Casting ===");
        System.out.println("Widening  (int 42 -> double)    : " + widenedNum);
        System.out.println("Narrowing (double 42.89 -> int) : " + narrowedNum);
    }
}
