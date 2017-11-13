<%-- 
    Document   : modificarEmpleado
    Created on : 01-11-2017, 18:53:23
    Author     : Felipe
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
        <h1 align="center">Asistente de Modificacion de Empleados</h1>
        <form action="Modificar" method="post">
            <table border="1" align="center"> 
                <tr>
                    <td>Ingrese Rut:</td>               
                    <td><input type="text" name="rut"/></td> 
                </tr>
                <tr>
                    <td>Ingrese Nombre :</td>                
                    <td><input type="text" name="nombre"/></td>
                </tr>
                <tr>
                    <td>Ingrese Cargo:</td>                
                    <td><select name="cargo"/>
                    <option>Operador</option>
                    <option>Supervisor</option>
                    </select></td>
                </tr>  
                <tr>
                    <td>Ingrese Sueldo Base:</td>                
                    <td><input type="text" name="sbase"/></td>
                </tr>
                <tr>
                    <td>Ingrese Horas Extras:</td>                
                    <td><input type="text" name="hextras"/></td>
                </tr>
                <tr>
                    <td>Ingrese dias de ausencia:</td>                
                    <td><input type="text" name="ausencia"/></td>
                </tr> 
                <td><input type="submit" value="Modificar"></td>  
            </table>
        </form>
        <form  action ="Empleado.jsp" method="post">            
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
