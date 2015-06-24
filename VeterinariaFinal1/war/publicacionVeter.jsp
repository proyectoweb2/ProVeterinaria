<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>iniciar sesion</title>
    <link type="text/css" href="estiloSug.css" rel="stylesheet" />
</head>
 
<body background="http://previews.123rf.com/images/clairev/clairev1306/clairev130600025/20026839-Dog-theme-seamless-background--Stock-Vector-paw.jpg">


    <div id = "envoltura">
        <div id="contenedor">
 
            <div id="cabecera" >
                <img src="http://www.cookieswil.com/media/files/uploads/2014/02/Seguros-para-perros-y-gatos.3-300x225.jpg" width="75" height="80">
            </div>
 
            <div id="cuerpo">
                <form action="publicacionsave" method="get">
                    <!--A saber, el atributo for funciona como el id.-->
                    <!--ejemplo <label for="usuario">Usuario:</label>-->
                    <!--required es nuevo en html5, si el campo está vacío te avisa, pero cuidado, no valida la información-->
                   	<p><label >Nombre/Apodo:</label></p>
                        <input name="admin" type="text" placeholder="Ingrese Nombre" autofocus="" required="" value="Doctor Veterinario" readonly></p>
						<br>

					<p><label >Numero:</label></p>
                        <input name="nume" type="number" placeholder="Numero" autofocus="" required="" value="<%=(int)(Math.random()*1000 + 1)%>" readonly></p>
						<br>	
					<p><label >Publicación:</label></p>
						<select name="pdoc">
								<option value="Publicacion">Publicacion</option>
						</select>
						<br>
					<p><label>Publicación/Aviso:</label></p>
						<textarea name="pub" rows=7 cols=44 placeholder="Ingresa texto a mandar"></textarea> <br>
                    <p id="bot"><center><input type="submit" name="OK" value="Enviar"></center></p>
                </form>
            </div><!--fin cuerpo-->
 
            <div id="pie"> Publicación</div>
        </div><!-- fin contenedor -->
        	<center><br><br><br><table border="2" bgcolor="#808080"><tr><td>
<a href="indicePublicacion.html">Regresar</a>
<td><tr></table>
</center>
    </div><!--fin envoltura-->
</body>
 
</html>