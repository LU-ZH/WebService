<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
<body>
    <table border="1" cellpadding="0" cellspacing="0" width="500" align="center" style="text-align: center">
        <tr>
            <td>ID</td>
            <td>NAME</td>
            <td><button onclick="toadd()">添加</button></td>
        </tr>
        <#list list as u>
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td><button onclick="deleteUser(${u.id})">删除</button><button>修改</button></td>
            </tr>
        </#list>
    </table>
<script>
    function toadd(){
        location='toAdd2.do'
    }
    function deleteUser(id){
        location='deleteUserById.do?id='+id;
    }
</script>
</body>
</html>