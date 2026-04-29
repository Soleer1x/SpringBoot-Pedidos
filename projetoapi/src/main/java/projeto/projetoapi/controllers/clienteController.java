package projeto.projetoapi.controllers;

import org.springframework.web.bind.annotation.*;
import projeto.projetoapi.models.Cliente;
import projeto.projetoapi.service.clienteService;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class clienteController {

    private clienteService clienteService;

    public clienteController(clienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("{id}")
    public Cliente findById(@PathVariable String id){
        return clienteService.findById(id);
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente){
        return clienteService.criar(cliente);
    }

    @PutMapping("{id}")
    public Cliente atualizar(@PathVariable String id , @RequestBody Cliente cliente){
        cliente.setId(id);
        return clienteService.atualizar(id , cliente);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        clienteService.deleteById(id);
    }
}
