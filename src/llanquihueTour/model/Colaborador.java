package llanquihueTour.model;

import llanquihueTour.exception.ValidacionExcepcion;

/**
 * Clase que hereda de Persona para diferenciar roles (Guías, Operadores).
 */
public class Colaborador extends Persona {
    private String rol;
    private String especialidad;

    public Colaborador(String rut, String nombre, String correo, Direccion direccion, String rol, String especialidad) throws ValidacionExcepcion {
        super(rut, nombre, correo, direccion);
        setRol(rol);
        setEspecialidad(especialidad);
    }

    public String getRol() { return rol; }
    public void setRol(String rol) throws ValidacionExcepcion {
        if (rol == null || rol.trim().isEmpty()) throw new ValidacionExcepcion("Rol vacío.");
        this.rol = rol;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) throws ValidacionExcepcion {
        if (especialidad == null || especialidad.trim().isEmpty()) throw new ValidacionExcepcion("Especialidad vacía.");
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " | Rol: " + rol + " | Especialidad: " + especialidad;
    }
}