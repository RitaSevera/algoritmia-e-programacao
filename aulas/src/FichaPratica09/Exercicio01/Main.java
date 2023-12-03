package FichaPratica09.Exercicio01;

public class Main {
    public static void main(String[] args) {

        Pessoa rita = new Pessoa("Rita", 26, 1.68);
        Pessoa nuno = new Pessoa("Nuno", 27, 1.84);

        System.out.println("Nome: " + rita.getNome());//sempre que quero ter informação uso get
        System.out.println("Idade: " + rita.getIdade());
        System.out.println("Altura: " + rita.getAltura());
        System.out.println();
        System.out.println("Nome: " + nuno.getNome());
        System.out.println("Idade: " + nuno.getIdade());
        System.out.println("Altura: " + nuno.getAltura());
    }
}
