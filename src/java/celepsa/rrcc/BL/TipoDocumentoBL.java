/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celepsa.rrcc.BL;

import celepsa.rrcc.BE.TipoDocumentoBE;
import celepsa.rrcc.da.TipoDocumentoDA;
import java.util.List;

/**
 *
 * @author pmedina
 */
public class TipoDocumentoBL {
        public List<TipoDocumentoBE> ListarTipoDocumento()  throws Exception
    {
        TipoDocumentoDA objSistemaDA = new TipoDocumentoDA();
        return objSistemaDA.listarTipoDocumento();
    }


}
