package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.pedido;

public interface pedidoRepository extends JpaRepository<pedido,String> {
}
