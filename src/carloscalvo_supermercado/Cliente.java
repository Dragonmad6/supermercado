/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscalvo_supermercado;

import java.util.ArrayList;

/**
 *
 * @author Carlosc
 */
public class Cliente {
    
    
    ArrayList<Producto> carrito = new ArrayList<>();
  
    
    public Cliente() {
    }    
     
    public Cliente (boolean clienteAutomatico){
        int nProductos = (int)Math.random() * 6 + 5;
        
        String nombreProductos[] = {"Coca-Cola","Huevos","Pan","Leche","Lechuga","Fuet","Pizza","Chocolate","Zumo de naranja","Galletas Oreo","Detergente","Papel Higienico","Ballantines Gran Reserva","Botella Brugal","Cereales Special K","Cerveza Mahou","Aceita de Oliva","Kellogs Tresor", "Arroz Brillante", "Condones Durex", "Aceitunas", "Fabada Asturiana", "Filetes de Pechuga de pollo", "Botella de agua", "Lubricante Durex", "Vino Don Simon"};
        double precioProductos[] = {1.6,2.0,1.5,2.45,3.10,1.0,2.0,1.53,3.15,5.5,49.99,12.95,2.32,0.64,3.95, 2.77, 2.04, 11.95, 2.15, 3.50, 3.77, 0.99, 10.99,0.99,1.2,2.3};
        
//        for (int i = 0; i < precioProductos.length; i++) {
//            System.out.println("Producto "+i+": " + nombreProductos[i] + " Precio: " + precioProductos[i] + "€");
//        }
        
        for (int i = 0; i < nProductos; i++) {
            int n = (int)(Math.random() * nombreProductos.length);
           carrito.add(new Producto(nombreProductos[n], precioProductos[n]));
        }
        
//        for (Producto aux : carrito) {
//            System.out.println("Producto: " + aux.nombre + "Precio: " + aux.precio + "€");
//        }
    }
}
