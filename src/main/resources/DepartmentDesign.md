1. Search department info:  
Front-End send request   
-> DeptController(GetMapping comment for list(), AutoWired comment for DeptService interface)  
-> DeptServiceImpl(override interface method to search all data in department, AutoWired comment for DeptMapper(Data assess object))  
-> DeptMapper(@Select comment(cuz it's no nested) for list() and return info as List<Dept>)  
-> Controller get the data from database(use Result.success(data)) and return it to front-end  
Postman test(succeed -> get json data)  

2. 
