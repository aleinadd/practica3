<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JStl- peactica4</title>
    </head>
    <body>
        <h1>Registro de libros </h1>
        <form action="ProcesaServlet4"  method="post">
           <label> Titulo:</label>
            <input type="text" name="titulo" value""">
            <br>
            <label>Autor:</label>
            <input type="text" name="autor" value="" />
            <br>
            <label> Resumen:</label>
            
            <textarea name="resumen" rows="4" cols="20">
            </textarea>
           
            <br>
            <br>
            <br>
            <p>Medio</p>
   <p><input type="radio" name="medio" value="fisico"/> Fisico </p>
   <p><input type="radio" name="medio" value="magnetico"/> Magnetico </p>
   
            <input type="submit" value="Enviar" />
        
        </form>
    </body>
</html>


