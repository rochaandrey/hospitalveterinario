package sistemahospitalar.objetos.pacientes;

public enum Plano {
    SUS ("SUS"),
    PARTICULAR_SILVER ("Particular Silver"),
    PARTICULAR_GOLD ("Particular Gold");

    private final String descricao;

    Plano(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
