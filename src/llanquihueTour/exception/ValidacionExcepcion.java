package llanquihueTour.exception;


/**
 * Excepcion para errores
 * validacion de reglas de negocio
 * *@author David
 * @version 1.0
 */
public class ValidacionExcepcion extends Exception {
    public ValidacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
