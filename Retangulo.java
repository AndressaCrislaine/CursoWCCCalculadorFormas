import java.util.Scanner;

public class Retangulo implements CalculadorDeFormas {

    private Float base;
    private Float altura;

    @Override
    public Float getArea() {
        // TODO Auto-generated method stub   
        Float area;
        area = base*altura;
        return area;
    }

    @Override
    public Float getPerimetro() {

        // TODO Auto-generated method stub
        Float perimetro;
        perimetro = 2*(base + altura);
        return perimetro;
    }

    public static void main(String[] args) {

        Retangulo retanguloTeste = new Retangulo();
        
        System.out.println("Insira o valor da base do retângulo:");
        Scanner scannerBase = new Scanner(System.in);
        retanguloTeste.base = scannerBase.nextFloat();

        System.out.println("Insira o valor da altura do retângulo:");
        Scanner scannerAltura = new Scanner(System.in);
        retanguloTeste.altura = scannerAltura.nextFloat();
        
        System.out.println("A área do Retângulo é:  " + retanguloTeste.getArea());
        System.out.println("O perímetro do Retângulo é: " + retanguloTeste.getPerimetro());

    }


}