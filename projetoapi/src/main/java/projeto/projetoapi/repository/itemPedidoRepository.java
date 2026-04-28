package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.ItemPedido;

public interface itemPedidoRepository extends JpaRepository<ItemPedido,String> {
}
