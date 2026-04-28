package projeto.projetoapi.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import projeto.projetoapi.enums.status;

import java.util.Date;

@Data
@Entity
@JsonPropertyOrder({"id", "cliente", "data", "status", "lista", "valorTotal"})
public class pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String cliente;
    private Date data;
    private status status;
    private String lista;
    private Double valorTotal;
}
