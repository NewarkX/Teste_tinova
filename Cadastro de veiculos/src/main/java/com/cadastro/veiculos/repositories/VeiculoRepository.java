package com.cadastro.veiculos.repositories;

import com.cadastro.veiculos.entities.Veiculo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    @Query(value = "SELECT * FROM tb_veiculo WHERE vendido = false",nativeQuery = true)
    List<Veiculo> findUnSoldvehicles();
}
