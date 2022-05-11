package com.uniesp.Entity;

import com.uniesp.Interface.IDesconto;

public class SemDesconto implements IDesconto {
    private IDesconto proximoCalculo;

    @Override
    public Double calcular(Pedido pedido){
        return pedido.getValor();
    }

    @Override
    public void GoToProximo(IDesconto proximoCalculo) {
    }
}

