package projeto.projetoapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.projetoapi.models.ItemPedido;
import projeto.projetoapi.service.itemPedidoService;

import java.util.List;

@RestController
@RequestMapping("itenspedido")
public class itemPedidoController {

    private itemPedidoService itemPedidoService;

    public itemPedidoController(itemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }

    @GetMapping
    public List<ItemPedido> findAll(){
        return itemPedidoService.findAll();
    }

    @GetMapping("{id}")
    public ItemPedido findById(@PathVariable String id){
        return itemPedidoService.findById(id);
    }

    @PostMapping
    public ItemPedido save(ItemPedido itemPedido){
        return itemPedidoService.criar(itemPedido);
    }

    @PutMapping("{id}")
    public ItemPedido atualizar(@PathVariable String id, @RequestBody ItemPedido itemPedido){
        return itemPedidoService.atualizar(id, itemPedido);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        itemPedidoService.deleteById(id);
    }
}