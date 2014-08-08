/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.model;

import java.util.List;

/**
 *
 * @author AlfredoRegis
 */
public class Boleta {
    private int PERANO;     //'Año de la ejecución'
    private int PERMES;     //'Mes de la ejecución'
    private String CODINST; //'Código del instituto'
    private String CODPER;  //'Código del causante'
    private String FECGEN;  //'Fecha de generación de planilla'
    private int NROREP;     //'Número de representante'
    private String TIPOPLA; //'Código de tipo planilla'
    private String CODMOTB; //'Código del motivo de baja'
    private String TIPDOC;  //'Tipo de boleta: (B)Banco (C)Cheque'
    private String CODCOND; //'Código de la condición de baja'
    private String TIPOPLANA;   //'Código de tipo plana: (1)Oficial (2)Suboficial (S)Sin grado NULL Sin información',
    private String NRODOC;      //'Número de la boleta'    
    private String PLANA;       //'Descripción de tipo plana'
    private String CODGRADBAJ;  //'Grado de baja'
    private String DESGRADBAJ;  //'Descripción de grado de baja'
    private String CODGRADREM;  //'Código de grado remunerativo'
    private String DESGRADREM;  //'Descripción grado remunerativo'
    private String TIPOBEN;     //'Tipo de beneficio'
    private String DESTIPOBEN;  //'Descripción del tipo beneficio'
    private String BANCO;       //'Descripción del banco'
    private String NROCUENTA;   //'Número de cuenta'
    private String DOMICILIO;   //'Domicilio'
    private String POSTAL;      //'Descripción de la postal del domicilio'
    private double TOTREM;      //'Total de remuneración'
    private double TOTDES;      //'Total de descuentos'
    private String USUREG;      //'Usuario de registro'
    private String FECREG;      //'Fecha de registro'
    private String USUMOD;      //'Usuario de modificación'
    private String FECMOD;      //'Fecha de modificación'
    private String CODDEP;      //'Código de departamento, según PENSIONES.PEN_T_BOLETA'
    private String CODVAL;      //'Código validador.'
    
    private List<Boleta_Detalle> detalle; //Detalle de la Boleta

    public List<Boleta_Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Boleta_Detalle> detalle) {
        this.detalle = detalle;
    }

    
    
    public int getPERANO() {
        return PERANO;
    }

    public void setPERANO(int PERANO) {
        this.PERANO = PERANO;
    }

    public int getPERMES() {
        return PERMES;
    }

    public void setPERMES(int PERMES) {
        this.PERMES = PERMES;
    }

    public String getCODINST() {
        return CODINST;
    }

    public void setCODINST(String CODINST) {
        this.CODINST = CODINST;
    }

    public String getCODPER() {
        return CODPER;
    }

    public void setCODPER(String CODPER) {
        this.CODPER = CODPER;
    }

    public String getFECGEN() {
        return FECGEN;
    }

    public void setFECGEN(String FECGEN) {
        this.FECGEN = FECGEN;
    }

    public int getNROREP() {
        return NROREP;
    }

    public void setNROREP(int NROREP) {
        this.NROREP = NROREP;
    }

    public String getTIPOPLA() {
        return TIPOPLA;
    }

    public void setTIPOPLA(String TIPOPLA) {
        this.TIPOPLA = TIPOPLA;
    }

    public String getCODMOTB() {
        return CODMOTB;
    }

    public void setCODMOTB(String CODMOTB) {
        this.CODMOTB = CODMOTB;
    }

    public String getTIPDOC() {
        return TIPDOC;
    }

    public void setTIPDOC(String TIPDOC) {
        this.TIPDOC = TIPDOC;
    }

    public String getCODCOND() {
        return CODCOND;
    }

    public void setCODCOND(String CODCOND) {
        this.CODCOND = CODCOND;
    }

    public String getTIPOPLANA() {
        return TIPOPLANA;
    }

    public void setTIPOPLANA(String TIPOPLANA) {
        this.TIPOPLANA = TIPOPLANA;
    }

    public String getNRODOC() {
        return NRODOC;
    }

    public void setNRODOC(String NRODOC) {
        this.NRODOC = NRODOC;
    }

    public String getPLANA() {
        return PLANA;
    }

    public void setPLANA(String PLANA) {
        this.PLANA = PLANA;
    }

    public String getCODGRADBAJ() {
        return CODGRADBAJ;
    }

    public void setCODGRADBAJ(String CODGRADBAJ) {
        this.CODGRADBAJ = CODGRADBAJ;
    }

    public String getDESGRADBAJ() {
        return DESGRADBAJ;
    }

    public void setDESGRADBAJ(String DESGRADBAJ) {
        this.DESGRADBAJ = DESGRADBAJ;
    }

    public String getCODGRADREM() {
        return CODGRADREM;
    }

    public void setCODGRADREM(String CODGRADREM) {
        this.CODGRADREM = CODGRADREM;
    }

    public String getDESGRADREM() {
        return DESGRADREM;
    }

    public void setDESGRADREM(String DESGRADREM) {
        this.DESGRADREM = DESGRADREM;
    }

    public String getTIPOBEN() {
        return TIPOBEN;
    }

    public void setTIPOBEN(String TIPOBEN) {
        this.TIPOBEN = TIPOBEN;
    }

    public String getDESTIPOBEN() {
        return DESTIPOBEN;
    }

    public void setDESTIPOBEN(String DESTIPOBEN) {
        this.DESTIPOBEN = DESTIPOBEN;
    }

    public String getBANCO() {
        return BANCO;
    }

    public void setBANCO(String BANCO) {
        this.BANCO = BANCO;
    }

    public String getNROCUENTA() {
        return NROCUENTA;
    }

    public void setNROCUENTA(String NROCUENTA) {
        this.NROCUENTA = NROCUENTA;
    }

    public String getDOMICILIO() {
        return DOMICILIO;
    }

    public void setDOMICILIO(String DOMICILIO) {
        this.DOMICILIO = DOMICILIO;
    }

    public String getPOSTAL() {
        return POSTAL;
    }

    public void setPOSTAL(String POSTAL) {
        this.POSTAL = POSTAL;
    }

    public double getTOTREM() {
        return TOTREM;
    }

    public void setTOTREM(double TOTREM) {
        this.TOTREM = TOTREM;
    }

    public double getTOTDES() {
        return TOTDES;
    }

    public void setTOTDES(double TOTDES) {
        this.TOTDES = TOTDES;
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

    public String getCODDEP() {
        return CODDEP;
    }

    public void setCODDEP(String CODDEP) {
        this.CODDEP = CODDEP;
    }

    public String getCODVAL() {
        return CODVAL;
    }

    public void setCODVAL(String CODVAL) {
        this.CODVAL = CODVAL;
    }
   

        
    
}
