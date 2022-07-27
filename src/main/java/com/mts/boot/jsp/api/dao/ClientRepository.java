package com.mts.boot.jsp.api.dao;

import com.mts.boot.jsp.api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
