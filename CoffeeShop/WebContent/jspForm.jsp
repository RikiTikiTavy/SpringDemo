<%@ page import="java.util.*" %>

<html>
<body>
<h1> align="center">Chocolate Recommendation JSP</h1>
<p>

<%
List<String> styles = (List)request.getAttribute("styles");
for(String s: styles){
	out.println("<br> Try this: " + s);
}
%>
</body>
</html>