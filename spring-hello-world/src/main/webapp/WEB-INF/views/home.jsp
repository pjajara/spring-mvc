<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
</head>
<body>
  <h1>Hello World!</h1>
 
<hr/>
 
  <form action="hi">
    Enter your name: <input type="text" name="name"> 
    Enter your company name: <input type="text" name="company">
    <input type="submit" value="Submit">
  </form>
 
</body>
</html>