package sistemahospitalar.objetos.medicos;

import sistemahospitalar.objetos.Sexo;

public class Ortopedista extends Medico {
    public Ortopedista(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF) {
        super(nome, sexo, DATA_DE_NASCIMENTO, CPF);
        this.especialidade = Especialidade.ORTOPEDISTA;
    }

    public Ortopedista() {
        super();
    }
}
