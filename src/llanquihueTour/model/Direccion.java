package llanquihueTour.model;

import llanquihueTour.exception.ValidacionExcepcion;

/**
 * Direccion fisica
 */

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;

    public Direccion(String calle, int numero, String ciudad) throws ValidacionExcepcion {
        setCalle(calle);
        setNumero(numero);
        setCiudad(ciudad);

    }

    public String getCalle() {return calle; }

    public void setCalle(String calle) throws ValidacionExcepcion {
        if (calle == null || calle.trim().isEmpty()) throw new ValidacionExcepcion(("calle vacía"));
        this.calle = calle;


    }

    public int getNumero() {return numero; }
    public void setNumero(int numero) throws ValidacionExcepcion {
        if (numero <= 0) throw new ValidacionExcepcion("numero invalido");
        this.numero = numero;
    }

    public String getCiudad () {return ciudad; }
    public void setCiudad (String ciudad) throws ValidacionExcepcion {
        if (ciudad == null || ciudad.trim().isEmpty()) throw new ValidacionExcepcion("Ciudad invalida");
        this.ciudad = ciudad;
    }

    @Override
    public String toString(){
        return calle + " #" + numero + ", " + ciudad;

    }
}
