package sistemahospitalar.objetos.caracteristicasgerais;

import sistemahospitalar.objetos.medicos.Medico;
import sistemahospitalar.objetos.pacientes.Paciente;

import static sistemahospitalar.objetos.caracteristicasgerais.Listas.arrayMedicos;
import static sistemahospitalar.objetos.caracteristicasgerais.Listas.arrayPacientes;

public interface CrudListas {

    static void remover (Object o){
        if(o instanceof Medico){
            arrayMedicos.remove((Medico)o);
        }else if(o instanceof Paciente){
            arrayPacientes.remove((Paciente)o);
        }
    }

    static void add(Pessoa o){
        if(o instanceof Medico){
            arrayMedicos.add((Medico)o);
        }else if(o instanceof Paciente){
            arrayPacientes.add((Paciente)o);
        }
    }
}
