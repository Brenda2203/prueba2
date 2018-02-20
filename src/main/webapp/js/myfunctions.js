function sendAjax() {
 
    var nota = new Object();
    nota.title = $('#title').val();
    nota.url = $('#url').val();
    nota.categories = $('#categories').val().split(";");
    nota.tags = $('#tags').val().split(";");
 
    $.ajax({
        url: "jsonservlet",
        type: 'POST',
        dataType: 'json',
        data: JSON.stringify(nota),
        contentType: 'application/json',
        mimeType: 'application/json',
 
        success: function (data) {
            $("tr:has(td)").remove();
 
            $.each(data, function (notas, nota) {
 
                var td_categories = $("<td/>");
                $.each(nota.categories, function (i, tag) {
                    var span = $("<span class='label label-info' style='margin:4px;padding:4px' />");
                    span.text(tag);
                    td_categories.append(span);
                });
 
                var td_tags = $("<td/>");
                $.each(nota.tags, function (i, tag) {
                    var span = $("<span class='label' style='margin:4px;padding:4px' />");
                    span.text(tag);
                    td_tags.append(span);
                });
 
                $("#added-notas").append($('<tr/>')
                        .append($('<td/>').html("<a href='"+nota.url+"'>"+nota.title+"</a>"))
                        .append(td_categories)
                        .append(td_tags)
                );
 
            }); 
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        }
    });
}