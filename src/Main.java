import classes.Carteira;
import classes.Transacao;
import classes.Usuario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Carteira carteira1, carteira2, carteira3;
        Usuario usuario1, usuario2, usuario3;
        Transacao transacao1, transacao2,transacao3,transacao4, transacao5, transacao6;

        usuario1 = new Usuario("usuario1","cpf1",1);
        usuario2 = new Usuario("usuario2","cpf2",2);
        usuario3 = new Usuario("usuario3","cpf3",3);

        carteira1 = new Carteira(usuario1,100, new Date());
        carteira2 = new Carteira(usuario2,100, new Date());
        carteira3 = new Carteira(usuario3,100, new Date());

        transacao1 = new Transacao(20,new Date(), carteira1, carteira2, false);
        transacao2 = new Transacao(34,new Date(), carteira3, carteira1, false);
        transacao3 = new Transacao(44.50,new Date(), carteira2, carteira1, false);
        transacao4 = new Transacao(78,new Date(), carteira2, carteira3, false);
        transacao5 = new Transacao(80,new Date(), carteira3, carteira2, false);
        transacao6 = new Transacao(25,new Date(), carteira3, carteira1, false);

        transacao1.atualizaCarteira(transacao1.getOrigem(), transacao1.getDestino(), transacao1.getValorTotal());
        transacao2.atualizaCarteira(transacao2.getOrigem(), transacao2.getDestino(), transacao2.getValorTotal());
        transacao3.atualizaCarteira(transacao3.getOrigem(), transacao3.getDestino(), transacao3.getValorTotal());
        transacao4.atualizaCarteira(transacao4.getOrigem(), transacao4.getDestino(), transacao4.getValorTotal());
        transacao5.atualizaCarteira(transacao5.getOrigem(), transacao5.getDestino(), transacao5.getValorTotal());
        transacao6.atualizaCarteira(transacao6.getOrigem(), transacao6.getDestino(), transacao6.getValorTotal());
    }
}
