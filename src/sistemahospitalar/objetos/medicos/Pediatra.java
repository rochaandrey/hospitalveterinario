package sistemahospitalar.objetos.medicos;

import sistemahospitalar.objetos.Sexo;

public class Pediatra extends Medico {
    public Pediatra(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF) {
        super(nome, sexo, DATA_DE_NASCIMENTO, CPF);
        this.especialidade = Especialidade.PEDIATRA;
    }

    public Pediatra() {
        super();
    }
}
