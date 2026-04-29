package projeto.projetoapi.controllers;

import org.springframework.web.bind.annotation.*;
import projeto.projetoapi.models.Produto;
import projeto.projetoapi.service.produtoService;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class produtoController {

    private produtoService produtoService;

    public produtoController(produtoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("{id}")
    public Produto findById(@PathVariable String id){
        return produtoService.findById(id);
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto){
        return produtoService.criar(produto);
    }

    @PutMapping("{id}")
    public Produto atualizar(@PathVariable String id , @RequestBody Produto produto){
        return produtoService.atualizar(id , produto);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        produtoService.deleteById(id);
    }
}
