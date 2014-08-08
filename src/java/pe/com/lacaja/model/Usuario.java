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
public class Usuario {
    
  private String TIPOPER; // 'Tipo de beneficiario: (A)Aportante (R)Pensionista'
  private String CODINST; // 'Código de instituto'
  private String TIPODOC; // 'Tipo de documento'
  private String NRODOC;  // 'Número de documento'
  private String CLAVE;   // 'Clave del usuario'
  private String EMAIL;   // 'Correo Electrónico'
  private String USUREG;  // 'Usuario de registro'
  private String FECREG;  // 'Fecha de registro'
  private String USUMOD;  // 'Usuario de modificación'
  private String FECMOD;  // 'Fecha de modificación'
  private String INDVAL;  // 'Indicador de usuario válido: (1) Válido (0) Inválido'
  private String OPECEL;  // 'Codigo de Operadora (M) Movistar (C) Claro y (N) Nextel'
  private String NROCEL;  // 'Numero de Celular'
  private String AUTEMAIL;// 'Fecha de Autorización de Correo'
  private String AUTCEL;  // 'Fecha de Autorización de Celular'
  private String VALCORREO;//'Correos validos (1) Válido (0) Inválido'

    public String getTIPOPER() {
        return TIPOPER;
    }

    public void setTIPOPER(String TIPOPER) {
        this.TIPOPER = TIPOPER;
    }

    public String getCODINST() {
        return CODINST;
    }

    public void setCODINST(String CODINST) {
        this.CODINST = CODINST;
    }

    public String getTIPODOC() {
        return TIPODOC;
    }

    public void setTIPODOC(String TIPODOC) {
        this.TIPODOC = TIPODOC;
    }

    public String getNRODOC() {
        return NRODOC;
    }

    public void setNRODOC(String NRODOC) {
        this.NRODOC = NRODOC;
    }

    public String getCLAVE() {
        return CLAVE;
    }

    public void setCLAVE(String CLAVE) {
        this.CLAVE = CLAVE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
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

    public String getINDVAL() {
        return INDVAL;
    }

    public void setINDVAL(String INDVAL) {
        this.INDVAL = INDVAL;
    }

    public String getOPECEL() {
        return OPECEL;
    }

    public void setOPECEL(String OPECEL) {
        this.OPECEL = OPECEL;
    }

    public String getNROCEL() {
        return NROCEL;
    }

    public void setNROCEL(String NROCEL) {
        this.NROCEL = NROCEL;
    }

    public String getAUTEMAIL() {
        return AUTEMAIL;
    }

    public void setAUTEMAIL(String AUTEMAIL) {
        this.AUTEMAIL = AUTEMAIL;
    }

    public String getAUTCEL() {
        return AUTCEL;
    }

    public void setAUTCEL(String AUTCEL) {
        this.AUTCEL = AUTCEL;
    }

    public String getVALCORREO() {
        return VALCORREO;
    }

    public void setVALCORREO(String VALCORREO) {
        this.VALCORREO = VALCORREO;
    }
    
  
}
