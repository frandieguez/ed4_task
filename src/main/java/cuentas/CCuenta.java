/**
 * Paquete que englobal la aplicacion de gestion de cuenta
 * 
 * @author Fran Dieguez
 */
package cuentas;

/**
 * Clase que gestion la cuenta bancaria de una persona, la cuenta tiene un tipo
 * de interes asociado a la misma
 * 
 * @author Fran Dieguez
 */
public class CCuenta {

    /**
     * El nombre del propietario de la cuenta
     */
    private String nombre;
    /**
     * El identificador de la cuenta
     */
    private String cuenta;
    /**
     * El saldo actual de la cuenta
     */
    private double saldo;
    /**
     * El tipo de interes de la cuenta
     */
    private double tipoInterés;

    /**
     * Inicializa el objeto cuenta sin ningun parametro de entrada
     */
    public CCuenta() {
    }

    /**
     * Inicializa el objeto Cuenta proporcionando como parametros nombre, cuenta,
     * saldo inicial y tipo de interes
     * 
     * @param nom nombre del propietario de la cuenta
     * @param cue identificador de la cuenta
     * @param sal saldo inicial de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Retorna el saldo actual de la cuenta
     * 
     * @return el saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta
     * 
     * @param cantidad cantidad de dinero a ingresar
     * @throws Exception Si la cantidad no es valida
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad proporcionada del saldo de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception si la cantidad a retirar es incorrecta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Retorna el nombre del propietario de la cuenta
     * 
     * @return el nombre del propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del propietario de la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador de la cuenta
     * 
     * @return ll identificador de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el identificador de la cuenta
     * 
     * @param cuenta el id de cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta
     * 
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     * 
     * @param saldo el saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interes de la cuenta
     * 
     * @return el tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interes de la cuenta
     * 
     * @param tipoInterés el tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
