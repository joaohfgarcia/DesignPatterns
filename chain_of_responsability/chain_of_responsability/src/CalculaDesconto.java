import com.uniesp.Entity.*;
import com.uniesp.Interface.IDesconto;

public class CalculaDesconto {
    public static void main(String[] args) {

        final Item item = new Item();
        final Pedido pedido = new Pedido();

        for (int i=0; i<5 ; i++){
            item.setNome("Item "+i);
            item.setValor(10.00);
            pedido.addItem(item);
        }

        System.out.println(calculaDescontoDoPedido(pedido));
    }


    public static Double calculaDescontoDoPedido(Pedido pedido) {

        final IDesconto desconto50ouMais = new Desc50ouMaisItens();
        final IDesconto desconto10a49 = new Desc10a49Itens();
        final IDesconto desconto5a9 = new Desc5a9Itens();
        final IDesconto semDesconto = new SemDesconto();

        desconto5a9.GoToProximo(desconto10a49);
        desconto10a49.GoToProximo(desconto50ouMais);
        desconto50ouMais.GoToProximo(semDesconto);

        return desconto5a9.calcular(pedido);
    }
}
