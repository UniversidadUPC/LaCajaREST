/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.taglibs.standard.functions.Functions;
import pe.com.lacaja.connection.Conexion;
import pe.com.lacaja.model.Beneficiario;
import pe.com.lacaja.model.Boleta;
import pe.com.lacaja.model.Boleta_Detalle;

/**
 *
 * @author AlfredoRegis
 */
@Path("/servicios")
public class LaCajaServiceREST {
    Conexion con = new Conexion();
    Connection reg = con.conexion();
    String sql;
    
    @GET
    @Path("benef/{nroDoc}")    
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Beneficiario getBeneficiario(@PathParam("nroDoc") String nroDoc) {                
        Beneficiario benef = new Beneficiario();
        sql =   "select CODPER,APENOM, CODDOC, A.NRODOC, DOMICILIO \n" +
                "from PENSIONWEB.PPE_T_BENEFICIARIO A \n" +
                "inner join PENSIONWEB.PPE_T_USUARIO B on A.NroDoc = B.NroDoc\n" +
                "where B.NroDoc = ?";
                
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, nroDoc);            
            ResultSet n=pst.executeQuery();
            
            Beneficiario benef1 = new Beneficiario();
            while(n.next()){                
                benef1.setCODPER(n.getString("CODPER"));
                benef1.setAPENOM(n.getString("APENOM"));
                benef1.setCODDOC(n.getString("CODDOC"));
                benef1.setNRODOC(n.getString("NRODOC"));
                benef1.setDOMICILIO(n.getString("DOMICILIO"));                
            }            
            benef = benef1;
        } catch (SQLException e) {
                System.out.println("Error! "+e);                 
        }
        return benef;
    }
    
    @GET
    @Path("login/{nroDoc}/{clave}")  
    @Produces(MediaType.TEXT_PLAIN)
    //@ Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String loginCaja(@PathParam("nroDoc") String nroDoc,@PathParam("clave") String clave) {                
        sql = "select count(1) from PENSIONWEB.PPE_T_USUARIO where nrodoc=? and clave=?";
        String value = "Error en Usuario y/o Password.";
        
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, nroDoc);
            pst.setString(2, clave);
            ResultSet n=pst.executeQuery();
            n.first();
            if (n.getInt(1)>0){                
                value = "OK";
            }
        } catch (SQLException e) {
                System.out.println("Error! "+e);                 
        }        
        
        return value;
    }
    
    @GET
    @Path("boleta/{codPer}")    
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Boleta getBoletas(@PathParam("codPer") String CodPer) {
        Boleta boleta = new Boleta();
        sql =   "select A.* from PENSIONWEB.PPE_T_BOLETA_CAB A\n" +
                "Where A.CODPER = ?";
                
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1, CodPer);            
            ResultSet n=pst.executeQuery();            
            
            while(n.next()){
                Boleta boleta1 = new Boleta();
                boleta1.setPERANO(n.getInt("PERANO"));
                boleta1.setPERMES(n.getInt("PERMES"));
                boleta1.setFECGEN(Functions.substring(n.getString("FECGEN"),0,10));
                boleta1.setPLANA(n.getString("PLANA"));
                boleta1.setDESGRADBAJ(n.getString("DESGRADBAJ"));
                boleta1.setTOTREM(n.getDouble("TOTREM"));
                boleta1.setTOTDES(n.getDouble("TOTDES"));
                
                //Agrega el Detalle
                List<Boleta_Detalle> detalle = new ArrayList<>();
                sql =   "select A.* from PENSIONWEB.PPE_T_BOLETA_MOV A\n" +
                        "Where A.CODPER = ?";
                
                PreparedStatement pst1=reg.prepareStatement(sql);
                pst1.setString(1, CodPer);            
                ResultSet n1=pst1.executeQuery();
                while(n1.next()){
                    Boleta_Detalle detalle1 = new Boleta_Detalle();
                    detalle1.setTIPOMOV(n1.getString("TIPOMOV"));
                    detalle1.setCONCEPTO(n1.getString("CONCEPTO"));                    
                    detalle1.setDESCRI(n1.getString("DESCRI"));                    
                    detalle1.setIMPORTE(n1.getDouble("IMPORTE"));                    
                    
                    detalle.add(detalle1);
                }
                //Agregamos el Detalle
                boleta1.setDetalle(detalle);
                
                //Agrega Boleta y Detalle
                boleta = boleta1;
            }
        } catch (SQLException e) {
                System.out.println("Error! "+e);                 
        }
        return boleta;
    }
}
