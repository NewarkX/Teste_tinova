package com.cadastro.veiculos.service;

import com.cadastro.veiculos.dto.VeiculoDto;
import com.cadastro.veiculos.entities.Veiculo;
import com.cadastro.veiculos.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    @Transactional(readOnly = true)
    public List<VeiculoDto> findAll(){
        List<Veiculo> list = repository.findAll();
        return list.stream().map(x -> new VeiculoDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public VeiculoDto findById(Integer id) {
        Optional<Veiculo> obj = repository.findById(id);
        Veiculo entity = obj.get();
        return new VeiculoDto(entity);
    }

    @Transactional
    public VeiculoDto insert(VeiculoDto dto) {
        Veiculo entity = new Veiculo();
        entity.setId(dto.getId()); 
        entity.setVeiculo(dto.getVeiculo()); 
        entity.setMarca(dto.getMarca()); 
        entity.setAno(dto.getAno()); 
        entity.setDescricao(dto.getDescricao()); 
        entity.setVendido(dto.isVendido());
        entity = repository.save(entity);
        return new VeiculoDto(entity);
    }
}
