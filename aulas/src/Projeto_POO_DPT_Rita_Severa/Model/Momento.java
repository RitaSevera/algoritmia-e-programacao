package Projeto_POO_DPT_Rita_Severa.Model;

public enum Momento {
    MANHA("Manhã"),
    MEIO_DIA("Meio-dia"),
    TARDE("Tarde"),
    NOITE("Noite");

    private final String descricao;

    Momento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
