

<%
    
   String user=(String) request.getSession().getAttribute("admin_session");
   if(user==null)
   {
       out.println("Unauthorised Access! Redirecting to Login Page. Please wait..");
   %>
   
   <script>
       
        window.setTimeout(function(){

        // Move to a new location or you can do something else
        window.location.href = 'search.jsp';

    }, 2500);
       
    
  </script>
 
   
   
   <%
   }
else
{
     out.println("Unauthorised Access! Redirecting to Search Page. Please wait..");
  
%>
   
   <script>
       
        window.setTimeout(function(){

        // Move to a new location or you can do something else
        window.location.href = 'search.jsp';

    }, 2500);
       
    
  </script>
 
   
   
   <%
}
    
    %>


