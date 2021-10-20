/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscalvo_supermercado;

/**
 *
 * @author Carlosc
 */
public class Caja {
    int numeroCaja;
    Cajera cajera;
    Cliente cliente;

    public Caja() {
    }

    public Caja(int numeroCaja, Cajera cajera, Cliente cliente) {
        this.numeroCaja = numeroCaja;
        this.cajera = cajera;
        this.cliente = cliente;
    }

   public void MostrarDetalles(){
       System.out.println("Caja " + numeroCaja + ": ");
       System.out.println(" Nombre Empleado: " + cajera.nombre);
       System.out.println(" Tiempo de Espera: " + cajera.TiempoEspera);
       System.out.println(" Productos: ");
       
       for (Producto aux : cliente.carrito) {
           System.out.println("  " + aux.nombre + ": " + aux.precio + " €");
       }
   }
    
    
}
