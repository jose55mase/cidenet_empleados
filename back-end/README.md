
## todo1-service
- [Indice](#indice)
- [Instalar](#instalar)
    - [Intellj](#IDE)
    - [TomCat](#tomcat)
- [Puertos](#puertos)
    - [Usuario](#usuario)
- [Correr](#Correr)
  - [Start](#Inicio)
    
  
## Servicio
Se usa como desarrollo el Spring boot implementado Hibernate y como Base de datos H2 sql, esta se construye y destruye mientras el programa este corriendo.

## instalar

    Maven .
    Java 11.


## tomcat

    Usar como motor.


## puertos

- Defecto
puerto : 8080
Este puerto se usa por defecto para por el spring-boot

Nota : validar que este puerto este libre ante de correr el programa

Definir las rutas a usar para consultar los datos de los de la DB.
| Listar | Editar | Eliminar | Guardar  |
| --- | --- | --- | --- |
| /product/list | /product/edit | /product/delete | /product/save |



## Inicio
User en la consola luego de instalar maven
-- mvn clean install
-- mvn packag
-- mvn spring-boot:run

![alt text](https://github.com/jose55mase/todo1_cidenet/tree/master/assets/start.png)
![alt text](https://raw.githubusercontent.com/jose55mase/todo1_cidenet/tree/master/assets/start.png) 





