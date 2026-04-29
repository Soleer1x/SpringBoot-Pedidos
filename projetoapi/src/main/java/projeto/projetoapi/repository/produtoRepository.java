package projeto.projetoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.projetoapi.models.Produto;

public interface produtoRepository extends JpaRepository<Produto,String> {
}
