<!DOCTYPE html>
<html lang="cs">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  </head>
  <body>
  
    <#list students as student>
      Student: ${student.name!'-nazname jmeno-'} (${student.age!'-naznamy vek-'}) <br/> 
    </#list>
    
  </body>
</html>
