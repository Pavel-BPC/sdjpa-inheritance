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
public class Piano extends Instrument {
    private Integer numberOfKeys;
}
