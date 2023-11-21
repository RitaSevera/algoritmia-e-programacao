package FichaPratica09.Exercicio02;

public class Main {
    public static void main(String[] args) {

        Cao tobby = new Cao("Tobby", "pitbull");
        Cao zoey = new Cao("Zoey" , "labrador");
        Cao mel =  new Cao("Mel", "bulldog");

        System.out.println("A Zoey ladra assim");
        zoey.ladrar();
        System.out.println("A Mel ladra assim");
        mel.ladrar();

        System.out.println();

        tobby.setLadrar("Wof Wof Wof");//mudei permanentemente o ladrar da mel
        System.out.println("O Tobby ladra assim");
        tobby.ladrar();
    }
}
