package com.mts.boot.jsp.api.service;


import com.mts.boot.jsp.api.dao.ClientRepository;
import com.mts.boot.jsp.api.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@ComponentScan
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void saveClient(Client client) {
    }

    @Override
    public Client getClient(int id) {
        return null;
    }

    @Override
    public void deleteClient(int id) {
    }
}
