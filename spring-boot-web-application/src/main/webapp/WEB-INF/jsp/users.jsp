<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<style>
      table,
      th,
      td {
        padding: 10px;
        border: 1px solid black;
        border-collapse: collapse;
      }
    </style>
</head>
<body>
 <div >
  <header>
   <h1>Traditional Web App with Spring Boot and Spring Web!</h1>
   <i>Using in built H2 data base</i><br/>
    <i>Using Spring JPA</i>
  </header>
  <div >
   <h1>Users List</h1>
   <table>
    <tr>
     <th>Id</th>
     <th>Name</th>
     <th>Delete User</th>
     <th>Edit User</th>
    </tr>
    <c:if test = "${users.size() > 0}">
    <c:forEach var="user" items="${users}">
     <tr>
      <td>${user.id}</td>
      <td>${user.name}</td>
       <td><a href="/delete?userId=${user.id}"> Delete</a></td>
        <td><a href="/edituser?userId=${user.id}"> Edit</a></td>
     </tr>
    </c:forEach>
    </c:if>
    <c:if test = "${users.size() == 0}">
     <tr>
      <td>No Data Available!</td><td></td>
      </tr>
     </c:if>
   </table>
  </div>

 </div>
<div>
<c:if test = "${editUser != null}">

<form id="edituser" action="edituser" method="post">
 <table>
    <tr>
    <td><label>Name: </label></td>
    <td><input type="text" name="name" value="${editUser.name}"></td>
     </tr>
      <tr>
    <td>
    <label>Id: </label></td>
   <td> <input type="text" name="id" value="${editUser.id}" readonly></td>
     </tr>
     <tr>
    <td></td><td>
    <button>Update</button></td>  </tr>
</form>
</c:if>
</div>

<div>
<c:if test = "${editUser == null}">
<c:if test = "${errorMsg != null}">
<b style="color:red">${errorMsg}</b>
</c:if><br/>
<b>Add User:</b><br/>
<form id="adduser" action="adduser" method="post">
 <table>
    <tr>
    <td><label>Name: </label></td>
    <td><input type="text" name="name"></td>
     </tr>
  
    <td></td><td>
    <button>Add User</button></td>  </tr>
</form>
</div>
 </c:if>
</body>

</html>