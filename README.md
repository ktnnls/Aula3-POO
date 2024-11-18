Neste repositório estarão 3 exercícios em JAVA, feitos na aula 3 da faculdade de Análise e Desenvolvimento de Sistemas - UNINTER

Exercício 1:  localizado na pasta ProjetoAluno

Este projeto em Java simula um sistema básico de gestão de alunos e cursos em uma empresa educacional. Ele utiliza conceitos fundamentais de Programação Orientada a Objetos (POO) para criar, manipular e exibir informações sobre os alunos, seus cursos e os pagamentos de mensalidades, considerando possíveis descontos.

Funcionalidades do Projeto
Classe Aluno:

Representa um aluno com os atributos:
nome: Nome do aluno.
matricula: Número de matrícula do aluno.
desconto: Percentual de desconto aplicado na mensalidade.
curso: Curso no qual o aluno está matriculado.
Métodos principais:
info(): Exibe as informações detalhadas do aluno, incluindo o curso e o valor da mensalidade com desconto.
pagamento(): Calcula o valor da mensalidade após aplicar o desconto.
Classe Curso:

Representa um curso com os atributos:
nome: Nome do curso.
mensalidade: Valor da mensalidade.
Métodos principais:
info(): Exibe as informações do curso, como nome e valor da mensalidade.
Classe Principal:

Classe responsável por instanciar objetos de Aluno e Curso, e demonstrar o funcionamento do sistema.
Criação de um exemplo:
Um aluno chamado Ribamar, matriculado no curso de Engenharia com uma mensalidade de R$ 1000,00 e um desconto de 10%.
Demonstração do Sistema
Ao executar o programa, ele exibe no console:

Informações do aluno, como nome, matrícula, desconto e o valor final da mensalidade.
Detalhes do curso associado ao aluno.

Exercício 2: Localizado na pasta Notas
Projeto: Sistema de Avaliação de Alunos
Este projeto em Java simula um sistema básico de avaliação de alunos com base em notas e frequência. Ele utiliza princípios de Programação Orientada a Objetos (POO) para representar e manipular os dados de desempenho acadêmico de forma organizada.

Funcionalidades do Projeto
Classe Nota:

Representa as informações de desempenho de um aluno, com os seguintes atributos:
nota1 e nota2: Notas de avaliação do aluno.
faltas: Número de faltas do aluno.
Métodos principais:
Construtores:
Construtor vazio para inicialização manual.
Construtor parametrizado para inicialização direta com notas e faltas.
Setters: Validam os valores antes de atribuí-los:
Notas devem estar entre 0 e 10.
Número de faltas deve ser entre 0 e 40.
resultado():
Calcula a média das notas e verifica se o aluno está:
Reprovado por faltas: Mais de 7 faltas.
Reprovado por notas: Média menor que 4.
Em recuperação: Média entre 4 e 7.
Aprovado: Média maior ou igual a 7.
Exibe mensagens personalizadas conforme o desempenho.


Classe Principal:
Classe responsável por demonstrar o funcionamento do sistema:
Instancia dois alunos (ribamar e cremilda).
Inicializa os atributos usando construtores e métodos set.
Exibe os resultados de cada aluno no console.
Demonstração do Sistema
Ao executar o programa, os resultados são exibidos no console com mensagens como:

"Reprovado por faltas!": Aluno excedeu o limite de faltas.
"Reprovado por notas, faz o L!": Média das notas abaixo de 4.
"Tá de recuperação, boca aberta!": Média entre 4 e 7.
"Aprovado, meu nobre!": Média igual ou superior a 7.

Classe responsável por demonstrar o funcionamento do sistema:
Instancia dois alunos (ribamar e cremilda).
Inicializa os atributos usando construtores e métodos set.
Exibe os resultados de cada aluno no console.

Exercício 3: Localizado na pasta Cofrinho

Projeto: Cofrinho de Moedas
Este projeto em Java simula um cofrinho virtual que permite adicionar moedas de diferentes tipos e calcular o valor total armazenado. Ele utiliza conceitos de Programação Orientada a Objetos (POO) e coleções Java para gerenciar os dados.

Funcionalidades do Projeto
Classe Moeda:

Representa uma moeda com os atributos:
nome: Nome da moeda (ex.: "Euro", "Dólar").
valor: Valor da moeda (ex.: 0.5 para 50 centavos de Euro).
Métodos principais:
Getters e Setters para acessar e modificar os atributos.
Construtor para inicializar diretamente os valores de nome e valor.
Classe Cofrinho:

Gerencia uma coleção de objetos Moeda usando um ArrayList.
Métodos principais:
add(Moeda m): Adiciona uma nova moeda ao cofrinho.
calcularTotal(): Percorre todas as moedas no cofrinho e soma seus valores, retornando o total.
Classe Principal:

Demonstra o funcionamento do sistema:
Cria um cofrinho (Cofrinho).
Adiciona diferentes moedas com valores e nomes específicos.
Calcula e exibe o valor total no cofrinho.

Aplicações
Este projeto é ideal para praticar:

Manipulação de coleções (ArrayList) em Java.
Uso de classes e objetos para modelar problemas do mundo real.
Iteração em coleções com for-each.
O projeto pode ser facilmente expandido para incluir conversões de moedas, remoção de moedas específicas ou outras funcionalidades relacionadas à gestão de valores.
