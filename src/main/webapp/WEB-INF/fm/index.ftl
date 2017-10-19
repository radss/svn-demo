	
<html>

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    
    <style type="text/css">
    	<#-- Tuto diraktivu musím mít uloženou abych ve .ftl souboru mohl používat externí css 
    		https://stackoverflow.com/questions/27296395/how-to-include-external-javascript-and-css-files-in-ftl-file
    	-->
		<#include "/resources/crunchify.css/">
		
	
	</style>
	
	<script type="text/javascript">
		<#include "/resources/crunchify_2.js">
	</script>
    
	
	
  </head>
  
  
  <body>
    
 	<script>
 		myName();
 	</script>
    
    Message:${message!''}
    
    
    <h2>Welcome to View by tiles</h2>
    
    Odkazy:<br/>
    <a href="old">old</a><br/>
    <a href="showStudents">showStudents</a><br/>
    <a href="searchStudents">searchStudents</a><br/>
    
  </body>
</html>
