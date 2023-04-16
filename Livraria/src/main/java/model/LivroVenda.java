package model;

public class LivroVenda {
    int livro;
    Double preco ;
    private String nome;
    private Double desconto;

    public LivroVenda() {
    }
    public LivroVenda(int livro, Double preco,String nome,Double desconto) {
        this.livro=livro;
        this.preco = preco;
        this.nome=nome;
        this.desconto=desconto;
        
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
    public int getLivro() {
        return livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public Double getPreco() {
        return preco;
    }

  
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return """
               
               livro:""" + livro + "\n preco:" + preco +
                "\n nome:" + nome ;
    }

    public void SetPreco(Double preco) {
        
        this.preco=preco;
    }

    public String getQtd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    

   
    
   
    
}
