package sistemahospitalar.objetos.caracteristicasgerais;

import sistemahospitalar.objetos.medicos.Dentista;
import sistemahospitalar.objetos.medicos.Medico;
import sistemahospitalar.objetos.pacientes.Paciente;
import java.util.ArrayList;
import java.util.List;

public class Listas{

    static List<Medico> arrayMedicos = new ArrayList<>();
    static List<Paciente> arrayPacientes = new ArrayList<>();

    public static void main(String[] args) {
        CrudListas.add(new Dentista("nome", Sexo.MASCULINO,121221,"2323872"));
        System.out.println(arrayMedicos);
    }


}
