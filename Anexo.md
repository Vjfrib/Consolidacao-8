# Consolidação 5

Implemente uma classe Cliente em Java que possua quatro atributos: cpf, nome, salário e endereço (este um tipo já existente – crie se necessário for). Nesta classe, deve haver um construtor que receba valores para os atributos cpf e nome. Ainda na classe Cliente, deve haver um método que calcule o valor total do rendimento de um cliente em um determinado período (em quantidade de meses), que deve ser recebido como parâmetro do método em questão.

## Código que usei

```
import java.util.Scanner;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String cpf = scanner.nextLine();
        String nome = scanner.nextLine();

      //Novo cliente
        Cliente cliente = new Cliente(cpf, nome);

        int salario = scanner.nextInt();
        cliente.setSalario(salario);

        // Dados para o endereço
        String rua = scanner.nextLine(); 
        String cidade = scanner.nextLine();
        String estado = scanner.nextLine();
        String cep = scanner.nextLine();

        Endereco endereco = new Endereco(rua, cidade, estado, cep);
        cliente.setEndereco(endereco);


    }
}

//classe previa

class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }



  class Cliente {
  private String cpf;
  private String nome;
  private int salario;
  private Endereco endereco;

  public Cliente(String cpf, String nome) {
      this.cpf = cpf;
      this.nome = nome;
  }

  public void setSalario(int salario) {
      this.salario = salario;
  }

  public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
  }

  public int calcularRendimentoTotal(int meses) {
      return salario * meses;
  }

```