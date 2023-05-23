package com.project.course.repositories;

import com.project.course.entities.Product;
import com.project.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
