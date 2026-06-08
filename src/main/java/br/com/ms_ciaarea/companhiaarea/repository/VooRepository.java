package br.com.ms_ciaarea.companhiaarea.repository;

import br.com.ms_ciaarea.companhiaarea.model.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VooRepository extends JpaRepository<Voo, Long> {
}
