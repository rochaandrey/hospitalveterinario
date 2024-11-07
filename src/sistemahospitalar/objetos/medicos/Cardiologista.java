package sistemahospitalar.objetos.medicos;

import sistemahospitalar.objetos.caracteristicasgerais.Sexo;

public class Cardiologista extends Medico {
    public Cardiologista(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF) {
        super(nome, sexo, DATA_DE_NASCIMENTO, CPF);
        this.especialidade = Especialidade.CARDIOLOGISTA;
    }

    public Cardiologista() {
        super();
    }
}
