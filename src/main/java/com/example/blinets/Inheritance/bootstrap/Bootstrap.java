package com.example.blinets.Inheritance.bootstrap;

import com.example.blinets.Inheritance.domain.joined.ElectricGuitar;
import com.example.blinets.Inheritance.repository.ElectricGuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private ElectricGuitarRepository electricGuitarRepository;

    @Override
    public void run(String... args) throws Exception {
        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.setNumberOfStrings(123);
        electricGuitar.setNumberOfPickups(345);
        electricGuitarRepository.save(electricGuitar);
    }
}
