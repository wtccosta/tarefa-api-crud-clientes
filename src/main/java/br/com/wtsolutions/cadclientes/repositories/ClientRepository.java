package br.com.wtsolutions.cadclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wtsolutions.cadclientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
