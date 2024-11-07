


package com.comisiones.exam2;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Logo_sin_fondo implements imagenes_index {
    private String Ubicacion="IMAGES/logo_sin_fondo.png";
    private String Descripcion="SILU";
    private String Comentario="";
    
    public Logo_sin_fondo() {
    // Si necesitas hacer algo en el constructor
}

    @Override
    public String getUbicacion() {
        return Ubicacion;
    }
    
    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    @Override
    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }
    
    
}
