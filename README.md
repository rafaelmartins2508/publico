# publico
testeframework

Teste Blog Framework

Tecnologias Utilizadas

Java 8, API Restful, Maven, Spring boot, Thymeleaf, Bootstrap, PostgreSQL, Spring Security

Prezados, tentei fazer a atividade que me foi proposta, no entanto, algumas das tecnologias solicitadas eu não tinha nenhuma experiencia. 
Tentei dar o meu melhor nesses 2 dias dispostos para realizar.

Passo a Passo

* Foi criado uma estrutura que já irá criar a tabela.
* http://localhost:8080/login para realizar a login adm 123, usuario e senha são cadastrados na class de SecurityConfig
* http://localhost:8080/posts será exibido uma listagem de posts realizados, com uma limitação de caracteres a serem exibidos
* Ao clicar em um post, será aberto uma pagina contendo o poste em sua totalidade, com um link para retorno a pagina principal com a listagem


Caso necessario, segue script para inclusão do summernote no formulário de novos posts:

------------------------Scripts para incluir summernote no head HTML----------------------------------

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-bs4.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-bs4.js"></script>
    
--------------------------------------------------------------------------------------------------------


--------------------------------Scripts para incluir summernote no body HTML----------------------------
<script>
    $('#summernote').summernote({
        placeholder: 'Texto *',
        tabsize: 2,
        height: 300
    });
</script>
--------------------------------------------------------------------------------------------------------
