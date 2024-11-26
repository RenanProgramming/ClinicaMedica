public class Paciente extends Pessoa {

    private String sintomas;

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Paciente{" +
                "sintomas='" + sintomas + '\'' +
                '}';
    }
}
