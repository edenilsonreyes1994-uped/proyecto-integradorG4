package com.uped.proyecto;
import com.uped.proyecto.modelo.Carrito;
import com.uped.proyecto.modelo.ConfiguracionReporte;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Pedido;
import com.uped.proyecto.modelo.Punto;
import com.uped.proyecto.modelo.Suscripcion;
import com.uped.proyecto.modelo.Vehiculo;
public class Main {
    public static void main(String[] args) {
       Pedido pedido = new Pedido(101); 
       Suscripcion s1 = new Suscripcion("ana"); 
       System.out.println(s1); 
       Suscripcion s2 = Suscripcion.premium("carlos"); 
       System.out.println(s2); 
       ConfiguracionReporte config = new ConfiguracionReporte.Builder() 
       .titulo("Ventas Q3") 
       .conGrafico() 
       .build(); 
        System.out.println(config); 
       Carrito carrito = new Carrito(); 
       carrito.agregar("Café"); 
       carrito.agregar("Azúcar"); 
       carrito.getItems().clear(); // solo modifica la copia 
       System.out.println("Items en el carrito: " + carrito.getItems().size());   
       Empleado empleado = new Empleado("04512378-9", "Analista"); 
       System.out.println(empleado); 
       empleado.ascender("Analista Senior"); 
       System.out.println(empleado); 
        Punto original = new Punto(2, 3); 
        Punto movido = original.mover(1, 1); 
        System.out.println("Original: " + original); 
        System.out.println("Movido: " + movido); 
        Vehiculo vehiculo = new Vehiculo("N123-456", "Toyota"); 
        System.out.println(vehiculo); 
        new Registro(); 

    }   
}   