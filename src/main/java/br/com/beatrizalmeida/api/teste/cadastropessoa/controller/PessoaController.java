package br.com.beatrizalmeida.api.teste.cadastropessoa.controller;

import br.com.beatrizalmeida.api.teste.cadastropessoa.model.Pessoa;
import br.com.beatrizalmeida.api.teste.cadastropessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> listarPessoas(){
        return service.listarPessoas();
    }

    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public void criar(@RequestBody Pessoa pessoa){
        service.criar(pessoa);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa){
        service.atualizar(id, pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
