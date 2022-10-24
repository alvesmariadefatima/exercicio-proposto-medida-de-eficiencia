package mariadefatima;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
        this.nome=nome;
    }
}