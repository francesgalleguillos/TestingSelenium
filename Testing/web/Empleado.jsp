<%-- 
    Document   : Empleado
    Created on : 29-oct-2017, 20:12:40
    Author     : frances
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solemne 2 Java Web</title>
    </head>
    
     <style>

  .titulo {
    background: grey;
    margin-bottom: 10px;
    padding: 10px;
    color: white;
    border-bottom: 20px solid black;  
  }

  #footer{
    background: #000;
    color: white; 
    text-align: center;
    padding: 20px;
  } 

  #article{
    padding-left: 50px;
    padding-right: 50px;
  }

  </style>
    
    <body>
        
        <div class="container-fluid col-lg-12 col-md-12 col-sm-12 col-xs-12">
      <nav class="titulo">
        <h1 align="center">HACKER STAR</h1>
        <h3 align="center">Control de Empleados</h3>
      </nav>
        </div>
        <h1 align="center">ELIJA UNA OPCION</h1>
        
        <table border="1" align="center"> 
            <form  action ="crearEmpleado.jsp" method="post">            
                <td><input type="submit" value="Agregar Empleados"></td>            
            </form>  
            <form  action ="listarEmpleado" method="post">            
                <td><input type="submit" value="Listar Empleados"></td>            
            </form>
            <form  action ="modificarEmpleado.jsp" method="post">            
                <td><input type="submit" value="Modificar Empleados"></td>            
            </form>
            <form  action ="eliminarEmpleado.jsp" method="post">            
                <td><input type="submit" value="Eliminar Empleados"></td>            
            </form>
            <form  action ="Listar" method="post">            
                <td><input type="submit" value="Calcular Sueldo Empleado"></td>            
            </form>
        </table>
        <form  action ="index.html" method="post">            
            <td><input type="submit" value="Volver"></td>            
        </form>
        


    </body>
    
    <footer class="container-fluid">
      <div class="row">
        <div class="col-lg-12">
          <p id="footer">Frances Galleguillos - Javier Lau - Felipe Peñaloza ©</p>                      
        </div>
      </div>
    </footer>
    
</html>
