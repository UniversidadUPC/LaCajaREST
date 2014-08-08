/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.model;

/**
 *
 * @author AlfredoRegis
 */
public class Boleta_Detalle {
  private String TIPOMOV;   //'Tipo de movimiento: (R)Remuneración (D)Descuentos'
  private String CONCEPTO;  //'Código de la remuneración o descuento'
  private String DESCRI;    //'Descripción de la remuneración o descuento'
  private double IMPORTE;   //'Importe de la remuneración ó descuento'
  private String USUREG;    //'Usuario de registro'
  private String FECREG;    //'Fecha de registro'
  private String USUMOD;    //'Usuario de modificación'
  private String FECMOD;    //'Fecha de modificación'

    public String getTIPOMOV() {
        return TIPOMOV;
    }

    public void setTIPOMOV(String TIPOMOV) {
        this.TIPOMOV = TIPOMOV;
    }

    public String getCONCEPTO() {
        return CONCEPTO;
    }

    public void setCONCEPTO(String CONCEPTO) {
        this.CONCEPTO = CONCEPTO;
    }

    public String getDESCRI() {
        return DESCRI;
    }

    public void setDESCRI(String DESCRI) {
        this.DESCRI = DESCRI;
    }

    public double getIMPORTE() {
        return IMPORTE;
    }

    public void setIMPORTE(double IMPORTE) {
        this.IMPORTE = IMPORTE;
    }

    public String getUSUREG() {
        return USUREG;
    }

    public void setUSUREG(String USUREG) {
        this.USUREG = USUREG;
    }

    public String getFECREG() {
        return FECREG;
    }

    public void setFECREG(String FECREG) {
        this.FECREG = FECREG;
    }

    public String getUSUMOD() {
        return USUMOD;
    }

    public void setUSUMOD(String USUMOD) {
        this.USUMOD = USUMOD;
    }

    public String getFECMOD() {
        return FECMOD;
    }

    public void setFECMOD(String FECMOD) {
        this.FECMOD = FECMOD;
    }
  
  
}
