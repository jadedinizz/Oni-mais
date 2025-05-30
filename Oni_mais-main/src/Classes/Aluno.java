package Classes;

import java.util.Set;
import java.util.EnumSet;

public class Aluno extends Pessoa {
    protected String instituicao;
    protected EnumSet<Dias> diasSelecionados;

    public Aluno(String CPF, String nome, int idade, String email, String telefone, String endereco, String instituicao, EnumSet<Dias> diasSelecionados) {
        super(CPF, nome, idade, email, telefone, endereco);
        this.instituicao = instituicao;
        this.diasSelecionados = diasSelecionados;
    }

    public void setDiasSelecionados(EnumSet<Dias> diasSelecionados) {
        this.diasSelecionados = diasSelecionados;
    }

    public EnumSet<Dias> getDiasSelecionados() {
        return diasSelecionados;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void adicionarDia(Dias diaDeAula){
        diasSelecionados.add(diaDeAula);
    }

}
