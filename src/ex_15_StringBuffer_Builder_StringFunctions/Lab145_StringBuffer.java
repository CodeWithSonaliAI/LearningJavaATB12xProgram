package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Sonali");
        sb.append(" Kataria");
        System.out.println(sb);

        String s1="Sonali";
        s1=s1.concat(" Kataria");
        System.out.println(s1);
    }
}
