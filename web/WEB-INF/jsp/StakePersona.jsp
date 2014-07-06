<%-- 
    Document   : Documento
    Created on : 18-mar-2014, 23:10:02
    Author     : pmedina
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="Documento"/></title>
<sx:head/>

<link rel="stylesheet" type="text/css" href="view.css" media="all">
<script type="text/javascript" src="view.js"></script>
<script type="text/javascript" src="calendar.js"></script>
</head>
  <s:property value="accion"/>
        <s:form action="grabar" method="post" theme="simple">
            <s:hidden name="url" value="%{url}" />
  
<body id="main_body" >
    
        <s:actionerror theme="mensaje" />
        <s:actionmessage theme="mensaje" />

    
	<TABLE BORDER=0 WIDTH=600>


<TD WIDTH=200>
       
	<div id="form_container">
	
		
		<form id="form_813135" class="appnitro"  method="post" action="">
					<div class="form_description">
			 <br>&nbsp;&nbsp;<s:text name="Usted esta en :"/>
    <strong>
       Stakeholder - Personas
    </strong>
       
    <br>
                        <s:hidden name="Persona.id" value="%{Persona.id}" theme="simple"/>    
		</div>						
			<ul >
					
		<label class="description" for="element_1">Fecha Registro </label>
		<span>
			
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	 <s:textfield name="Persona.FechaRegistro" value="%{persona.FechaRegistro}" size="15" maxLength="10" theme="simple"/>
              
		 
		<br>
		<label class="description" for="element_2">Nombre </label>
		<span>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <s:textfield name="Persona.Nombre" value="%{Persona.Nombre}" size="15" maxLength="10" theme="simple"/>
			
			
		</span>
		<br>
		<label class="description" for="element_2">Apellido </label>
		<span>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <s:textfield name="Persona.Apellido" value="%{Persona.Apellido}" size="15" maxLength="10" theme="simple"/>
			
			
		</span>
		 <br>
		<label class="description" for="element_2">Alias </label>
		<span>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <s:textfield name="Persona.Alias" value="%{Persona.Alias}" size="15" maxLength="10" theme="simple"/>
			
			
		</span>
		
		<label class="description" for="element_8">Nivel Influencia </label>
		<div>
	  <s:select  list="LNinfluencia"
                                   listKey="id"
                                   listValue="Descripcion"
                                   name="Persona.NivelInfluencia.id"
                                   value="%{Persona.NivelInfluencia.id}"
                                 
                                   theme="simple"
                                   cssClass="texto"/>  
                    
		</div> 
                    
		</div> 
		
			
			
</TD>

<TD WIDTH=200>
    		
		<label class="description" for="element_1">Identidad </label>
                            <span>
			
                        <s:textfield name="Persona.Identidad" value="%{Persona.Identidad}" size="50" maxLength="100" theme="simple"/>    
                            </span>  
                <div>
<label class="description" for="element_1">Relacionado a: </label>
</div>
        

              
		<label class="description" for="element_5">Tipo de Documento </label>
		
		<div>
  <s:select  list="LTipo"
                                   listKey="id"
                                   listValue="Descripcion"
                                   name="Persona.TDoumentoIdentidad.id"
                                   value="%{Persona.TDoumentoIdentidad.id}"
                                 
                                   theme="simple"
                                   cssClass="texto"/>  
		</div> 
                		 <br>
		<label class="description" for="element_2">Nro Documento </label>
		<span>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <s:textfield name="Persona.NroDocumento" value="%{Persona.NroDocumento}" size="15" maxLength="10" theme="simple"/>
			
			
		</span>
                
                
                
                

                
              
       
</TD>
                
    <TR>
    <TD WIDTH=100>
        
        <input type="reset"  value="Cancelar" />
            		
			    <input type="hidden" name="form_id" value="813135" />
			    
				<input id="saveForm" class="button_text" type="submit" name="Guardar" value="Guardar" />
	</div>
	
            </form>	
        </TD>
        
            <TD WIDTH=100>
     
	
        </TD>

        </TR>


          
                        
                 


</TABLE>

       


     </s:form>      
   
           
      
        
	</body>
        
</html>