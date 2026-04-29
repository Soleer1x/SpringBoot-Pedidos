package projeto.projetoapi.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;
import projeto.projetoapi.enums.status;

import java.util.Date;

@Data
@Entity
@JsonPropertyOrder({"id", "cliente", "data", "status", "lista", "valorTotal"})
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private Date data;
    private status status;
    private String lista;
    private Double valorTotal;
}
