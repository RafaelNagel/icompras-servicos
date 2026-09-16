package io.github.curso.icompras.pedidos.controller.dto;

import io.github.curso.icompras.pedidos.model.enums.TipoPagamento;

public record DadosPagamentoDTO(
        String dados,
        TipoPagamento tipoPagamento
) {
}
