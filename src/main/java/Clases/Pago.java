
package Clases;

public class Pago {
    private String fechaPago;
    private int numCoutas;

    public Pago() {
    }

    public Pago(String fechaPago, int numCoutas) {
        this.fechaPago = fechaPago;
        this.numCoutas = numCoutas;
    }
    
    /**
     * @return the fechaPago
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the numCoutas
     */
    public int getNumCoutas() {
        return numCoutas;
    }

    /**
     * @param numCoutas the numCoutas to set
     */
    public void setNumCoutas(int numCoutas) {
        this.numCoutas = numCoutas;
    }
}
