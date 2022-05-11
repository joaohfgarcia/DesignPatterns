package com.uniesp.Interface;

import com.uniesp.Entity.Pedido;

public interface IDesconto {

    Double calcular(Pedido pedido);

    void GoToProximo(IDesconto proximoCalculo);
}
