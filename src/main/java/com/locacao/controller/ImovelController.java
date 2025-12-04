package com.locacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locacao.model.Imovel;
import com.locacao.service.ImovelService;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @PostMapping
    public Imovel salvar(@RequestBody Imovel imovel) {
        return imovelService.salvar(imovel);
    }

    @GetMapping
    public List<Imovel> listar() {
        return imovelService.listarTodos();
    }
    public List<Imovel> listarDisponiveis() {
        return imovelService.listarImoveisDisponiveis();
    }
    private Imovel descricao(String descricao) {
        return null;
    }

    @GetMapping("/{id}")
    public Imovel buscar(@PathVariable Integer id) {
        return imovelService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        imovelService.deletar(id);
    }
}

