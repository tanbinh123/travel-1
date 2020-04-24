window.onload = function () {
    //发布页面整合并提交from表单
    $("#send").click(
        function () {
            $("#real_title").val($("#title").val());
            $("#real_context").val($("#context").val());
        }
    );
    //点赞
    $(".like").click(
        function () {
            if ($(".like").is(":checked")){
                alert("点赞")
                $("#no-fa-thumb").addClass("fa-thumbs-up");
                var aid=$(".aid").val();
                $.ajax({
                    type:"POST",
                    url:"/userAndArticleInc",
                    contentType:"application/json",
                    data:JSON.stringify({
                        "aid":aid,
                        "type":1,
                    }),
                    success:function (response) {
                        if (response.code==200){
                            window.location.reload();
                        }
                    },
                    dataType:"json"
                })
            }else {
                alert("取消点赞")
                $("#yes-fa-thumb").removeClass("fa-thumbs-up");
                $("#yes-fa-thumb").addClass("fa-thumbs-o-up");
                var aid=$(".aid").val();
                $.ajax({
                    type:"POST",
                    url:"/userAndArticleDel",
                    contentType:"application/json",
                    data:JSON.stringify({
                        "aid":aid,
                        "type":1,
                    }),
                    success:function (response) {
                        if (response.code==200){
                            window.location.reload();
                        }
                    },
                    dataType:"json"
                })

            }
        }
    )
    //收藏
    $(".collect").click(
        function () {
            if ($(".collect").is(":checked")){
                $("#no-fa-star").addClass("fa-star");
                $("#no-fa-star").removeClass("fa-star-o");
                var aid=$(".aid").val();
                $.ajax({
                    type:"POST",
                    url:"/userAndArticleInc",
                    contentType:"application/json",
                    data:JSON.stringify({
                        "aid":aid,
                        "type":2,
                    }),
                    success:function (response) {
                        if (response.code==200){
                            window.location.reload();
                        }
                    },
                    dataType:"json"
                })
            }else {
                $("#yes-fa-star").removeClass("fa-star");
                $("#yes-fa-star").addClass("fa-star-o");
                var aid=$(".aid").val();
                $.ajax({
                    type:"POST",
                    url:"/userAndArticleDel",
                    contentType:"application/json",
                    data:JSON.stringify({
                        "aid":aid,
                        "type":2,
                    }),
                    success:function (response) {
                        if (response.code==200){
                            window.location.reload();
                        }
                    },
                    dataType:"json"
                })
            }
        }
    )
    //关注
    $("#attention").click(
        function () {
            if ($("#attention").is(":checked")){
                $("#plus").addClass("fa-check");
                $("#plus").removeClass("fa-plus");
                $("#att").val("已关注");
            }else {
                $("#plus").removeClass("fa-check");
                $("#plus").addClass("fa-plus");
                $("#att").val("关注");
            }
        }
    )


};




