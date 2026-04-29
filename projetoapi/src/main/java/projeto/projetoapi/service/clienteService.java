package projeto.projetoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.projetoapi.models.Cliente;
import projeto.projetoapi.repository.clienteRepository;

import java.util.List;

@Service
public class clienteService {

    @Autowired
    private clienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findById(String id){
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente criar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(String id , Cliente cliente){
        if(clienteRepository.existsById(id)){
            cliente.setId(id);
            return clienteRepository.save(cliente);
        } else {
            return null;
        }
    }

    public void deleteById(String id){
        clienteRepository.deleteById(id);
    }
}
