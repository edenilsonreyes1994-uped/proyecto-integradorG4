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
    }
}