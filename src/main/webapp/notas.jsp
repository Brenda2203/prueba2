<%@page import="Model.Nota"%>
<%@page import="java.util.ArrayList"%>
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

    </head>
    <body>

        <%--  <%@include file="header.jsp" %> --%>
        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">

                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>Notas del curso</h1>
                    <p></p>

                    <div class="container">
                        <div class="row">
                            <div class="col">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Nombres</th>
                                            <th>Apellidos</th>
                                            <th>Tel�fono</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>
        <p></p>


    </body>
</html>