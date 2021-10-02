package com.hichem.ecomback.dao;

import com.hichem.ecomback.entities.Category;
import com.hichem.ecomback.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
