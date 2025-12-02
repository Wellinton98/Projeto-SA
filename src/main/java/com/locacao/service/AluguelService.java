package com.locacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locacao.model.Aluguel;
import com.locacao.repository.AluguelRepository;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel salvar(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public List<Aluguel> listarTodos() {
        return aluguelRepository.findAll();
    }

    public Aluguel buscarPorId(Integer id) {
        return aluguelRepository.findById(id).orElse(null);
    }

    public void deletar(Integer id) {
        aluguelRepository.deleteById(id);
    }
}

