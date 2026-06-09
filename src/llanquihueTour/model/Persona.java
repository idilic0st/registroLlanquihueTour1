package llanquihueTour.model;

import llanquihueTour.exception.ValidacionExcepcion;
import llanquihueTour.exception.ValidacionExcepcion;

public class Persona {
    private String rut;
    private String nombre;
    private String correo;
    private Direccion direccion;

    public Persona(String rut, String nombre, String correo, Direccion direccion) throws ValidacionExcepcion {
        setRut(rut);
        setNombre(nombre);
        setCorreo(correo);
        setDireccion(direccion);
    }

    public String getRut() { return rut; }
    public void setRut(String rut) throws ValidacionExcepcion {
        if (rut == null || rut.isEmpty()) throw new ValidacionExcepcion("RUT invalido.");
        this.rut = rut;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) throws ValidacionExcepcion {
        if (nombre == null || nombre.length() < 3) throw new ValidacionExcepcion("Nombre muy corto.");
        this.nombre = nombre;
    }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) throws ValidacionExcepcion {
        if (correo == null || !correo.contains("@")) throw new ValidacionExcepcion("Correo sin @.");
        this.correo = correo;
    }

    // AQUÍ TAMBIÉN: Retorna Direccion
    public Direccion getDireccion() { return direccion; }

    // Y AQUÍ: Recibe Direccion
    public void setDireccion(Direccion direccion) throws ValidacionExcepcion {
        if (direccion == null) throw new ValidacionExcepcion("Debe ingresar una direccion.");
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Correo: " + correo + " | Direccion: [" + direccion + "]";
    }
}