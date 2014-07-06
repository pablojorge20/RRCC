/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celepsa.rrcc.bl;

import celepsa.rrcc.be.PersonaBE;
import celepsa.rrcc.da.PersonaDA;
import java.util.List;

/**
 *
 * @author pmedina
 */
public class PersonaBL {
 public List<PersonaBE> listarPersona(Integer pAg) throws Exception 
    {
           
        PersonaDA objSistemaDA = new PersonaDA();
        return objSistemaDA.listarPersona(pAg);
    }    
     public PersonaBE obtenerPersona(PersonaBE objPersona) throws Exception
    {
        PersonaDA objPersonaDA = new PersonaDA();
        return objPersonaDA.obtenerPersona(objPersona);
    }  
}
