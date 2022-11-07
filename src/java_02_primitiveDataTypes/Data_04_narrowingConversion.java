package java_02_primitiveDataTypes;

public class Data_04_narrowingConversion {


    public static void main(String[] args) {

        double d = 18.96;
        //int b = d; // invalid conversion to int, will throw a compile-time error
        int b2 = (int) d; // valid conversion to int, but result is truncated (gets rounded down)
        // This is type-casting
        // Now, b = 18
        System.out.println(b2);

    }
}
