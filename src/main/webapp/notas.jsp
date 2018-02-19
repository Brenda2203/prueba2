<%@page import="Model.Nota"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Notas</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400"><!-- Google web font "Open Sans", https://www.google.com/fonts/specimen/Open+Sans -->
        <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css"> <!-- Font Awesome, https://fortawesome.github.io/Font-Awesome/ -->
        <link rel="stylesheet" href="css/bootstrap.min.css">                       <!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
        <link rel="stylesheet" href="css/templatemo-style.css">                    <!-- Templatemo style -->

        <script src="http://code.jquery.com/jquery-latest.js">
        </script>

        <script>
            $(document).ready(function () {
                $('#submit').click(function (event) {
                    var nombreVar = $('#nombre').val();
                    var apellidoVar = $('#apellido').val();
                    var edadVar = $('#edad').val();
                    // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                    $.post('ActionServlet', {
                        nombre: nombreVar,
                        apellido: apellidoVar,
                        edad: edadVar
                    }, function (responseText) {
                        $('#tabla').html(responseText);
                    });
                });
            });
        </script>
    </head>
    <body>
        <h2>Ejemplo de AJAX con JSP y Servelts</h2>
        <form id="form1">
            Nombre:<input type="text" id="nombre" /> <br>
            Apellido: <input type="text" id="apellido" /> <br>
            Edad: <input type="text" id="edad" /> <br>
            <input type="button" id="submit" value="Añadir" /> 
        </form>
        <br>
        <!-- 	En este div metemos el contenido de la tabla con AJAX -->
        <div id="tabla"></div>
        <%--  <%@include file="header.jsp" %> --%>
        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">

                </div>
                <div class="col-sm-8 text-left"> 
                    <br>
                    <h1>Notas del curso</h1>
                    <p></p>
                    <br><br>
                    <div class="container">
                        <div class="row">
                            <div class="col">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Estudiante</th>
                                            <th>Tema</th>
                                            <th>Nota</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                        </div>

                        <br><br><br>
                        <a  href="menu.jsp">
                            <button type="button" class="btn tm-bordered-btn pull-xs-center">Volver</button>
                        </a>
                    </div>

                </div>

            </div>
        </div>
        <p></p>


    </body>
</html>