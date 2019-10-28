<%
int a=Integer.parseInt(request.getParameter("a"));
int b=Integer.parseInt(request.getParameter("b"));
if(a>b)
	out.println(a+"is maximum");
else
	out.println(b+"is maximum");
%>