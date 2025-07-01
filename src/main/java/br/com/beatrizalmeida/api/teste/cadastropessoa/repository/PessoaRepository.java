package br.com.beatrizalmeida.api.teste.cadastropessoa.repository;

import br.com.beatrizalmeida.api.teste.cadastropessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


}
