    var fileServerLocationTemplate = "//Suncorp/Banking/BPP/";
    var createTestScenarioTemplate = function () {
    var targetElement = document.getElementById('testScenarios')
    var number = $('#testScenarios .group').length;
    var scenarioTemplateHtml = document.getElementById("testScenarioTemplate").innerHTML.replace("Acceptance Criteria #dummynumber", "Acceptance Criteria # " + (number+1));
    $('#testScenarios').append("<br><div class= group id=testScenario_" + (number + 1) + "><br>" +
    scenarioTemplateHtml + "<br></div>");
    };
    document.ready = function () {
    if ($('#testScenarios .group').length < 1) {
    createTestScenarioTemplate();
    }
    document.getElementById("fileServerLocation").textContent = fileServerLocationTemplate;
    };

    $(document).on('click', '.buttongroup', function () {
    var path = $(this).closest("div").find("#testCasesTable tbody");
    var number = path.find("tr").length;
    $(path).append("<tr><td>" + (number + 1) + "</td><td><div contenteditable=\'true\'>...</div></td><td><div contenteditable=\'true\'>...</div></td><td><div contenteditable=\'true\'>...</div></td></tr>");
    });

    $('#addTestScenario').bind('click', function () {
    createTestScenarioTemplate();
    });

    function setFileServerLocation() {
        var streamToURLMapping = {
          PAF : "PAF",
          Customer : "Customer",
          Lending: "Lending"
        };
        var test = document.getElementById('comboStream').value;
        var fileServerLocation = streamToURLMapping[test];
        document.getElementById("fileServerLocation").textContent = fileServerLocationTemplate + fileServerLocation;
    }