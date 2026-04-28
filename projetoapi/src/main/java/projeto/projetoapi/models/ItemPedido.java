package projeto.projetoapi.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@JsonPropertyOrder({"id", "produto", "quantidade", "preco"})
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private produto produto;

    private Double quantidade;
    private Double preco;

}
