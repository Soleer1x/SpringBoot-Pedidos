package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.cliente;

public interface clienteRepository extends JpaRepository<cliente,String> {
}
