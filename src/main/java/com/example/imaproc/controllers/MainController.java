package com.example.imaproc.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.imaproc.models.Client;
import com.example.imaproc.repositories.ClientRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/api", produces = "application/json")
@CrossOrigin(origins = {"http://localhost:8080"})
public class MainController {

    private ClientRepository clientRepository;

    public MainController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @ModelAttribute(name = "Client")
    public Client get() {
        Client newUser = new Client();
        return newUser;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Optional<Client> getUser(@PathVariable Long id) {
        return clientRepository.findById(id);
    }

    @RequestMapping(value = "/user", method=RequestMethod.POST)
    public void createUser(@RequestBody Client client, Error errors) {
        clientRepository.save(client);
    }
    
    
    

    
    
    
}
