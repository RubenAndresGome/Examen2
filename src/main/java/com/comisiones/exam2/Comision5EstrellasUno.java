

package com.comisiones.exam2;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named
@RequestScoped
public class    Comision5EstrellasUno implements comisiones_menu {
    private String UbicacionImagen;
    private double Precio=50.0;
    private int estrellas=5;

    public String getUbicacionImagen() {
        return UbicacionImagen;
    }

    public void setUbicacionImagen(String Ubicacion) {
        this.UbicacionImagen = Ubicacion;
    }

    @Override
    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

}




    
            
          
            

