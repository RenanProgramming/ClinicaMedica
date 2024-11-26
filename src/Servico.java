import java.util.ArrayList;

public class Servico {
    private ArrayList<Paciente>pacientes=new ArrayList<>();
    public void controleDeCadastro(Paciente p) {
        pacientes.add(p);
    }

    public ArrayList<Paciente>listar(){
        return pacientes;
    }

}
