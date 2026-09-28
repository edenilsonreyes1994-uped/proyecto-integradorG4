package com.uped.proyecto.modelo;

public class Vehiculo {
    // 1. El atributo placa se declara como final; marca y kilometraje como ordinarios.
    private final String placa;
    private String marca;
    private int kilometraje;

    // 2. Constructor completo con validación centralizada.
    public Vehiculo(String placa, String marca, int kilometraje) {
        validar(placa, kilometraje);
        this.placa = placa;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    // 3. Constructor abreviado encadenado mediante this(...).
    public Vehiculo(String placa, String marca) {
        this(placa, marca, 0);
    }

    // 2. Método privado de validación centralizada.
    private void validar(String placa, int kilometraje) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        }
        if (kilometraje < 0) {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo: " + kilometraje);
        }
    }

    // 4. Método recorrer que incrementa el kilometraje solo si es mayor a cero.
    public void recorrer(int km) {
        if (km > 0) {
            this.kilometraje += km;
        } else {
            // Se imprime el mensaje exacto esperado en la salida de consola.
            System.out.println("Los kilómetros a recorrer deben ser mayores a 0.");
        }
    }

    // 5. Método de fábrica estático que utiliza el constructor abreviado.
    public static Vehiculo nuevo(String placa, String marca) {
        return new Vehiculo(placa, marca);
    }

    // 6. Método toString para fines de verificación.
    @Override
    public String toString() {
        return "Vehiculo{placa='" + placa + "', marca='" + marca + "', kilometraje=" + kilometraje + "}";
    }
}