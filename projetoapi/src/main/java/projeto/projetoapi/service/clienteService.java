package projeto.projetoapi.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.projetoapi.models.cliente;
import projeto.projetoapi.repository.clienteRepository;

import java.util.List;

@Service
public class clienteService {

    @Autowired
    private clienteRepository clienteRepository;

    public List<cliente> findAll(){
        return clienteRepository.findAll();
    }

    public cliente findById(String id){
        return clienteRepository.findById(id).orElse(null);
    }

    public cliente criar()
}
