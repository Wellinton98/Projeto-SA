package com.locacao.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locacao.model.Aluguel;

    public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
        Optional<Aluguel> findById(Integer id_aluguel);

        boolean existsById(Integer id_aluguel);
    
}
