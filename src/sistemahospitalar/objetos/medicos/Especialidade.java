package sistemahospitalar.objetos.medicos;

public enum Especialidade {
    DENTISTA("Dentista"),
    CLINICO_GERAL("Clínico Geral"),
    PEDIATRA("Pediatra"),
    ORTOPEDISTA("Ortopedista"),
    CARDIOLOGISTA("Cardiologista");

    private final String descricao;

    Especialidade(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
