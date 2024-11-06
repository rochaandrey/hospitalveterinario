package sistemahospitalar.objetos.medicos;

import sistemahospitalar.objetos.Sexo;

public class Dentista extends Medico {
    public Dentista(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF) {
        super(nome, sexo, DATA_DE_NASCIMENTO, CPF);
        this.especialidade = Especialidade.DENTISTA;
    }

    public Dentista() {
        super();
    }
}
