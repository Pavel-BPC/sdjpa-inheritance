package com.example.blinets.Inheritance.repository;

import com.example.blinets.Inheritance.domain.joined.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {
}
