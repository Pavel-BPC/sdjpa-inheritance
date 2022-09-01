package com.example.blinets.Inheritance.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("truck")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Truck extends Vehicle {
    private Integer payLoad;
}
