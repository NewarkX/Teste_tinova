package com.cadastro.veiculos.resource;

import com.cadastro.veiculos.dto.VeiculoDto;
import com.cadastro.veiculos.entities.Veiculo;
import com.cadastro.veiculos.service.VeiculoService;

import jakarta.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public ResponseEntity<List<VeiculoDto>> findAll(){
        List<VeiculoDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    
    @GetMapping(value = "/{id}")
    public ResponseEntity<VeiculoDto> findById(@PathVariable Integer id){
        VeiculoDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<VeiculoDto> insert(@RequestBody VeiculoDto dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
        .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
