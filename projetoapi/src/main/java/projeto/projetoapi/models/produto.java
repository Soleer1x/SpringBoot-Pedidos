package projeto.projetoapi.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import projeto.projetoapi.enums.categoria;

@Data
@Entity
@JsonPropertyOrder({"id", "nome", "descricao", "preco", "categoria"})
public class produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;
    private Double descricao;
    private Double preco;
    private categoria categoria;
}
