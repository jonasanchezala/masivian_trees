# Masivian_Challenge

El ejercicio se desarrollo en Spring Boot y para ejecutarlo se creo un archivo .jar en la siguiente ruta

masivian_trees\trees\build\libs\tree-1.0-SNAPSHOT.jar

Y utilizamos el siguiente comando para ejecutarlo

java -jar tree-1.0-SNAPSHOT.jar

El servidor donde se despliega la aplicacion corre en el puerto 8080 y expone los siguientes servicios rest

Servicio para crear el arbol
Enpoint: http://localhost:8080/trees 
HTTP Method: POST
Body: //Tiene un atributo que es una lista de enteros que seran los nodos del arbol
{
    "nodeElements": [
        5,
        3,
        8,
        6,
        9,
        1,
        4,
        10
    ]
}
Response: //Este servicio responde un status code indicando si la creacion fue exitosa
Status Code: 200

Servicio para obtener el ancestro comun mas cercano 
Enpoint: http://localhost:8080/trees/getLowestCommonAncestor
HTTP Method: GET
Body: //Tiene un atributo que es una lista de enteros que seran los nodos del arbol, y los dos valores de los nodos 
{
    "treeElements": [
        5,
        3,
        8,
        6,
        9,
        1,
        4,
        10
    ],
    "nodeValue1": 6,
    "nodeValue2": 10
}
Response: //Este servicio responde un status code y el valor del nodo mas cercano indicando si la creacion fue exitosa
8
Status Code


En la raiz del repositorio se encuentra el archivo tree.postman_collection.json con unos request para hacer el llamado en postman

