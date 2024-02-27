<%@page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<body>

<h2>HTML Forms</h2>

<form action="/myServlet2">
  <label for="name">First name:</label><br>
  <input type="text" id="name" name="name" value="John"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname" value="Doe"><br><br>
  <input type="submit" value="Submit">
</form>
<p>Este es un formulario hecho en una jsp</p>

</body>
</html>