/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comisiones.exam2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author samsu
 */
@Named
@RequestScoped
public interface comisiones_menu {
   String getUbicacionImagen();
   void setUbicacionImagen(String ubicacion);
   double getPrecio();
   String getEstrellas();
   public String getNombreArtista();
    
   
}
