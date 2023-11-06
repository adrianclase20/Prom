package com.example.controlesseleccion_ejer1;

public class Pais {
    private String name;
    private String surfaceArea;
    private int population;

    public Pais(String name, String surfaceArea, int population) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }
    private Pais mostrar(String countryName) {
        // Simulación de datos de país
        Pais[] countries = {
                new Pais("País 1", "1000 km²", 1000000),
                new Pais("País 2", "2000 km²", 2000000),
                new Pais("País 3", "3000 km²", 3000000),
                new Pais("País 4", "4000 km²", 4000000),
                new Pais("País 5", "5000 km²", 5000000)
        };

        // Buscar el país en la lista
        for (Pais country : countries) {
            if (country.getName().equals(countryName)) {
                return country; // Devolver el país encontrado
            }
        }

        return null; // Devolver null si el país no se encuentra
    }

    public int getPopulation() {
        return population;
    }
}
