package com.hakney.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hakney.apirest.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
