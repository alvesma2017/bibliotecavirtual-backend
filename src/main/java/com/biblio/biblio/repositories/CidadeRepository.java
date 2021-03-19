package com.biblio.biblio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.biblio.biblio.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade, Integer> {

}
