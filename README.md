# Projeto
Esse projeto contém os exercícios praticados durante o curso JAX-WS: Domine a criação de webservices SOAP, no Alura.

O repositório irá conter uma branch para cada aula, sendo a branch aula_X, onde X é o número da aula. O curso contém 7 aulas, sendo assim teremos 7 branch mais a branch master. Todas as aulas serão mergeadas na branch master.


## Infra estrutura
Para esse curso iremos utilizar os seguintes pacotes:

 - [Java 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html), porém o Java 7 funciona perfeitamente
 - [JBoss Wildfly 8.x](https://wildfly.org/downloads/)
 - [SOAPUI](https://www.soapui.org/) para testes
 
 
## Introdução
Assim como as pessoas não conseguem viverem isoladas, os sistemas também não conseguem. Constantemente precisamos trocar informações, ou até mesmo solicitar processamento de um determinado dado a um sistema mais "especializado". Por exemplo, quando você cria um site e deseja que seus usuários conheçam a sua localização física, uma das formas mais simples é compartilhar a sua localização no Google Maps, com iso você irá consumir um serviço do Google aonde você informa a sua localização e o Maps lhe fornece um mapa de como chegar até você. Isso é um exemplo de uma aplicação consumindo um serviço. Um outro exemplo classico é obter o endereço completo através do CEP, para isso você consome um dos serviço dos Correios aonde você informa o CEP e recebe o endereço completo, como logradouro, cidade, estado etc. Esses são serviços web, mais conhecido como webservice.

Nesse curso iremos desenvolver um webservice SOAP, que já foi hipster um dia....hehehe

### SOAP
O [SOAP](https://pt.wikipedia.org/wiki/SOAP) é um protocolo para troca de dados em formato XML de forma distribuída e descentralizada. O SOAP adere a espeficiação do [W3C](https://www.w3.org/TR/soap/) e que possui um consórcio de grandes empresas que contribuem com essa especificação. Você também pode utilizar o protocolo HTTP para trafegar o webservice SOAP, inclusive é o que faremos nesse projeto.

Uma mensagem SOAP possui um envelope e dentro dele podemos inserir, opcionalmente, um cabeçalho e obrigatóriamente um corpo.

Seguindo essa especificação os sistemas podem trocar informações entre si.  