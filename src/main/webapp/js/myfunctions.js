$(document).ready(function () {
    $.ajax({
        url:'https://softwar1.herokuapp.com/myApp/BuscarProfesor',
        dataType: "json",
        success: function (personas) {
            var personas = [personas];
            console.log(personas);
            var personasHTML = $.map(personas, function (persona, index) {
                var listItem = $('<tr></tr>');
                $('<td>' + persona.nombres + '<td>').appendTo(listItem);
                $('<td>' + persona.apellidos + '<td>').appendTo(listItem);
                $('<td>' + persona.telefonos + '<td>').appendTo(listItem);
                return listItem;
            });
            $('.table tbody').detach().html(personasHTML).appendTo('.table');
        },
        error: function () {
            alert("Error");
        },
        timeout: 3000
        
    });
    });