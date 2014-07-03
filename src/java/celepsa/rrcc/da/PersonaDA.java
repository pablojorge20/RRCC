/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celepsa.rrcc.da;

import celepsa.rrcc.be.PersonaBE;
import celepsa.rrcc.bd.ConexionBD;
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
                    lstRetorno.add(populatePersona(objResult));
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
   
   private PersonaBE populatePersona(ResultSet resultado) throws SQLException {
        PersonaBE objPersonaBE = new PersonaBE();

        objPersonaBE.setId(resultado.getString("id"));
        
        objPersonaBE.setNombre(resultado.getString("nombre"));

        return objPersonaBE;
    }
}
