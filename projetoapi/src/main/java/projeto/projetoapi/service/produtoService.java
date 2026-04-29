package projeto.projetoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.projetoapi.models.Produto;
import projeto.projetoapi.repository.produtoRepository;

import java.util.List;

@Service
public class produtoService {

    @Autowired
    private produtoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(String id){
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto criar(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto atualizar(String id , Produto produto){
        if(produtoRepository.existsById(id)){
            produto.setId(id);
            return produtoRepository.save(produto);
        } else {
            return null;
        }
    }

    public void deleteById(String id){
        produtoRepository.deleteById(id);
    }
}
