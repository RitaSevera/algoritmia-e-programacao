package FichaPratica09.Exercicio03;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double Area () {

        double area = this.altura * this.largura;
        System.out.println(area);
        return area;
    }

    public double Perimetro () {

        double perimetro = (this.altura + this.largura) * 2;
        System.out.println(perimetro);
        return perimetro;
    }
}
