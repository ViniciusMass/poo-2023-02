public class Livro {
    private String nome;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String nome, String autor, int ano, String editora) { // construtor Livro
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public String getNome() { // getset nome
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getAutor() { // getset autor
        return autor;
    }

    public void setAutor(String novoAutor) {
        autor = novoAutor;
    }

    public int getAno() { // getset ano
        return ano;
    }

    public void setAno(int novoAno) {
        ano = novoAno;
    }

    public String getEditora() { // getset editora
        return editora;
    }

    public void setEditora(String novoEditora) {
        editora = novoEditora;
    }

    public String toString() { // exibição dos dados de um livro
        return "Nome: " + nome + "\n Autor(a): " + autor + "\n Ano: " + ano + "\n Editora: " + editora;
    }
}