package com.example.blinets.Inheritance.domain.msuper;

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
public class OrderHeader extends BaseEntity {
    private String customerName;
}
