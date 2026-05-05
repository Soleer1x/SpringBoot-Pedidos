package projeto.projetoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.projetoapi.models.ItemPedido;
import projeto.projetoapi.models.Produto;
import projeto.projetoapi.repository.itemPedidoRepository;
import projeto.projetoapi.repository.produtoRepository;

import java.util.List;

@Service
public class itemPedidoService {

    @Autowired
    private itemPedidoRepository itemPedidoRepository;

    public List<ItemPedido> findAll() {
        return itemPedidoRepository.findAll();
    }

    public ItemPedido findById(String id) {
        return itemPedidoRepository.findById(id).orElse(null);
    }

    public ItemPedido criar(ItemPedido item) {
        return itemPedidoRepository.save(item);
    }

    public ItemPedido atualizar(String id, ItemPedido item) {
        if (itemPedidoRepository.existsById(id)) {
            item.setId(id);
            return itemPedidoRepository.save(item);
        } else {
            return null;
        }
    }

    public void deleteById(String id) {
        itemPedidoRepository.deleteById(id);
    }
}