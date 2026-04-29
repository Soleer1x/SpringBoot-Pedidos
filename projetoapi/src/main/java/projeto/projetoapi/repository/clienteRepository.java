package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.Cliente;

public interface clienteRepository extends JpaRepository<Cliente,String> {
}
