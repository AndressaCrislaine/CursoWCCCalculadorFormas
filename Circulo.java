import java.util.Scanner;

public class Circulo implements CalculadorDeFormas {

    private Float raio;

    @Override
    public Float getArea() {
        // TODO Auto-generated method stub

        Float area;
        area = (float) (Math.PI * Math.pow(raio, 2));
        return area;
    }

    @Override
    public Float getPerimetro() {
        // TODO Auto-generated method stub
        Float perimetro;
        perimetro = (float) (2 * Math.PI * raio);
        return perimetro;
    }

    public static void main(final String[] args) {

        final Circulo circuloTeste = new Circulo();

        System.out.println("Insira o valor do raio:");
        final Scanner scanner = new Scanner(System.in);
        circuloTeste.raio = scanner.nextFloat();        
        System.out.println("A área do círculo é " + circuloTeste.getArea());
        System.out.println("O perímetro do círculo é " + circuloTeste.getPerimetro());
       
    }

}