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
public class Beneficiario {
    private String CODINST; //'Código del instituto'
    private String CODPER;  //'Código del causante'
    private String NROSEC;  //'Código del beneficiario ó representante'
    private String APENOM;  //'Apellidos y nombres'
    private String FECNAC;  //'Fecha de nacimiento del beneficiario ó representante'
    private String SEXO;    //'Sexo del beneficiario ó representante: (0)Masculino (1)Femenino'
    private String CODDOC;  //'Código del tipo de documento de identidad'
    private String NRODOC;  //'Número del documento de identidad'
    private String TIPOPER; //'Tipo de persona: (2)Beneficiario (3)Representante (23)Beneficiario-Representante'
    private String PORCEN;  //'Porcentaje de distribución'
    private String DOMICILIO;//'Domicilio del beneficiario'
    private String POSTAL;  //'Descripción del código postal del domicilio'
    private String ESTADO;  //'Estado del beneficiario: (0)Inactivo (1)Activo (2)Retenido',
    private String CLPENSION;//'Clase de pensión: (01)Retiro (02)Invalidez (03)Incapacidad (04)Viudez (05)Orfandad (06)Ascendientes (07)Disponibilidad'
    private String USUREG;  //'Usuario de registro'
    private String FECREG;  //'Fecha de registro'
    private String USUMOD;  //'Usuario de modificación',
    private String FECMOD;  //'Fecha de modificación'

    private List<Opcion> opcUsu;

    public List<Opcion> getOpcUsu() {
        return opcUsu;
    }

    public void setOpcUsu(List<Opcion> opcUsu) {
        this.opcUsu = opcUsu;
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

    public String getNROSEC() {
        return NROSEC;
    }

    public void setNROSEC(String NROSEC) {
        this.NROSEC = NROSEC;
    }

    public String getAPENOM() {
        return APENOM;
    }

    public void setAPENOM(String APENOM) {
        this.APENOM = APENOM;
    }

    public String getFECNAC() {
        return FECNAC;
    }

    public void setFECNAC(String FECNAC) {
        this.FECNAC = FECNAC;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public String getCODDOC() {
        return CODDOC;
    }

    public void setCODDOC(String CODDOC) {
        this.CODDOC = CODDOC;
    }

    public String getNRODOC() {
        return NRODOC;
    }

    public void setNRODOC(String NRODOC) {
        this.NRODOC = NRODOC;
    }

    public String getTIPOPER() {
        return TIPOPER;
    }

    public void setTIPOPER(String TIPOPER) {
        this.TIPOPER = TIPOPER;
    }

    public String getPORCEN() {
        return PORCEN;
    }

    public void setPORCEN(String PORCEN) {
        this.PORCEN = PORCEN;
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

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getCLPENSION() {
        return CLPENSION;
    }

    public void setCLPENSION(String CLPENSION) {
        this.CLPENSION = CLPENSION;
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
