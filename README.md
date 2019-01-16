# Simulador de escalonador de multiplas filas de um Sistema Operacional

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Sistema desenvolvido usando `Java` para a disciplina de **Sistemas Operacionais II** do curso de [Engenharia de Computação](https://pcs.ifsuldeminas.edu.br/index.php?option=com_content&view=article&id=639&Itemid=267) do [IFSULDEMINAS - Campus Poços de Caldas](https://pcs.ifsuldeminas.edu.br/). <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O *software* consiste de em simular o funcionamento de um escalonador de processos em um sistema operacional. Com base nos processos inseridos no simulador através da tabela de processos, a cada ciclo de *CPU* (*clock*) que pode ser gerado de forma automática ou manual, é consumido um tempo de execução do processo que estiver na ponta da fila. Ao todo, são oito filas, com os respectivos valores de quantum: 2, 4, 8, 16, 32, 64, 128, 256.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Após todos os processos esgotarem seus tempos de execução, o *software* informa ao usuário o tempo total de execução da fila de processos, em ciclo, a utilização da *CPU* (em porcentagem) e o número de troca de contexto.

# Imagens do Software

<p align = "center">
  <img src="https://raw.githubusercontent.com/MarcosVMoreira/ProjetoSimuladorEscalonador/master/Imagens%20do%20sistema/Principal.png" alt="Tela principal" />
</p>      <br>
<p align = "center">
  <img src="https://raw.githubusercontent.com/MarcosVMoreira/ProjetoSimuladorEscalonador/master/Imagens%20do%20sistema/Escalonador.png" alt="Escalonador" />
</p>     <br> 

# Pré-Requisitos

- Java 8 ou superior.
- JDK 10.0 ou superior.

# Instalação

Basta clonar/baixar os arquivos do repositório e abri-los utilizando NetBeans IDE.

# Contribuições

Sinta-se livre para enviar sugestões de melhoramento do código através do `Issues` ou para abrir um `Pull request`. Tudo será analisado e aceito caso engrandeça o projeto!

# Equipe

* **Marcos Vinícius Moreira** - *Desenvolvedor do Software* - [MarcosVMoreira](https://github.com/MarcosVMoreira)
* **Otávio Palma** - *Desenvolvedor do Software* - [OtavioPalma](https://github.com/OtavioPalma)
