package com.example.blinets.Inheritance.domain.tableperclass;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dolphin extends Mammal{
    private Boolean hasSpots;
}
