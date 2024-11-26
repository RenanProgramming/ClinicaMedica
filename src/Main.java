import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Medico m = new Medico();
        Paciente paciente = new Paciente();
        Consulta c = new Consulta();
        Servico s = new Servico();

        int r;
        int resposta;

        System.out.println("Para iniciar o cadastro, digite 1, e para encerrar a operação, digite 0: ");
        r = input.nextInt();


        do {
            switch (r) {

                case 0:
                    break;
                case 1:

                    do {
                        System.out.println("Digite 1 para cadastrar o médico, 2 para cadastrar o paciente, 3 para cadastrar uma consulta, 4 para listar os pacientes e 0 para encerrar: ");
                        resposta = input.nextInt();
                            switch (resposta) {

                                case 0:
                                    break;

                                case 1:
                                    System.out.println("Digite o nome do médico: ");
                                    m.setNome(input.next());

                                    System.out.println("Digite a idade: ");
                                    m.setIdade(input.nextInt());

                                    System.out.println("Digite o CPF do médico: ");
                                    m.setCpf(input.next());

                                    System.out.println("Digite o RG do médico: ");
                                    m.setRg(input.next());

                                    System.out.println("Digite o telefone do médico: ");
                                    m.setTelefone(input.next());

                                    System.out.println("Digite o CRM do médico: ");
                                    m.setCrm(input.nextInt());

                                    System.out.println("Digite a especialidade do médico: ");
                                    m.setEspecialidade(input.next());

                                    System.out.println(m.toString());

                                    break;

                                case 2:

                                    Paciente paciente = new Paciente();

                                    System.out.println("Digite o nome do paciente: ");
                                    paciente.setNome(input.next());

                                    System.out.println("Digite a idade: ");
                                    paciente.setIdade(input.nextInt());

                                    System.out.println("Digite o CPF do paciente: ");
                                    paciente.setCpf(input.next());

                                    System.out.println("Digite o RG do paciente: ");
                                    paciente.setRg(input.next());

                                    System.out.println("Digite o telefone do paciente: ");
                                    paciente.setTelefone(input.next());

                                    System.out.println("Digite os sintomas do paciente: ");
                                    paciente.setSintomas(input2.nextLine());

                                    System.out.println(paciente.toString());
                                    s.controleDeCadastro(paciente);

                                    break;

                                case 3:
                                    System.out.println("Cadastrando a consulta no sistema... ");
                                    c.atendimento(m,paciente);
                                    System.out.println("Consulta realizada com sucesso! ");
                                    System.out.println(c.toString());
                                    break;

                                case 4:
                                    System.out.println(s.listar());

                            }
                    }while (resposta != 0);
                    break;
                default:
                    break;



            }
            System.out.println("Para iniciar o cadastro, digite 1, e para encerrar a operação, digite 0: ");
            r = input.nextInt();
        }while (r == 1);

    }
}