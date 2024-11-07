package sistemahospitalar.objetos.caracteristicasgerais;

import java.util.Objects;

public abstract class Pessoa {
    private String nome;
    private Sexo sexo;
    private final String CPF;
    private final int DATA_DE_NASCIMENTO;

    public Pessoa(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF) {
        this.nome = nome;
        this.sexo = sexo;
        this.DATA_DE_NASCIMENTO = DATA_DE_NASCIMENTO;
        this.CPF = CPF;
    }

    public Pessoa(){
        this.CPF = " ";
        this.DATA_DE_NASCIMENTO = 0;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public int getDATA_DE_NASCIMENTO() {
        return DATA_DE_NASCIMENTO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(CPF, pessoa.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(CPF);
    }
}
