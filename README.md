<div style = "text-align:center">

# Seja bem vindo ao ScrumCloud !   <img src="/resource/images/logo-scrumcloud.png">

</div>
<div style="text-align:center">

### Olá! Somos a equipe Tetris responsáveis pelo desenvolvimento do site ScrumCloud.

</div>
<br>

# ![trabalho-em-equipe](https://user-images.githubusercontent.com/81206214/120873313-f65cf780-c577-11eb-8ba2-15d1925c0e4b.png)   O Time 
<div class="time" style= "text-align:justify">
A equipe Tetris é composta pelos seguintes estudantes do 3º semestre de Banco de Dados pela FATEC de São José dos Campos:

- ***Product Owner***
  - [Nágella Nasser](https://github.com/nagellanasser) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/nagellanasser/)  
- ***Scrum Master***
  - [Davi das Neves Machado](https://github.com/machadondavi) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/davinevesmachado/)
- ***Team Dev :***
  - [Alexia Karine Silva dos Santos](https://github.com/alexiakarine) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/alexia-karine-silva-5b0a79116/)
  - [Gabriel Oliveira Sana](https://github.com/gabsana) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/gabriel-sana-ba91a4147/)
  - [Guilherme de Oliveira Perfeito](https://github.com/guitambau) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/marcos-francisco-411800201)
  - [Jefferson Tavares de Araújo](https://github.com/jefferson-tavares-araujo) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/jeffersontavaresaraujo/)
  - [Nágella Nasser](https://github.com/nagellanasser) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/nagellanasser/)
  - [Renata Garcia Nonato](https://github.com/RenataGarciaNonato) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/mwlite/in/renata-garcia-2a84821b7)
  - [Valdiney José do Nascimento](https://github.com/Valdineynascimento) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/valdiney-jos%C3%A9-do-nascimento-68a136214/)
</div>
<br>

#  Scrum Cloud !<img src="/resource/images/icon-scrumcloud.png">
## :dart: Objetivo  
Desenvolver um sistema que permita que equipes remotas realizem algumas cerimônias do SCRUM.
As cerimônias para este projeto serão:
• Planning;
• Retrospective;
Este sistema pode permitir que pessoas cadastradas utilizem o sistema, montando equipes e armazenando os dados históricos referente às estimativas do Planning e das cerimônias de Retrospective.
</div>
<br>

## :pencil: Requisitos funcionais 
• Cadastros de Usuários contendo (Nome, e-mail e senha)<br><br>
• Existem dois perfis de usuário:<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Scrum Master<br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Desenvolvedor<br><br>
• Por padrão, todos que se cadastram serão Scrum Masters<br><br>
• O Scrum Master após se cadastrar poderá criar seu time no sistema.<br><br>
• Ele poderá incluir um ou mais integrante em seu time<br><br>
• Ao inserir um integrante ele irá inserir o nome e o e-mail deste integrante<br><br>
• Após preencher os integrantes e salvar o time o sistema deverá disparar um e-mail para os integrantes realizarem o cadastro na plataforma.<br><br>
• Os usuários que forem cadastrados através do link que foi enviado por e-mail possuirão perfil de Dev naquele time em que ele foi convidado.<br><br>
• O Scrum Master poderá convidar uma pessoa para seu time copiando diretamente o link do time e enviando da maneira como preferir.
• O cadastro através do Link deverá possuir as mesmas mecânicas do cadastro por e-mail.<br><br>
• O sistema deverá permitir a criação das salas de Planning e de Retrospective<br><br>
• Na sala de Planning, deverá ser permitido inserir um ou uma lista de itens que serão estimados.<br><br>
• Para a estimativa deverá ser utilizada técnicas como Planning Poker utilizando ou por tamanhos relativos<br><br>
• Para o Planning Poker pode ser utilizada a frequência de Fibonacci ou as cartas padrão<br><br>
• O sistema deverá trabalhar com um sistema de rodadas, ou seja, todos os itens inseridos na lista de estimativa serão estimados um por vez.<br><br> 
• Neste sistema de rodadas, item atual deverá ficar em evidência na tela para que todos consigam ler.<br><br>
• Um sistema de chat em texto deverá ser implementado para comunicação na sala de estimativas.<br><br>
• Os participantes deverão escolher a carta para a estimativa e após selecioná-la um sistema de indicador deverá exibir quantas pessoas já escolheram as cartas e quantas faltam.<br><br>
• O Scrum Master terá acesso a uma funcionalidade onde ele poderá finalizar a votação, fazendo com que todas as cartas selecionadas sejam exibidas para todos os participantes.<br><br>
• O Scrum Master poderá então atribuir um valor para o item da rodada.<br><br>
• O Scrum Master poderá prosseguir para a próxima tarefa ou retornar a anterior.<br><br>
• As estimativas deverão ser salvas, permitindo que os usuários possam exportar as tarefas estimadas, bem como os valores atribuídos para os itens.<br><br>
• Na sala de retrospectiva, deverá ser permitido que cada participante da sala insira itens para serem avaliados.<br><br>
• Cada participante poderá inserir quantos itens quiser nas seguintes categorias: 1–Parar de Fazer 2–Diminuir a Frequência 3–Manter a Frequência 4–Aumentar a frequência 5-Começar a fazer;<br><br>
• Um sistema de chat de texto deverá ser implementado para a sala de Retrospective;<br><br>
• Os usuários poderão sinalizar que terminaram de preencher os itens;<br><br>
• Um indicador deverá ser exibido para todos os participantes da sala contendo a informação de quantos participantes finalizaram e quantos faltam.<br><br>
• O Scrum Master deverá ter acesso a um botão para iniciar a votação<br><br>
• As rodadas da votação serão feitas por categorias.<br><br>
• Durante a votação, deverão ser exibidos o nome da categoria para todos os participantes, bem como todos os itens inseridos pelos participantes naquela categoria em questão.<br><br>
• Durante a votação os participantes poderão selecionar quais itens eles acham pertinente e sinalizar que finalizaram.<br><br>
• O Scrum Master poderá mover a votação para a próxima categoria e para a categoria anterior.<br><br>
• Após todas as categorias serem votadas um resumo de todas as categorias será exibida.<br><br>
• Neste resumo, somente os 3 itens mais votados serão exibidos por categoria.<br><br>
• O Scrum Master então poderá finalizar a retrospectiva consolidando os itens mais votados.<br><br>
• Ao finalizar a retrospectiva o resumo poderá ser exportado.<br>

  
<br>

## :heavy_check_mark: Funcionalidades 

.Disponibilizar de forma rapida as cerimonias do Scrum, e poder exporta-las para consulta durante a realização do projeto. 
<br>

## :dart: Público-alvo 
<div class="publico-alvo" style= "text-align:justify">
	.Times de desenvolvimento utilizando metodo agil do scrum para realização das cerimonias do scrum de forma rapida e organizada 
</div>
<br>

## :computer: Tecnologias utilizadas 
<div class="tecnologias" style= "text-align:justify">

- Git
- GitHub
- IDE Eclipse || JAVA
- BootStrap
- ReactJS
- Hibernate
- HTML 5
- CSS
- Spring Framework
- Banco de Dados: MySQL 

</div>
<br>

## :email: Entregas 
<div class="sprints" style= "text-align:justify">

- **SPRINT 1** :heavy_check_mark:
   - Product Backlog
   - Wireframes
   - User stories
   - Sprint planning
   - Criação da base da aplicação - frontend 
   - Criação da base da aplicação - backend
   - MER

<br><br>  

- **SPRINT 2** :hourglass:
   - Permitir cadastro de Usuário
   - Permitir cadastro de Times de Desenvolvimento 
   - Disparar e-mails com links para cadastramento
   - Permitir criar sala de reunião
   - Permitir incluir itens para votação em reuniões de Planning
   - Permitir definir métrica de votação
   - Permitir encerramento da votação de um item
   - Gerar sugestão de valor para o item em questão pós encerramento de votação dele para o S.M.
   - Permitir definição de um valor ao item com votação encerrada


<br><br>

- **SPRINT 3** :hourglass:
   - Gerar link de reuniões marcadas para ser compartilhado
   - Permitir definir Scrum Master da reunião
   - Evidenciar na tela item em votação
   - Permitir conversa entre participantes
   - Permitir retornar ou avançar item da lista de votação
   - Permitir visualização de votos após encerramento de votação do item
   - Permitir incluir itens para votação em reuniões de Retrospective
   - Permitir sinalização de termino de inserção de itens por usuário nas reuniões de Retrospective


<br><br> 

- **SPRINT 4** :hourglass:
   - Permitir exportar os item votados e seus valores
   - Permitir sinalização de termino de itens da categoria em questão discutida.
   - Permitir a sinalização de 0 ao número total de itens da categoria em questão discutida na reunião de Retrospective
   - Gerar um resumo de todas as categorias votadas com ênfase nos três itens mais votados de cada categoria
   - Permitir exportar resumo gerado ao final da reunião


<br><br> 
</div>

## :page_with_curl: Product Backlog  
<div class="users-stories" style= "text-align:justify">

- ![Product Backlog](./resource/images/backlog.jpg "Backlog - Necessidades do Cliente")
<br>  
</div>
<br>

## :chart_with_upwards_trend: Users Stories 
<div class="users-stories" style= "text-align:justify">


-![Product Backlog](./resource/images/userstories/01.jpg "User Stories")
-![Product Backlog](./resource/images/userstories/02.jpg "User Stories")
-![Product Backlog](./resource/images/userstories/03.jpg "User Stories")
-![Product Backlog](./resource/images/userstories/04.jpg "User Stories")
-![Product Backlog](./resource/images/userstories/05.jpg "User Stories")
-![Product Backlog](./resource/images/userstories/06.jpg "User Stories")
-![Product Backlog](./resource/images/userstories/07.jpg "User Stories")

<br>  
</div>
<br>

//## :pencil2: Modelagem Entidade-Relacionamento - MER 
<div class="mer" style= "text-align:justify">

- **Modelo Conceitual**
  
   ![MER_ModeloConceitual](./resource/images/MER.jpeg "MER_Conceitual_ScrumCloud")
<br><br>


</div>

## :mortar_board: Wireframes 
<div class="wireframes" style= "text-align:justify">

- **01: Tela Login** *- Sujeita a modificações*
  - ![Tela_Inicial](./resource/images/wireframes/tela-login.png "Tela de login do ScrumCloud ")
<br><br>

  - **02: Tela cadastro do Time**
  - ![DirCompact](./resource/images/wireframes/tela-cadastro-time-sm.png "Cadastro Time")
<br><br>

- **03: Tela cadastro usuário**
  - ![ConexaoBD](./resource/images/wireframes/tela-cadastro-usuario.png "Tela de cadastro dos usuarios")
<br><br>

- **04: Tela Inicial**
  - ![Tela_LogSistema](./resource/images/wireframes/tela-inicial-sm.png "Tela Inicial")
<br><br>

- **05: Tela retrospectiva DEV**
  - ![DirCompact](./resource/images/wireframes/tela-retrospectiva-dev.png "Tela Retrospectiva DEV")
<br><br>

- **06: Tela retrospectiva SM**
  - ![DiretoriosLogs](./resource/images/wireframes/tela-retrospectiva-sm.png "Tela Restrospectiva SM")
<br><br>

- **07: Tela Sala Planning Poker DEV**
  - ![DiretoriosLogs](./resource/images/wireframes/tela-sala-planning-poker-dev.png "Tela Sala Planning Poker DEV")
<br><br>

- **08: Tela Sala Planning Poker SM**
  - ![DiretoriosLogs](./resource/images/wireframes/tela-sala-planning-poker-sm.png "Tela Sala Planning Poker SM")
<br><br>


<br><br>

</div>

<br>

<br>  
</div>
<br>



