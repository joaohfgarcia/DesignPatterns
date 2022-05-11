package com.uniesp.Entity;

import com.uniesp.Interface.IDesconto;

public class Desc10a49Itens implements IDesconto {
    private IDesconto proximoCalculo;

    @Override
    public Double calcular(Pedido pedido){
        if (pedido.getItens().size() >= 10 && pedido.getItens().size() < 50){
            Double valorPedido = pedido.getValor();
            return valorPedido - valorPedido*0.03;
        } else{
            return proximoCalculo.calcular(pedido);
        }
    }

    @Override
    public void GoToProximo(IDesconto proximoCalculo) {
        this.proximoCalculo = proximoCalculo;
    }
}
