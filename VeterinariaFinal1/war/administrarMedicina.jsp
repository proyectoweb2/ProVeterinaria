<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
    <link type="text/css" href="estilos.css" rel="stylesheet">
</head>
<body bgcolor=#00FFFF>
    <div id = "envoltura">
        <div id="contenedor">
 
            <div id="cabecera" >
                <img src="http://www.veterinariadelbosque.com/images/clinica/iconos/medicina-interna.png" width="75" height="80">
            </div>
 
            <div id="cuerpo">
               <form action="medicinasave" method="get">
                    <!--A saber, el atributo for funciona como el id.-->
                    <!--ejemplo <label for="usuario">Usuario:</label>-->
                    <!--required es nuevo en html5, si el campo está vacío te avisa, pero cuidado, no valida la información-->
                     <p><label >Nombre :</label></p>
                        <input type="text" size="20" name="nom" placeholder="Nombre de Medicamento" value=""></p>
						<br>
					<p><label >Cantidad:</label></p>
                        <input type="number" size="20" name="can" placeholder="Cantidad del Medicamento" value=""></p>
						<br>
					<p><label >Veterinario:</label></p>
							<select name="doc">
									<option value="Veterinario">Veterinario</option>
							</select>
                    <p id="bot"><input type="reset" name="NO" value="Cancelar">
					<font color=#ececec>_</font>
					<input type="submit" name="OK" value="Guardar"></p>
                </form>
            </div><!--fin cuerpo-->
 
            <div id="pie"> Medicamentos</div>
        </div><!-- fin contenedor -->
			<br><br><br><br><center><table border="2" bgcolor=#fff><tr><td>
			<a href="indiceMedicina.html">Regresar</a>
			</td></tr></table></center><br>
    </div><!--fin envoltura-->

</body>
 
</html>
