package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c = 'A';
        char b = '$';
        char d = '(';
        char e = ' ';
        System.out.println(c);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c + b + d + e);


        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carraige_return = '\r';
        char laugh = '\u1f60';
        System.out.println(laugh);


        System.out.println("Sonali" + new_line + "Kataria");
        System.out.println("Sonali" + tab_line + "Kataria");
        System.out.println("Sonali" + back_space + "Kataria");
        System.out.println("Sonali" + carraige_return + "Kataria");
    }
}