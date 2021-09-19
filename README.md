<div style = "text-align:center">

# Seja bem-vindo ao <img src="/resource/images/icon-scrumcloud.png">

</div>
<div style="text-align:center">

### Olá! Somos a equipe Tetris responsáveis pelo desenvolvimento da aplicação web ScrumCloud.

</div>
<br>

# ![trabalho-em-equipe](https://user-images.githubusercontent.com/81206214/120873313-f65cf780-c577-11eb-8ba2-15d1925c0e4b.png)   O Time 
<div class="time" style= "text-align:justify">
A equipe Tetris é composta pelos seguintes estudantes do 3º semestre de Banco de Dados pela FATEC de São José dos Campos:<br><br>

- ***Product Owner***
  - [Nágella Nasser](https://github.com/nagellanasser) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/nagellanasser/)  
- ***Scrum Master***
  - [Davi das Neves Machado](https://github.com/machadondavi) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/davinevesmachado/)
- ***Team Dev :***
  - [Alexia Karine Silva dos Santos](https://github.com/alexiakarine) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/alexia-karine-silva-5b0a79116/)
  - [Gabriel Oliveira Sana](https://github.com/gabsana) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/gabriel-sana-ba91a4147/)
  - [Guilherme de Oliveira Perfeito](https://github.com/guitambau) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/marcos-francisco-411800201)
  - [Jefferson Tavares de Araújo](https://github.com/jefferson-tavares-araujo) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/jeffersontavaresaraujo/)
  - [Renata Garcia Nonato](https://github.com/RenataGarciaNonato) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/mwlite/in/renata-garcia-2a84821b7)
  - [Valdiney José do Nascimento](https://github.com/Valdineynascimento) [<center><img src="https://github.com/equipe-tetris/scrum-cloud-backend/blob/master/resource/images/linkedin.png" /></center>](https://www.linkedin.com/in/valdiney-jos%C3%A9-do-nascimento-68a136214/)
</div>
<br><br>

## :dart: Objetivo  
Desenvolver uma aplicação web que permita equipes remotas de desenvolvimento realizarem as cerimônias de Planning e Retrospective aplicadas na metodologia SCRUM.

Nossa aplicação permitirá o cadastro de membros de equipes, agendamento e realização (real-time) de reuniões com configuração de métricas customizáveis e exportação dos resumos para os integrantes das mesmas.
</div>
<br>

## :pencil: Requisitos funcionais 
- Cadastros de Usuários contendo (nome, e-mail e senha).<br>

- Existem dois perfis de usuário:<br>
  - Scrum Master<br>
  - Desenvolvedor<br>

- Por padrão, todos que se cadastram serão Scrum Masters.<br>

- O Scrum Master após se cadastrar poderá criar seu time no sistema.<br>

- O Scrum Master poderá incluir um ou mais integrante em seu time.<br>

- Ao inserir um integrante, o Scrum Master, irá inserir o nome e o e-mail deste integrante.<br>

- Após preencher os integrantes e salvar o time o sistema deverá disparar um e-mail para os integrantes realizarem o cadastro na plataforma.<br>

- Os usuários que forem cadastrados através do link que foi enviado por e-mail possuirão perfil de Desenvolvedor naquele time em que ele foi convidado.<br>

- O Scrum Master poderá convidar uma pessoa para seu time copiando diretamente o link do time e enviando da maneira como preferir.<br>

- O cadastro através do Link deverá possuir as mesmas mecânicas do cadastro por e-mail.<br>

- O sistema deverá permitir a criação das salas de Planning e de Retrospective.<br>

- Na sala de Planning, deverá ser permitido inserir um ou uma lista de itens que serão estimados.<br>

- Para a estimativa deverá ser utilizada técnicas como Planning Poker ou por tamanhos relativos.<br>

- Para o Planning Poker pode ser utilizada a frequência de Fibonacci ou as cartas padrão.<br>

- O sistema deverá trabalhar com um sistema de rodadas, ou seja, todos os itens inseridos na lista de estimativa serão estimados um por vez.<br>
 
- Neste sistema de rodadas, item atual deverá ficar em evidência na tela para que todos consigam ler.<br>

- Um sistema de chat em texto deverá ser implementado para comunicação na sala de estimativas.<br>

- Os participantes deverão escolher a carta para a estimativa e após selecioná-la um sistema de indicador deverá exibir quantas pessoas já escolheram as cartas e quantas faltam.<br>

- O Scrum Master terá acesso a uma funcionalidade onde ele poderá finalizar a votação, fazendo com que todas as cartas selecionadas sejam exibidas para todos os participantes.<br>

- O Scrum Master poderá então atribuir um valor para o item da rodada.<br>

- O Scrum Master poderá prosseguir para a próxima tarefa ou retornar a anterior.<br>

- As estimativas deverão ser salvas, permitindo que os usuários possam exportar as tarefas estimadas, bem como os valores atribuídos para os itens.<br>

- Na sala de retrospectiva, deverá ser permitido que cada participante da sala insira itens para serem avaliados.<br>

- Cada participante poderá inserir quantos itens quiser nas seguintes categorias nas reuniões de Retrospective: 
  - Parar de Fazer 
  - Diminuir a Frequência 
  - Manter a Frequência 
  - Aumentar a frequência 
  - Começar a fazer<br>

- Um sistema de chat de texto deverá ser implementado para a sala de Retrospective.<br>

- Os usuários poderão sinalizar que terminaram de preencher os itens nas reuniões de Retrospective.<br>

- Um indicador deverá ser exibido para todos os participantes da sala de Retrospective contendo a informação de quantos participantes finalizaram e quantos faltam.<br>

- O Scrum Master deverá ter acesso a um botão para iniciar a votação.<br>

- As rodadas da votação serão feitas por categoriasnas reuniões de Retrospective.<br>

- Durante a votação, nas reuniões de Retrospective, deverão ser exibidos o nome da categoria para todos os participantes, bem como todos os itens inseridos pelos participantes naquela categoria em questão.<br>

- Durante a votação, nas reuniões de Retrospective, os participantes poderão selecionar quais itens eles acham pertinente e sinalizar que finalizaram.<br>

- Nas reuniões de Retrospective, o Scrum Master poderá mover a votação para a próxima categoria e para a categoria anterior.<br>

- Após todas as categorias serem votadas, nas reuniões de Retrospective, um resumo de todas as categorias será exibida.<br>

- No resumo da reunião de Retrospective, somente os 3 itens mais votados serão exibidos por categoria.<br>

- O Scrum Master poderá finalizar a retrospectiva consolidando os itens mais votados.<br>

- Ao finalizar a retrospectiva o resumo poderá ser exportado.<br>

  
<br>

## :heavy_check_mark: Funcionalidades 

- Organizar de forma rápida as cerimônias de Planning e Retrospective praticadas na metodologia Scrum.<br>

- Cadastro de Usuários nos perfis de Scrum Master e Desenvolvedor.<br>

- Cadastro de Times de Desenvolvimento.<br>

- Links gerados e enviados automaticamente via e-mail para cada integrante do time cadastrado efetuar seu cadastro individual para acesso à plataforma.<br>

- Criação de salas de reunião de Planning ou Retrospective de forma imediata ou agendada, com métricas configuráveis, chat (real-time) e possibilidade de exportação dos dados ao final de cada reunião .<br>

- Possibilidade de enviar convite de uma sala de reunião via link.<br>

- Lembretes de reuniões agendadas enviadas 5 minutos antes de seu início ao e-mail de cada integrante.<br>

- Em reuniões de Planning,  a aplicação gerará uma sugestão de valor para atribuição final da task atual ao Scrum Master baseados na moda e mediana dos valores votados.<br>

- Em reuniões de Retrospective, será possível que cada integrante possa incluir tantos ítens quanto acharem necessários para cada categoria determinada para a reunião, assim como votar em tantos itens quanto acharem pertinentes durante a abordagem sobre cada categoria trabalhada.<br>

- Em cada item trabalhado nas reuniões de Planning e, em cada categoria pertinentes às reuniões de Retrospective, terão sua vizualização enfatizada na tela.

<br>

## :dart: Público-alvo 
<div class="publico-alvo" style= "text-align:justify">
Equipes de Desenvolvimento praticantes de metodologias ágeis que utilizam cerimônias de Planning e Retrospective do framework Scrum em seus projetos. 
</div>
<br>

## :computer: Tecnologias utilizadas 
<div class="tecnologias" style= "text-align:justify">

- Git
- GitHub
- IDE Intellij || Backend
  - Linguagem de Programação: Java

- IDE Vs Code || Frontend
  - Linguagens:
    - Marcação: HTML5
    - Estilização: CSS3
    - Programação: Javascript

- BootStrap
- ReactJS
- Hibernate
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
<div class="product-backlog" style= "text-align:justify">

![Product Backlog](./resource/images/product-backlog/ProductBackLog_parte_I.png "Backlog")<br>

![Product Backlog](./resource/images/product-backlog/ProductBackLog_parte_II.png "Backlog")<br>

![Product Backlog](./resource/images/product-backlog/ProductBackLog_parte_II.png "Backlog")<br>


<br>  
</div>
<br>

## :chart_with_upwards_trend: Users Stories 
<div class="users-stories" style= "text-align:justify">


![User Stories](./resource/images/userstories/01.jpg "User Stories")<br>

![User Stories](./resource/images/userstories/02.jpg "User Stories")<br>

![User Stories](./resource/images/userstories/03.jpg "User Stories")<br>

![User Stories](./resource/images/userstories/04.jpg "User Stories")<br>

![User Stories](./resource/images/userstories/05.jpg "User Stories")<br>

![User Stories](./resource/images/userstories/06.jpg "User Stories")<br>

![User Stories](./resource/images/userstories/07.jpg "User Stories")

<br>  
</div>
<br>

## :pencil2: Modelagem Entidade-Relacionamento - MER 
<div class="mer" style= "text-align:justify">

- **Modelo Conceitual**
  
   ![MER_ModeloConceitual](./resource/images/MER.jpeg "MER_Conceitual_ScrumCloud")
<br><br>


</div>

## :mortar_board: Wireframes 
<div class="wireframes" style= "text-align:justify">

- **01: Tela de Login** *- Sujeita a modificações*
![Tela_Login](./resource/images/wireframes/tela-login.png "Tela de login do ScrumCloud ")
<br><br>

- **02: Tela  de Cadastro do Time** *- Sujeita a modificações*
![Tela_Cadastro_Time](./resource/images/wireframes/tela-cadastro-time-sm.png "Tela de Cadastro do Time")
<br><br>

- **03: Tela de Cadastro do Usuário** *- Sujeita a modificações*
![Tela_Cadastro_Usuario](./resource/images/wireframes/tela-cadastro-usuario.png "Tela de Cadastro do Usuario")
<br><br>

- **04: Tela Inicial** *- Sujeita a modificações*
![Tela_Inicial](./resource/images/wireframes/tela-inicial-sm.png "Tela Inicial")
<br><br>

- **05: Tela de Retrospectiva do Desenvolvedor** *- Sujeita a modificações*
![Tela_Retrospectiva_Dev](./resource/images/wireframes/tela-retrospectiva-dev.png "Tela de  Retrospectiva DEV")
<br><br>

- **06: Tela de Retrospectiva do Scrum Master** *- Sujeita a modificações*
![Tela_Retrospectiva_SM](./resource/images/wireframes/tela-retrospectiva-sm.png "Tela de Restrospectiva SM")
<br><br>

- **07: Tela de Planning do Desenvolvedor** *- Sujeita a modificações*
![Tela_Planning_Dev](./resource/images/wireframes/tela-sala-planning-poker-dev.png "Tela de Planning DEV")
<br><br>

- **08: Tela de Planning do Scrum Master** *- Sujeita a modificações*
![Tela_Planning_SM](./resource/images/wireframes/tela-sala-planning-poker-sm.png "Tela de Planning SM")
<br><br>

</div>
