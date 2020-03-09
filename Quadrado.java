import java.util.Scanner;

public class Quadrado extends Retangulo{

    private Float base;


    public Float getArea(){

        Float area;
        area = base*base;
        return area;
    }

    public Float getPerimetro(){

        Float area;
        area = 4*base;
        return area;
    }

    public static void main(final String[] args) {

        Quadrado quadradoTeste = new Quadrado();

        System.out.println("Insira o valor da base do quadrado:");
        Scanner scannerBase = new Scanner(System.in);
        quadradoTeste.base = scannerBase.nextFloat();

        System.out.println("A área do Quadrado é " + quadradoTeste.getArea());
        System.out.println("o perímetro do Quadrado é " + quadradoTeste.getPerimetro());

    }
}