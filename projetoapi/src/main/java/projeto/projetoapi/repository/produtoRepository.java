package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.produto;

public interface produtoRepository extends JpaRepository<produto,String> {
}
