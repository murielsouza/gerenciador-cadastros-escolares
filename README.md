# gerenciador-cadastros-escolares
interface gráfica para gerenciamento de cadastros e matriculas escolares

trabalho relacionado a disciplina Linguagem de Programação Orientada a Objetos / LPOO (2017.1)

Para os cursos é importante armazenar o código, nome, valor do crédito e a área de conhecimento(*).
	As áreas do conhecimento são:  Ciências Agrárias; Ciências Biológicas e da Saúde; Ciências Exatas e Tecnológicas; e Ciências Humanas e Sociais.
As informações necessárias para professores são cgu (código inteiro), nome, curso(**), carga horária semanal e valor da hora aula. O coordenador é um tipo de professor que, além das informações indicadas, possui ainda o percentual de gratificação que é acrescentado ao salário. Para cada professor, deve ser possível realizar o cálculo do salário, sendo que o valor da hora é um atributo de classe (mesmo para todos os professores).
•	Importante ressaltar que um professor pode estar associado a apenas um curso.
** 	Instância da classe Curso.
Para os alunos deve-se guardar o cgu (código inteiro), nome, curso(**), tipo de ingresso (vestibular, transferência ou portador de diploma) e ano de ingresso no curso.
A partir dessas informações, crie as classes, usando encapsulamento de atributos, herança e sobrescrita (sempre que possível). Todas as classes devem oferecer construtores padrão e parametrizado (recebe todos os atributos) e o método toString().
Crie um software usando Interface gráfica Swing, com os seguintes formulários:
•	um formulário de menu (JFrame), que chamará as telas de cadastro de professores, alunos e cursos;
o	os ArrayLists (professores, alunos e cursos) deverão ser criados neste formulário. Suas referências deverão ser passadas nos construtores dos formulários que precisarem deles;
o	em todos os arrays, insira direto no código 5 objetos.
•	um formulário para cadastro de cursos (sugiro o JInternalFrame), que permita Inserir, Pesquisar (pelo cgu ou pelo nome), Alterar, Excluir e Imprimir Todos;
•	um formulário para cadastro de alunos (sugiro o JInternalFrame), que permita Inserir, Pesquisar (pelo cgu ou pelo nome), Alterar, Excluir e Imprimir Todos;
o	O cgu deve ser digitado pelo usuário e deve-se garantir que não sejam cadastrados números repetidos;
o	o curso deve ser escolhido em uma caixa de combinação (ComboBox) que lista todos os cursos armazenados no ArrayList cursos.
•	um formulário para cadastro de Professores/Coordenadores (sugiro o JInternalFrame), que permita Inserir, Pesquisar (pelo cgu ou pelo nome), Alterar, Excluir e Imprimir Todos.
•	professores e coordenadores devem ser armazenados em um único ArrayList chamado professores;
•	ao inserir professor:
o	O cgu deve ser digitado pelo usuário e deve-se garantir que não sejam cadastrados números repetidos;
o	o curso deve ser escolhido em uma caixa de combinação (ComboBox) que lista todos os cursos armazenados no ArrayList cursos.
•	quando o usuário escolher a opção Imprimir Todos, deve ser apresentada uma lista com os seguintes dados de todos os professores cadastrados:

•	Para as disciplinas são armazenadas as seguintes informações: código, nome, quantidade de créditos e curso;
•	Uma turma é composta pelas seguintes informações: um número, uma disciplina, um semestre (Ex: 2017.1 e 2017.2) um professor, quantidade de vagas(*), quantidade de alunos matriculados e horário (Ex.: 2N (segunda noite), 4T (quarta tarde) e 6M (sexta manhã)).  Existem dois tipos de turmas, turma prática e turma teórica. Para turma prática é acrescentada a informação do nome do laboratório que utiliza e para turma teórica é acrescentado o número da sala em que será ministrada;
(* ) sempre armazena o total de vagas da turma (não se refere a quantidade de vagas livres).
•	No semestre, o aluno pode se matricular em diversas turmas (máximo 8) e uma turma pode conter vários alunos matriculados, respeitando a quantidade de vagas. Ou seja, uma matrícula consiste em uma associação entre um aluno e uma turma.
