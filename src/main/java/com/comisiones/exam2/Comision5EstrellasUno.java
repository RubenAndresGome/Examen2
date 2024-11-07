

package com.comisiones.exam2;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named
@RequestScoped
public class    Comision5EstrellasUno implements comisiones_menu {
    
    
    private String UbicacionImagen;
    private double Precio=50.0;
    private String estrellas="";
    private String NombreArtista="Rua";
      @Override
    public String getNombreArtista() {
        return NombreArtista;
    }
    
    
    
    
    Comision5EstrellasUno(){
    UbicacionImagen="IMAGES/render_plus_ejemplo.jpg";
    Precio=60.0;
    estrellas="";
    this.setEstrellas(5);
    }

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

    public String getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        String s="";
        for(int i=estrellas;i>0;i--)s+="★";
        this.estrellas=s;
    }


}




    
            
          
            

