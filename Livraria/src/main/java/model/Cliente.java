package model;

public class Cliente extends Endereco {
    private String nome;
    private String cpf;
    

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

    @Override
  public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() 
                + "\nPaís: " + pais + "\nEstado: " + estado + "\nCidade: "
                + "" + cidade + "\nBairro: " + bairro + "\nRua: " 
                + rua + "\nNúmero: " + numero;
    }
}
    
    

