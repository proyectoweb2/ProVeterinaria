<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
<title>Registro Cliente</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="estilos.css"  />
</head>

<body
	background="http://previews.123rf.com/images/clairev/clairev1306/clairev130600025/20026839-Dog-theme-seamless-background--Stock-Vector-paw.jpg">

	<h1>

		<img
			src="http://2.bp.blogspot.com/-UhvhlkcBRk0/TgfKPb7ZySI/AAAAAAAAAd0/nmIodnqisns/s1600/PERRO+DANDO+LA+PATA.bmp"
			align="right">
		<center>
			<a href="registroMascota.jsp"><right>
					<b>REGISTRA A TU MASCOTA</b>
				</right></a>
		</center>
	</h1>

	<marquee direction="down" width="200" HEIGHT="1000">
		<div>
			<img
				src="http://www.barkinews.com/wp-content/uploads/2014/10/perro-paseando-a-los-cachorros.jpg"
				width="200" HEIGHT="200" /> <img
				src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRabhHicvc_OUdu2DQKHeqZ4SnWVfL-W8fTCEgc7T_lhL7jVMHE"
				width="200" HEIGHT="200" /></a> <img
				src="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRhxJSxJ7teIjTC36174CsSRQA4gkQ3kgJ-X_C82d6LizsadAUwMw"
				width="200" HEIGHT="200" /></a> <img
				src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTgCcroNpHqTx40g7uNPkMphjJMUuVQKZ8H0SDRj0FfLibnsxz8"
				width="200" HEIGHT="200" /></a> <img
				src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRPfegXcj9H2UKh41jqyNisdBSKWhnwepRnuq_TiqQbV7Lt67_-iQ"
				width="200" HEIGHT="200" /></a> <img
				src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRgsVBsgSVWS3JV3-DHwRs1ATkxwIL2ECUgt2u1iJEfQtX1UpZe"
				width="200" HEIGHT="200" /></a> <img
				src="https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRPfegXcj9H2UKh41jqyNisdBSKWhnwepRnuq_TiqQbV7Lt67_-iQ"
				width="200" HEIGHT="200" /></a>


		</div>
	</marquee>


	<div id="envoltura">
		<div id="contenedor">

			<div id="cabecera">
				<img
					src="http://www.cookieswil.com/media/files/uploads/2014/02/Seguros-para-perros-y-gatos.3-300x225.jpg"
					width="75" height="80">
			</div>

			<div id="cuerpo">
				<form action = "crearPersona" id="form-login"  method="post" autocomplete="off">
					<!--A saber, el atributo for funciona como el id.-->
					<!--ejemplo <label for="usuario">Usuario:</label>-->
					<!--required es nuevo en html5, si el campo estÃ¡ vacÃ­o te avisa, pero cuidado, no valida la informaciÃ³n-->
					<p>
						<label>Nombres :</label>
					</p>
					<input name="nombre" type="text" id="nombre"
						placeholder="Nombre" autofocus="" required="">
					</p>
					<p>
						<label>Apellidos :</label>
					</p>
					<input name="apellido" type="text" id="apellido"
						placeholder="Apellidos" autofocus="" required="">
					</p>
					<p>
						<label>Username:</label>
					</p>
					<input name="username" type="text" id="username"
						placeholder="ejemplo@gmail.com" autofocus="" required="">
					</p>
					
					<p>
						<label>Contraseña:</label>
					</p>
					<input name="pass" type="password" id="pass"
						placeholder="Password" required="">
					</p>
					
					<p>
						<label>Telefono:</label>
					</p>
					<input name="telefono" type="text" id="telefono"
						placeholder="Ingrese telefono" autofocus="" required="">
					</p>
					
					
					<p>
						<label>Direccion:</label>
					</p>
					<input name="direccion" type="text" id="direccion"
						placeholder="Direccion" autofocus="" required="">
					</p>
					
					<p>
						<label>Mascota:</label>
					</p>
					<input name="pet" type="text" id="pet"
						placeholder="Nombre mascota" autofocus="" required="">
					</p>
				
					
					<p id="bot">
						<input type="submit" id="submit" name="submit" value="Registrar"
							class="boton">
					</p>
				</form>
			</div>
			<!--fin cuerpo-->

			<div id="pie">Registro</div>
		</div>
		<!-- fin contenedor -->
	</div>
	<!--fin envoltura-->
	<br>
	<br>
	<table border="2" bgcolor="#808080">
		<tr>
			<td><a href="menu.jsp">Regresar</a>
			<td>
		<tr>
	</table>

	<p>
		<a href="http://jigsaw.w3.org/css-validator/check/referer"> <img
			style="border: 0; width: 88px; height: 31px"
			src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
			alt="Â¡CSS VÃ¡lido!" />
		</a>
	</p>
	<p>
		<a href="http://validator.w3.org/check?uri=referer"><img
			src="http://www.w3.org/Icons/valid-html401"
			alt="Valid HTML 4.01 Transitional" height="31" width="88"></a>
	</p>
</body>

</html>