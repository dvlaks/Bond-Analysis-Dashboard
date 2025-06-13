package com.example.bond_analyzer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bond_analyzer.domain.Bond;
import com.example.bond_analyzer.repository.BondRepository;

@Service
public class BondService {

    private final BondRepository bondRepository;

    // This is constructor injection - a best practice!
    // It tells Spring that a BondService cannot be created without a BondRepository.
    @Autowired
    public BondService(BondRepository bondRepository) {
        this.bondRepository = bondRepository;
    }

    /**
     * Finds all bonds currently in the database.
     * @return a list of all Bond objects.
     */
    public List<Bond> findAllBonds() {
        return bondRepository.findAll();
    }

    /**
     * Finds a single bond by its ID.
     * @param id The ID of the bond to find.
     * @return an Optional containing the bond if found, or an empty Optional otherwise.
     */
    public Optional<Bond> findBondById(Long id) {
        return bondRepository.findById(id);
    }
}