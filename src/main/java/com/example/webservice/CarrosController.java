package com.example.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CarrosController {

    private CarrosManager carrosManager;

    public CarrosController() {
        this.carrosManager =new CarrosManager();
    }

    @GetMapping("/carros")
    public List<Carro> getCarros() {
        return carrosManager.getCarros();
    }
}

