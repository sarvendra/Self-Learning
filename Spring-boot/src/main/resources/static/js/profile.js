$(document).ready(function() {
    $('#firstName').on('input', function(e) {
        $("input[name=address]").val('Orchid Petals');
        console.log($("input[name=address]").val())
    });

//    $("#submit-button").click(function(event) {
//        event.preventDefault();
//        var postUrl = "/apps/";
//        var objectTobeSent = {};
//        $("#profile-form").serializeArray().map(function(x){objectTobeSent[x.name] = x.value;});
//        console.log(JSON.stringify(objectTobeSent));
//        $.ajax({
//            url: postUrl,
//            type: 'post',
//            contentType: 'application/json',
//            data: JSON.stringify(objectTobeSent),
//            success: function (response) {
//                console.log("app basic updated successfully");
//            },
//            error: function(response, status, error) {
//                console.log('XHR failure: ' + status);
//                console.log(error);
//            }
//        });
//    });
});