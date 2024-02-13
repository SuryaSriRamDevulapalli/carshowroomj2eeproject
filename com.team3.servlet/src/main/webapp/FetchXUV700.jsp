<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.servlet.encapsulated.Servletentity" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View all Products Page</title>
    <style>
    body{
		background-image: url(https://auto.mahindra.com/-/media/project/mahindra/dotcom/mahindra/dark-theme-mahindra-images/gallery/xuv700/photos/new-12-01-2024/xuv-700-website-1920x1080-2.jpg?rev=37d74bf16f62412db3a7ebaeadabd629&extension=webp);
		background-repeat: no-repeat;
		background-position: center right;
		background-size:  50%;
		background-attachment: fixed;
		font-family: Arial, sans-serif;		
		color: black;		
		margin: 0;
        padding: 0;
        
	}
        table {
            width: 40%;
            
        }
        th, td {
            border: 3px solid wheat;
         	padding: 8px;
        	text-align: left;
        }
        th {
            background-color: wheat;
        }
        h1{
        background-color: wheat;
		margin-top:  0;
        margin-bottom: 0;
        padding: 20px;
        }
        .bottom-bar {
    background-color: wheat;
    height: 100px;
    width: 100%;
    position: fixed;
    bottom: 0;
    left: 0;
}
    </style>
</head>
<h1 align = "center">The below are the details retrieved from Mahindra Database for XUV700!!</h1>
<body>
    <h2 style="margin-top: 20px;">XUV 700 Details:</h2>
    <table style="margin-top: 10px;">
<%
Object obj = session.getAttribute("FetchXUV700");
if(obj == null){
	out.print("No recors found");
}
else{
	List<Servletentity> entity = (ArrayList<Servletentity>) obj;
%>
<tr>
<th>carname:</th><th>variant:</th><th>price:</th><th>transmission:</th></tr>
<%
for(Servletentity s: entity){	
%>
<tr>
<td><%=s.getCarname()%></td>
<td><%=s.getVariant()%></td>
<td><%=s.getPrice() %></td>
<td><%=s.getTransmission()%></td>
</tr>
<%} } %>
    </table>
    
<div class="bottom-bar">
<button onclick="window.location.href='index.html';"style="font-size: 15px; padding: 10px 20px; background-color: black; color: wheat; border: none; border-radius: 5px; cursor: pointer;">Back to Homepage</button>


</div>    
</body>
</html>