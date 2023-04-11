# Teste_tinova

Tecnologias usadas: java 11,banco de dados h2,springdatajpa,devtools.

Requisitos: springboot,maven,jpa,h2.

Endpoints:

findAll: http://localhost:8080/veiculo

findById: http://localhost:8080/veiculo/id

findUnSoldvehicles: http://localhost:8080/veiculo/findUnSoldvehicles

insert: http://localhost:8080/veiculo
payload: 

{
    "veiculo" : "golf",
    "marca" : "volkswagen",
    "ano" : "2015",
    "descricao" : "veiculo automotivo" 
}


update: http://localhost:8080/veiculo/id
payload: 

{
    "veiculo" : "golf",
    "marca" : "volkswagen",
    "ano" : "2015",
    "descricao" : "veiculo automotivo" 
}

delete: http://localhost:8080/veiculo/id

