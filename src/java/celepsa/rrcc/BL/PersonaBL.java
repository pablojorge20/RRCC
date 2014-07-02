/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celepsa.rrcc.BL;

import celepsa.rrcc.BE.PersonaBE;
import celepsa.rrcc.DA.PersonaDA;
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
}
