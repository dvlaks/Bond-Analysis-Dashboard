package com.example.bond_analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bond_analyzer.domain.Bond;

@Repository
public interface BondRepository extends JpaRepository<Bond, Long> {

}