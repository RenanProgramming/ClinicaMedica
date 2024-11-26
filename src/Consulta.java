public class Consulta {

    private Medico m;
    private Paciente p;

    public void atendimento(Medico m, Paciente p) {
        this.m = m;
        this.p = p;

    }

    @Override
    public String toString() {
        return "Consulta{" +
                "m=" + m +
                ", p=" + p +
                '}';
    }
}
