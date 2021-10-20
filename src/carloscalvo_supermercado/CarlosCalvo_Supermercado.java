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
public class CarlosCalvo_Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cliente cliente = new Cliente(true);
        Caja caja1 = new Caja(1, new Cajera("Mari Carmen",200),new Cliente (true));
        Caja caja2 = new Caja(2, new Cajera("Rodrigo",2500),new Cliente (true));
 
        caja1.MostrarDetalles();
        caja2.MostrarDetalles();
    }
    
}
