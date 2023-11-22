package com.example.clientes.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes" )
public interface clientesrepositorios extends JpaRepository<clientes, Long>{

}
