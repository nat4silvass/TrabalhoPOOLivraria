package model;

import javax.swing.JOptionPane;

public class Livros extends LivroVenda {
    private int id;
    private String titulo;
    private String editora;
    private String autor;
    private String anoDeLancamento;
    private String genero;
    private int paginas;
    private int qtdEstq;
    private Double preco;

    public Livros() {
    }

    public Livros(int id, String editora, String anoDeLancamento, 
            String genero, int paginas, int qtdEstq, String titulo, 
            String autor,Double preco) {
        this.id = id;
        this.editora = editora;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
        this.paginas = paginas;
        this.qtdEstq = qtdEstq;
        this.titulo = titulo;
        this.autor = autor;
        this.preco=preco;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getQtdEstq() {
        return qtdEstq;
    }

    public void setQtdEstq(int qtdEstq) {
        this.qtdEstq = qtdEstq;
    }

    @Override
    public String toString() {
        int quantidade = 0;
        if (qtdEstq > 0) {
            quantidade = qtdEstq;
        }else{
            JOptionPane.showMessageDialog(null, "Não temos o livro "+
                    getTitulo()
                    + " em estoque");
        }
        return "\n Livros " +
                "\nid:" + id +
                "\neditora:" + editora + 
                "\nanoDeLancamento:" + anoDeLancamento + 
                "\ngenero:" + genero +  
                "\npaginas:" + paginas +
                "\nqtdEstq:" + quantidade +
                 
                "\ntitulo:" + titulo + 
                " \nautor:" + autor  
                ;
    }

    public void setPreco(double preco) {
        this.preco=preco;
    }

   
}
