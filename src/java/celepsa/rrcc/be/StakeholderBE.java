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
    private Date FechaRegistro;
    private String Nombre;
    private String NivelInfluencia;  
    private String Identidad;

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
     * @return the FechaRegistro
     */
    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    /**
     * @param FechaRegistro the FechaRegistro to set
     */
    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    /**
     * @return the NivelInfluencia
     */
    public String getNivelInfluencia() {
        return NivelInfluencia;
    }

    /**
     * @param NivelInfluencia the NivelInfluencia to set
     */
    public void setNivelInfluencia(String NivelInfluencia) {
        this.NivelInfluencia = NivelInfluencia;
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
}
