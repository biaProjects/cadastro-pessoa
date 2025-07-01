package br.com.beatrizalmeida.api.teste.cadastropessoa.service;

import br.com.beatrizalmeida.api.teste.cadastropessoa.model.Pessoa;
import br.com.beatrizalmeida.api.teste.cadastropessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;


    public List<Pessoa> listarPessoas(){
        return repository.findAll();
    }

    public Pessoa buscarPorId(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void criar(Pessoa pessoa){
        repository.save(pessoa);
    }

    public void atualizar(Long id, Pessoa pessoa){
        Pessoa persistir = this.buscarPorId(id);
        persistir.setNome(pessoa.getNome());
        persistir.setEmail(pessoa.getEmail());
        persistir.setTelefone(pessoa.getTelefone());
        repository.save(persistir);
    }

    public void deletar(Long id){
        Pessoa deletar = this.buscarPorId(id);
        repository.delete(deletar);
    }
}
