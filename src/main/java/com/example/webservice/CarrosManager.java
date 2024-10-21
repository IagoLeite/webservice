package com.example.webservice;

import java.util.ArrayList;
import java.util.List;

public class CarrosManager {
    private List<Carro> carros;
    public CarrosManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Nivus","VW"));
        this.carros.add(new Carro("Jetta","VW"));
    }
    public List<Carro> getCarros(){
        return this.carros;
    }
}
