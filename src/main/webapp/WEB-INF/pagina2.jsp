<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<h2>Bienvenido!!</h2>

<p><c:out value="${name}" /></p>
<p><c:out value="${lname}" /></p>
<p>Aquí recupero los datos desde la JSP anterior a esta nueva jsp</p>

</body>
</html>