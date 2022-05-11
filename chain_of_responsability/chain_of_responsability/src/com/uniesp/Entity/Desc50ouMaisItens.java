package com.uniesp.Entity;

import com.uniesp.Interface.IDesconto;

public class Desc50ouMaisItens implements IDesconto {
    private IDesconto proximoCalculo;

    @Override
    public Double calcular(Pedido pedido){
        if (pedido.getItens().size() >= 50){
            Double valorPedido = pedido.getValor();
            return valorPedido - valorPedido*0.05;
        } else{
            return proximoCalculo.calcular(pedido);
        }
    }

    @Override
    public void GoToProximo(IDesconto proximoCalculo) {
        this.proximoCalculo = proximoCalculo;
    }

}