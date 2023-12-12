class Main {
  public static void main(String[] args) {
    System.out.println("Gott Mit Uns");
  }
}

// Antiga classe cliente
class Cliente {
    private String cpf;
    private String nome;
    private int salario;
    private Endereco endereco;

  
    //Construtor
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    //Sets
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //método que vai ser overloaded
    public int calcularRendimentoTotal(int meses) {
        return salario * meses;
    }
    public int calcularRendimentoTotal(int meses, double percentualBonus) {
        // Calcula o rendimento
        int rendimentoTotal = calcularRendimentoTotal(meses); 
        //Rendimento vai ser calculado com o primeiro método, para aproveita-lo

        int bonus = (int) (rendimentoTotal * (percentualBonus / 100)); // Calcula o valor do bônus
        return rendimentoTotal + bonus; //Entrega rendimento e bonus
    }
}
