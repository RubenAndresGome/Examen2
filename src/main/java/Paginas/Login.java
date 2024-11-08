/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paginas;

/**
 *
 * @author samsu
 */


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named
@RequestScoped
public class Login implements Paginas{
    
    
    private String ubicacion="";
    
    public Login(){
        ubicacion="login.xhtml";
    }
    @Override
    public String getUbicacion() {
        return this.ubicacion;
    }
    
}
