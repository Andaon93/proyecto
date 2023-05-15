/**
 * Esta clase representa una fecha y proporciona métodos para comparar y manipular fechas.
 */
public class Fecha implements Comparable<Fecha> {
    private int dia;
    private int mes;
    private int anyo;

    /**
     * Crea una instancia de Fecha con el día, mes y año especificados.
     *
     * @param dia  El día de la fecha.
     * @param mes  El mes de la fecha.
     * @param anyo El año de la fecha.
     */
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     * Obtiene el día de la fecha.
     *
     * @return El día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Establece el día de la fecha.
     *
     * @param dia El nuevo día de la fecha.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtiene el mes de la fecha.
     *
     * @return El mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Establece el mes de la fecha.
     *
     * @param mes El nuevo mes de la fecha.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtiene el año de la fecha.
     *
     * @return El año de la fecha.
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * Establece el año de la fecha.
     *
     * @param anyo El nuevo año de la fecha.
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     * Devuelve una representación en formato de cadena de la fecha.
     *
     * @return La fecha en formato "dia/mes/año".
     */
    @Override
    public String toString() {
        return "" + this.dia + "/" + this.mes + "/" + this.anyo;
    }

    /**
     * Calcula el código hash de la fecha.
     *
     * @return El código hash calculado.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + anyo;
        result = prime * result + dia;
        result = prime * result + mes;
        return result;
    }

    /**
     * Compara esta fecha con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar con esta fecha.
     * @return true si el objeto es una fecha igual a esta, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fecha other = (Fecha) obj;
        if (anyo != other.anyo)
            return false;
        if (dia != other.dia)
            return false;
        if (mes != other.mes)
            return false;
        return true;
    }

    /**
     * Compara esta fecha con otra fecha para determinar su orden relativo.
    
