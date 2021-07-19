package classes;

import java.util.Date;

public class Carteira
{
    Usuario usuario;
    double saldo;
    Date dataAtualizacao;

    public Carteira(Usuario usuario, double saldo, Date dataAtualizacao) {
        setUsuario(usuario);
        setSaldo(saldo);
        setDataAtualizacao(dataAtualizacao);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double mostrarSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public boolean credita(double valor) {
        return true;
    }

    public boolean dedita(double valor) {
        return true;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "usuario=" + getUsuario() +
                ", saldo=" + mostrarSaldo() +
                ", dataAtualizacao=" + getDataAtualizacao() +
                '}';
    }
}
