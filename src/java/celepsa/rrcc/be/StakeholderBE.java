/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celepsa.rrcc.be;

import java.util.Date;

/**
 *
 * @author pmedina
 */
public class StakeholderBE {
     private String id;
    private String FechaRegistro;
    private String Nombre;
    private NivelInfluenciaBE NivelInfluencia;  
    private String Identidad;
    private String Fotografia;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }




    /**
     * @return the Identidad
     */
    public String getIdentidad() {
        return Identidad;
    }

    /**
     * @param Identidad the Identidad to set
     */
    public void setIdentidad(String Identidad) {
        this.Identidad = Identidad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the NivelInfluencia
     */
    public NivelInfluenciaBE getNivelInfluencia() {
        return NivelInfluencia;
    }

    /**
     * @param NivelInfluencia the NivelInfluencia to set
     */
    public void setNivelInfluencia(NivelInfluenciaBE NivelInfluencia) {
        this.NivelInfluencia = NivelInfluencia;
    }

    /**
     * @return the FechaRegistro
     */
    public String getFechaRegistro() {
        return FechaRegistro;
    }

    /**
     * @param FechaRegistro the FechaRegistro to set
     */
    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    /**
     * @return the Fotografia
     */
    public String getFotografia() {
        return Fotografia;
    }

    /**
     * @param Fotografia the Fotografia to set
     */
    public void setFotografia(String Fotografia) {
        this.Fotografia = Fotografia;
    }
}
