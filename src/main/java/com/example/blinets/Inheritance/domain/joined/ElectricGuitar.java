package com.example.blinets.Inheritance.domain.joined;


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
public class ElectricGuitar extends Guitar {
    private Integer numberOfPickups;
}
