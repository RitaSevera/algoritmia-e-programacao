package FichaPratica09.Exercicio04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double Area () {
        double area = 3.14 * (this.raio * this.raio);
        return area; //podia ter feito só: return 3.14 * (this.raio * this.raio);
    }
    public double Circunferencia () {
        double circunferencia = 2 * 3.14 * this.raio;
        return circunferencia;
        //podia ter feito só: return 2 * 3.14 * this.raio;
    }
}
