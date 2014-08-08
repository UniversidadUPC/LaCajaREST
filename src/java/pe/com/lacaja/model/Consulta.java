/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.model;

import java.util.List;

/**
 *
 * @author Alfredo Regis
 */
public class Consulta {
    private int conId;
    private String nroDoc;
    private String conAsu;
    private String condes;
    private String confch;
    private String conest;

    private List<Consulta_Respuesta> conRsp;

    public int getConId() {
        return conId;
    }

    public void setConId(int conId) {
        this.conId = conId;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getConAsu() {
        return conAsu;
    }

    public void setConAsu(String conAsu) {
        this.conAsu = conAsu;
    }

    public String getCondes() {
        return condes;
    }

    public void setCondes(String condes) {
        this.condes = condes;
    }

    public String getConfch() {
        return confch;
    }

    public void setConfch(String confch) {
        this.confch = confch;
    }

    public String getConest() {
        return conest;
    }

    public void setConest(String conest) {
        this.conest = conest;
    }

    public List<Consulta_Respuesta> getConRsp() {
        return conRsp;
    }

    public void setConRsp(List<Consulta_Respuesta> conRsp) {
        this.conRsp = conRsp;
    }
    
}
