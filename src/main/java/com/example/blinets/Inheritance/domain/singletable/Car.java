package com.example.blinets.Inheritance.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("car")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car  extends  Vehicle{
    private String trimLevel;

}
