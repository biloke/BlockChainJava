package classes;

import java.util.Date;

public class Transacao
{
    double valorTotal;
    Date data;
    Carteira origem;
    Carteira destino;
    boolean concluida;

    public Transacao(double valorTotal, Date data, Carteira origem, Carteira destino, boolean concluida) {
        setValorTotal(valorTotal);
        setData(data);
        setOrigem(origem);
        setDestino(destino);
        setConcluida(concluida);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Carteira getOrigem() {
        return origem;
    }

    public void setOrigem(Carteira origem) {
        this.origem = origem;
    }

    public Carteira getDestino() {
        return destino;
    }

    public void setDestino(Carteira destino) {
        this.destino = destino;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "valorTotal=" + getValorTotal() +
                ", data=" + getData() +
                ", origem=" + getOrigem() +
                ", destino=" + getDestino() +
                ", concluida=" + isConcluida() +
                '}';
    }
}
