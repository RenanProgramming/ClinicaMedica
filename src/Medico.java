public class Medico extends Pessoa{

    private int crm;
    private String especialidade;
    private double salario;

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Medico{" +
                "crm=" + crm +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
