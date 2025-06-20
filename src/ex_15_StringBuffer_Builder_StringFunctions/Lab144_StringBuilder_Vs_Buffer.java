package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Sonali";
        String s1 = new String("Sonali");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Sonali");
        StringBuilder stringBuilder = new StringBuilder("Sonali");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
