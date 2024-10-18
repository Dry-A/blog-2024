package com.audrey.meublog2024.repository;

import com.audrey.meublog2024.entities.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {


    public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}
