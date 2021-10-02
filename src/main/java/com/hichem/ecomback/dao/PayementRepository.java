package com.hichem.ecomback.dao;

import com.hichem.ecomback.entities.Order;
import com.hichem.ecomback.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface PayementRepository extends JpaRepository<Payment, Long> {

}
