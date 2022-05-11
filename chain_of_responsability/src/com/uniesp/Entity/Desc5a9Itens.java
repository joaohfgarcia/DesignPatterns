package com.uniesp.Entity;

import com.uniesp.Interface.IDesconto;

public class Desc5a9Itens implements IDesconto {
    private IDesconto proximoCalculo;

    @Override
    public Double calcular(Pedido pedido){
        if (pedido.getItens().size() >= 5 && pedido.getItens().size() < 10){
            Double valorPedido = pedido.getValor();
            return valorPedido - valorPedido*0.02;
        } else{
            return proximoCalculo.calcular(pedido);
        }
    }

    @Override
    public void GoToProximo(IDesconto proximoCalculo) {
        this.proximoCalculo = proximoCalculo;
    }

}