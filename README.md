# 💻Desafio APIRest - Empréstimos para clientes

Este desafio consiste em criar uma APIRest que concede emprétimos para clientes, baseado em seu salário, idade e região.

### O que foi usado para este desafio?
  - Linguagem Java 17
  - Spring Boot 3.5.11
  - Spring Web
  - Lombok

### Como o projeto está organizado?
Está organizado dessa seguinte forma

```
DesafioEmprestimoApplication.java -> Classe principal
Pacotes:
-> model (classes Person e Loan)
-> model.enums (enum TypeLoan)
-> service (classe LoanService)
-> controller (classe LoanController)
```

## Regras de negócio
Este desafio possui alguma regras para que nossa aplicação funcione :)

  - Se o cliente tiver salário <= 3000, concede-se o empréstimo pessoal (PERSONAL)
  - Se o cliente tiver salário <= 3000, se tiver idade menor do que 30 anos e residir em SP, concede-se o empréstimo pessoal (PERSONAL)
  - Se o cliente tiver salário maior ou igual a 5000, concede-se o empréstimo consignado (CONSIGNMENT)
  - Se o cliente tiver salário <= 3000, concede-se o empréstimo com garantia (GUARANTEED)
  - Se o cliente tiver salário <= 3000, se tiver idade menor do que 30 anos e residir em SP, concede-se o empréstimo com garantia (GUARANTEED)

Cada tipo de emprétimo possui uma taxa:
- Empréstimo pessoal, taxa de 4%
- Empréstimo consignado, taxa de 3%
- Empréstimo com garantia, taxa de 2%

### ✅ Exemplo de uso
POST
```
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Joao Gabriel",
    "income": 4000.00,
    "location": "SP"
}
```
```
{
	"age": 26,
	"cpf": "275.484.389-23",
	"name": "Joao Gabriel",
	"income": 4000.0,
	"location": "SP",
	"loans": [
		{
			"type": "PERSONAL",
			"interest_rate": 4
		},
		{
			"type": "GUARANTEED",
			"interest_rate": 3
		}
	]
}
```

Na requisição do POST é retornado o verbo HTTP 200 OK
