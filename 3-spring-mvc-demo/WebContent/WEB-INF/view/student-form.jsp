<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
   <form:form action="processStudentForm" modelAttribute="student">
     First name: <form:input path="firstName" /> 
     <br>
     Last name: <form:input path="lastName" /> 
     <br>
     
     Country:
     <form:select path="country">
     
       <form:option value="IND" label="India" />
       <form:option value="PAK" label="Pakistan" />
       <form:option value="SL" label="ShriLanka" />
       <form:option value="BAN" label="Bangladesh" />
     
     </form:select>
     <br>
     Favorite Language:
     Java <form:radiobutton path="favoriteLanguage" value="Java"/>
     Python <form:radiobutton path="favoriteLanguage" value="Python"/>
     C# <form:radiobutton path="favoriteLanguage" value="C#"/>
     PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
     <br>
     Operating System:
     Linux <form:checkbox path="operatingSystems" value="Linux"/>
     Windows <form:checkbox path="operatingSystems" value="Linux"/>
     IOS <form:checkbox path="operatingSystems" value="Linux"/>
     
     <br>
     <input type="submit" value="Submit" />
     <br>
   </form:form>
</body>
</html>