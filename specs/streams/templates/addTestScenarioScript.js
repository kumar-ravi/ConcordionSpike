    $('#addTestScenario').bind('click', function() {
    var number = $('#testScenarios').length;
    $('#testScenarios').append("<br><div id=testScenario_"+ (number+1) + "><br>" +
    document.getElementById("testScenario_" + number).innerHTML + "<br></div>");
    $('#testScenarios #testScenario_'+(number+1)).find('#testCasesTable tr:gt(1)').remove()
    });