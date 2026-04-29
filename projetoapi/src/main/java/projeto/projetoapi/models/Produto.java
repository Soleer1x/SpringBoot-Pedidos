package projeto.projetoapi.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;
import projeto.projetoapi.enums.Categoria;

@Data
@Entity
@JsonPropertyOrder({"id", "nome", "descricao", "preco", "categoria"})
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;
    private Double descricao;
    private Double preco;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;
}
