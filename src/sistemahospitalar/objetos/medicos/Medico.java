package sistemahospitalar.objetos.medicos;

import sistemahospitalar.objetos.caracteristicasgerais.Pessoa;
import sistemahospitalar.objetos.caracteristicasgerais.Sexo;

public class Medico extends Pessoa {
    protected Especialidade especialidade;

    public Medico(String nome, Sexo sexo, int DATA_DE_NASCIMENTO, String CPF) {
        super(nome, sexo, DATA_DE_NASCIMENTO, CPF);
        this.especialidade = Especialidade.CLINICO_GERAL;
    }

    public Medico(){
        super();
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String print() {
        if (getSexo().equals(Sexo.MASCULINO)) {
            return "Dr. "+getNome()+" - "+getCPF()+"\n"+getEspecialidade();
        }
        return "Dra. "+getNome()+" - "+getCPF()+"\n"+getEspecialidade();
    }

}
