package com.cadastro.veiculos.resource;

import com.cadastro.veiculos.dto.VeiculoDto;

import com.cadastro.veiculos.service.VeiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
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

    @GetMapping(value = "/findUnSoldvehicles")
    public ResponseEntity<List<VeiculoDto>> findUnSoldvehicles(){
        List<VeiculoDto> list = service.findUnSoldvehicles();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<VeiculoDto> insert(@RequestBody VeiculoDto dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
        .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    
    @PutMapping(value = "/{id}")
    public ResponseEntity<VeiculoDto> update(@PathVariable Integer id, @RequestBody VeiculoDto dto){
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

   
}
