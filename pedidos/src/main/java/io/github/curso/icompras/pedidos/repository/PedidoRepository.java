package io.github.curso.icompras.pedidos.repository;

import io.github.curso.icompras.pedidos.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Long> {

}
