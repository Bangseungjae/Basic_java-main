package week01;

public class jogun {
    public static void main(String[] args) {

        calc Calc = new calc(10);

        System.out.println(Calc.getA());
        Calc.setA(20);
        System.out.println(Calc.getA());
    }
}
