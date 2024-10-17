<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="model.Customer"%>
<%@ page import="dao.CustomerDAO"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.util.ArrayList"%>

<%
    CustomerDAO customerDAO = new CustomerDAO();
    List<Customer> customers = new ArrayList<>();

    // Obtener todos los clientes
    try {
        customers = customerDAO.getAllCustomers();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Gestión de Clientes - Restaurante Los Pinos</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<h1>Gestión de Clientes</h1>

<!-- Formulario para agregar o editar un cliente -->
<form action="CustomerController" method="post">
    <input type="hidden" name="action" value="save">
    <label for="identifier">Identificador:</label>
    <input type="text" name="identifier" id="identifier" required>
    <label for="documentType">Tipo de Documento:</label>
    <input type="text" name="documentType" id="documentType" required>
    <label for="documentNumber">Número de Documento:</label>
    <input type="text" name="documentNumber" id="documentNumber" required>
    <label for="name">Nombre:</label>
    <input type="text" name="name" id="name" required>
    <label for="lastname">Apellido:</label>
    <input type="text" name="lastname" id="lastname" required>
    <label for="phone">Teléfono:</label>
    <input type="text" name="phone" id="phone" required>
    <label for="email">Correo Electrónico:</label>
    <input type="email" name="email" id="email" required>
    <label for="address">Dirección:</label>
    <input type="text" name="address" id="address" required>
    <label for="state">Estado:</label>
    <input type="text" name="state" id="state" required>
    <button type="submit">Guardar Cliente</button>
</form>

<!-- Tabla de clientes -->
<h2>Lista de Clientes</h2>
<table border="1">
    <thead>
    <tr>
        <th>Identificador</th>
        <th>Tipo de Documento</th>
        <th>Número de Documento</th>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Teléfono</th>
        <th>Correo Electrónico</th>
        <th>Dirección</th>
        <th>Estado</th>
        <th>Acciones</th>
    </tr>
    </thead>
    <tbody>
    <%
        for (Customer customer : customers) {
    %>
    <tr>
        <td><%= customer.getIdentifier() %></td>
        <td><%= customer.getDocumentType() %></td>
        <td><%= customer.getDocumentNumber() %></td>
        <td><%= customer.getName() %></td>
        <td><%= customer.getLastname() %></td>
        <td><%= customer.getPhone() %></td>
        <td><%= customer.getEmail() %></td>
        <td><%= customer.getAddress() %></td>
        <td><%= customer.getState() %></td>
        <td>
            <form action="CustomerController" method="post" style="display:inline;">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="identifier" value="<%= customer.getIdentifier() %>">
                <button type="submit">Eliminar</button>
            </form>
            <form action="CustomerController" method="post" style="display:inline;">
                <input type="hidden" name="action" value="edit">
                <input type="hidden" name="identifier" value="<%= customer.getIdentifier() %>">
                <button type="submit">Editar</button>
            </form>
        </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
