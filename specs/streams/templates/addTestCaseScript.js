    $(document).on('click', '.buttongroup', function(){
    var path = $(this).closest("div").find("#testCasesTable tbody");
    var number = path.find("tr").length;
    $(path).append("<tr><td>" + (number + 1) + "</td><td></td><td></td><td></td></tr>");
    });