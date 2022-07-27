package com.mts.boot.jsp.api.dao;

import com.mts.boot.jsp.api.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
