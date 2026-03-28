package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.CakeModel;

@Repository
public interface CakeRepo extends JpaRepository<CakeModel, Long>{

}
