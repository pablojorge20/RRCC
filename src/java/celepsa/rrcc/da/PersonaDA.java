/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celepsa.rrcc.da;

import celepsa.rrcc.be.PersonaBE;
import celepsa.rrcc.bd.ConexionBD;
import celepsa.rrcc.be.NivelInfluenciaBE;
import celepsa.rrcc.be.TipoDocumentoIdentidadBE;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pmedina
 */
public class PersonaDA {
   public List<PersonaBE> listarPersona(Integer tdoc) throws Exception  {
        ConexionBD objConexion = null;
        try 
        {
            objConexion = new ConexionBD();
            List<PersonaBE> lstRetorno = new ArrayList<PersonaBE>();
            String sQuery="";
            if (tdoc==0){
               sQuery = "SELECT id, CONCAT(Nombre , ' ', Apellido) as nombre FROM tmStakePersona" ;   
         
                }
            else
                {
                  //sQuery = " SELECT * FROM tmDocumento WHERE tmTipoDocumento_id=" + tdoc +" OR tmTipoDocumento_id=0 and eliminado='0'" ;   
                     sQuery="SELECT DISTINCT tmStakePersona.id, CONCAT(tmStakePersona.Nombre , ' ', tmStakePersona.Apellido) as nombre FROM " +
"tmStakePersona WHERE  tmStakePersona.id NOT IN (SELECT tmStakePersona.id  FROM " +
"tmStakePersona, PersonaDocumento where tmStakePersona.id=PersonaDocumento.tmStakePersona_id and " +
" PersonaDocumento.tmDocumento_id =" + tdoc +")";
                }
           
            objConexion.open();
            objConexion.prepararSentencia(sQuery);
            ResultSet objResult = objConexion.ejecutarQuery();
            if (objResult != null) 
            {
                while (objResult.next()) 
                {
                    lstRetorno.add(populatePersonaVarios(objResult));
                }
            } 
            return lstRetorno;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            throw e;
        } 
        finally 
        {
            objConexion.close();
        }
    } 
   
   private PersonaBE populatePersonaVarios(ResultSet resultado) throws SQLException {
        PersonaBE objPersonaBE = new PersonaBE();

        objPersonaBE.setId(resultado.getString("id"));
        
        objPersonaBE.setNombre(resultado.getString("nombre"));

        return objPersonaBE;
    }
   
   public PersonaBE obtenerPersona(PersonaBE objPersona) throws Exception  {
        ConexionBD objConexion = null;
        int cont = 1;
        try 
        {
            objConexion = new ConexionBD();
            PersonaBE objDocumentoResult = null;
            String sQuery = " SELECT  * FROM RRHH.tmStakePersona WHERE id = ? ";
            objConexion.open();
            objConexion.prepararSentencia(sQuery);
            objConexion.agregarParametro(cont++, objPersona.getId());

            ResultSet objResult = objConexion.ejecutarQuery();
            if (objResult != null) 
            {
                if (objResult.next()) 
                {
                    objDocumentoResult = this.populatePersona(objResult);
                }
            } 
            return objDocumentoResult;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
            throw e;
        } 
        finally 
        {
            objConexion.close();
        }
    }
   
    private PersonaBE populatePersona(ResultSet resultado) throws SQLException {
        PersonaBE objPersonaBE = new PersonaBE();
        
        NivelInfluenciaBE objNivelInfluenciaBE = new NivelInfluenciaBE();
        TipoDocumentoIdentidadBE objTipoDocumentoIdentidadBE = new TipoDocumentoIdentidadBE();
        
        objPersonaBE.setId(resultado.getString("id"));
        objPersonaBE.setFechaRegistro(resultado.getString("FechaRegistro")); 
        objPersonaBE.setNombre(resultado.getString("Nombre")); 
        objPersonaBE.setApellido(resultado.getString("Apellido")); 
        objPersonaBE.setAlias(resultado.getString("Alias")); 
        objPersonaBE.setIdentidad(resultado.getString("Identidad")); 
        objPersonaBE.setNroDocumento(resultado.getString("NroDocumento")); 
        objPersonaBE.setFotografia(resultado.getString("Fotografia"));
        
        objTipoDocumentoIdentidadBE.setId(resultado.getString("tmTDocumento"));
        objPersonaBE.setTDoumentoIdentidad(objTipoDocumentoIdentidadBE);;
        
        objNivelInfluenciaBE.setId(resultado.getString("tmNivelInfluencia"));
        objPersonaBE.setNivelInfluencia(objNivelInfluenciaBE);;
        
        
        
        return objPersonaBE;
    }
}
