<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@page import="com.cts.vms.BO.UserBo,com.cts.vms.model.*,java.util.*"%> 
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
<center><h1>User Details</h1></center>
<table>
<tr>
    <th>Emp Id</th>
    <th>First Name</th>
    <th>Last Name</th> 
    <th>Age</th>
      <th>Gender</th>
        <th>Contact</th>
          <th>Email</th>
            <th>password</th>
              <th>Branch</th>
</tr>

 <%
UserBo ub=new UserBo();
ArrayList<User> u=ub.viewAllMembers();

 for(User u1:u) 
 {
	 //System.out.println(u1.getEmpid());
	 %>

 <tr>
    <td><%=u1.getEmpid() %></td>
    <td><%=u1.getFirstname() %></td>
    <td><%=u1.getLastname() %></td>
<td><%=u1.getAge() %></td>
    <td><%=u1.getAge() %></td>
    <td><%=u1.getAge() %></td>
    <td><%=u1.getAge() %></td>
    <td><%=u1.getAge() %></td>
    <td><%=u1.getAge() %></td>
</tr>
 <%} %> 


</table>
</body>
</html>
