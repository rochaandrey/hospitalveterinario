package sistemahospitalar.objetos.pacientes;

import sistemahospitalar.objetos.Pessoa;
import sistemahospitalar.objetos.Sexo;

public class Paciente extends Pessoa {
    Plano plano;

    public Paciente(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF, Plano plano) {
        super(nome, sexo, DATA_DE_NASCIMENTO, CPF);
        this.plano = plano;
    }

    public Paciente() {

    }
}
