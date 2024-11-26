


package com.comisiones.exam2;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named
@RequestScoped
public interface imagenes_index {
    public String getUbicacion();
    public String getDescripcion();
}
