<%-- 
    Document   : home_cariri_filmes
    Created on : 09/04/2020, 12:03:32
    Author     : Jarmeson
--%>
<%@page import="br.fjn.edu.pos.web.domain.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Inicial</title>
    </head>
    <body>
        <% 
            User user = (User) session.getAttribute("serLogged");
        %>
        <main>
            <nav>
                <p>Menu de Filmes</p>
            </nav>
            <section>
                <p style="text-align: right;">
                    <%=user.getName()%>
                </p>
                <p>Filme 1</p>
                <p>Filme 2</p>
                <p>Filme 3</p>
            </section>
        </main>
    </body>
</html>
