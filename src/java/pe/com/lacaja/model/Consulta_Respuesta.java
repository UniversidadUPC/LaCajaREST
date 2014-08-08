/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.model;

/**
 *
 * @author Alfredo Regis
 */
public class Consulta_Respuesta {
    private int conid;
    private int rspconid;
    private String rspcontip; //(respuesta, repregunta)
    private String rspconusu;
    private String rspcondes;
    private String rspconfch;

    public int getConid() {
        return conid;
    }

    public void setConid(int conid) {
        this.conid = conid;
    }

    public int getRspconid() {
        return rspconid;
    }

    public void setRspconid(int rspconid) {
        this.rspconid = rspconid;
    }

    public String getRspcontip() {
        return rspcontip;
    }

    public void setRspcontip(String rspcontip) {
        this.rspcontip = rspcontip;
    }

    public String getRspconusu() {
        return rspconusu;
    }

    public void setRspconusu(String rspconusu) {
        this.rspconusu = rspconusu;
    }

    public String getRspcondes() {
        return rspcondes;
    }

    public void setRspcondes(String rspcondes) {
        this.rspcondes = rspcondes;
    }

    public String getRspconfch() {
        return rspconfch;
    }

    public void setRspconfch(String rspconfch) {
        this.rspconfch = rspconfch;
    }
    
    
}
