<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Page</title>
    <style>
    body{
		background-image: url(https://auto.mahindra.com/-/media/project/mahindra/dotcom/mahindra/dark-theme-mahindra-images/gallery/thar/desktop/thar-river-drive-image-mahindra-auto.png?rev=fbe294fdb7a34c92b764e770cbed7930&extension=webp);
		background-repeat: no-repeat;
		background-position: center;
		background-size:  50%;
		background-attachment: fixed;
		font-family: Arial, sans-serif;		
		color: black;		
		margin: 0;
        padding: 0;
        
	}
        table {
            width: 20%;
            
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
<h1 align = "center">The below details are deleted from the list cars in Mahindra Database of Thar!!</h1>
<body>
    <h2 style="margin-top: 130px;">Car Details:</h2>
    <table style="margin-top: 10px;">
        <tr>
            <th>Variant</th>
            <td><%= request.getParameter("variant") %></td>
        </tr>
        <tr>
            <th>Transmission</th>
            <td><%= request.getParameter("transmission") %></td>
        </tr>
    </table>
    
<div class="bottom-bar">
<button onclick="window.location.href='index.html';"style="font-size: 15px; padding: 10px 20px; background-color: black; color: wheat; border: none; border-radius: 5px; cursor: pointer;">Back to Homepage</button>


</div>    
</body>
</html>