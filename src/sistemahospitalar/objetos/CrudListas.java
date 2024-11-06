package sistemahospitalar.objetos;

import sistemahospitalar.objetos.medicos.Medico;
import sistemahospitalar.objetos.pacientes.Paciente;

import static sistemahospitalar.objetos.Listas.arrayMedicos;
import static sistemahospitalar.objetos.Listas.arrayPacientes;

public interface CrudListas {

    static void adicionar(Object o){
        if(o instanceof Medico){
            arrayMedicos.add((Medico)o);
        }else if(o instanceof Paciente){
            arrayPacientes.add((Paciente)o);
        }
    }

    static void remover (Object o){
        if(o instanceof Medico){
            arrayMedicos.remove((Medico)o);
        }else if(o instanceof Paciente){
            arrayPacientes.remove((Paciente)o);
        }
    }
}
