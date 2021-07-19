package classes;

public class Usuario
{
    String nome;
    String cpf;
    int Id;

    public Usuario(String nome, String cpf, int id) {
        setNome(nome);
        setCpf(cpf);
        setId(Id);
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String mostrarDados() {
        return "Usuario{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", Id=" + getId() +
                '}';
    }
}
