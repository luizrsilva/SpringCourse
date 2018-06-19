package com.lrsilva.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lrsilva.projetospring.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}