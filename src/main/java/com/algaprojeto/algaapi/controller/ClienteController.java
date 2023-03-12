package com.algaprojeto.algaapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algaprojeto.algaapi.model.Cliente;

@RestController
public class ClienteController {
    List<Cliente> listaClientes = new ArrayList<>();

    @GetMapping("/listar")
    public List<Cliente> Listar(){
        return listaClientes;
    }

    @PostMapping("/cadastrar")
    public List<Cliente> cadCliente(@RequestBody Cliente cliente){
        listaClientes.add(cliente);
        return listaClientes;
    }

}
