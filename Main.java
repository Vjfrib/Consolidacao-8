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

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int calcularRendimentoTotal(int meses) {
        return salario * meses;
    }

    // Método sobrecarregado com percentual de bônus
    public int calcularRendimentoTotal(int meses, double percentualBonus) {
        // Calcula o rendimento total sem o bônus
        int rendimentoTotal = calcularRendimentoTotal(meses);

        // Calcula o valor do bônus
        int bonus = (int) (rendimentoTotal * (percentualBonus / 100));

        // Adiciona o bônus ao rendimento total
        return rendimentoTotal + bonus;
    }
}
