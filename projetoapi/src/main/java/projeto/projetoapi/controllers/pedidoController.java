package projeto.projetoapi.controllers;

import org.springframework.web.bind.annotation.*;
import projeto.projetoapi.models.Pedido;
import projeto.projetoapi.repository.pedidoRepository;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class pedidoController {

    private pedidoRepository pedidoRepository;

    public pedidoController(pedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping
    public List<Pedido> findAll(){
        return pedidoRepository.findAll();
    }

    @GetMapping("{id}")
    public Pedido findById(@PathVariable String id){
        return pedidoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pedido save(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    @PutMapping("{id}")
    public Pedido atualizar(@PathVariable String id, @RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        pedidoRepository.deleteById(id);
    }
}
