package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.Pedido;

public interface pedidoRepository extends JpaRepository<Pedido,String> {
}
