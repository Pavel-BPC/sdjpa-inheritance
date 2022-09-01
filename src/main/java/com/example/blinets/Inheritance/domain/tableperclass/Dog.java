package com.example.blinets.Inheritance.domain.tableperclass;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Mammal{
        private String breed;
}
