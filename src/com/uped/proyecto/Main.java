package com.uped.proyecto;
import com.uped.proyecto.modelo.ConfiguracionReporte;
import com.uped.proyecto.modelo.Pedido;
import com.uped.proyecto.modelo.Suscripcion;
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
        
    }
}