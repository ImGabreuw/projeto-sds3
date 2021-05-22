# projeto-sds3

![GitHub language count](https://img.shields.io/github/languages/count/ImGabreuw/projeto-sds3?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/ImGabreuw/projeto-sds3?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/ImGabreuw/projeto-sds3?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/ImGabreuw/projeto-sds3?style=for-the-badge)

![logo](https://github.com/devsuperior/sds3/blob/main/_assets/ds-dark.svg)

> Projeto desenvolvido na Semana Spring React da DevSuperior.

## 📝 TODO

- [X] criar projetos
- [X] "limpar" o projeto ReactJS
- [X] adicionar Bootstrap e CSS ao projeto
- [X] adicionar componentes estáticos básicos
- [X] adicionar gráficos estáticos
- [X] implantação no Netlify
- [X] configuração de segurança
- [X] criar as entidades e o seed do banco
- [X] estruturar o projeto em camadas
- [X] busca paginada de vendas
- [X] buscas agrupadas (GROUP BY)
- [X] validação no Postgres local
- [X] implantação no Heroku
- [X] rotas
- [X] página Home e navegações
- [X] first request
- [X] donutChart integration
- [X] barChart integration
- [X] dataTable integration
- [X] pagination

## ✏️ Modelo conceitual

![modelo-conceitual](https://raw.githubusercontent.com/devsuperior/bds-assets/main/sds/sds3-mc.png)

## 💻 Pré-requisitos

* Java 11 ou superior
* Postgresql 12 e pgAdmin
* IDE favorita (Intellij IDEA / VS Code)
* Heroku CLI
* npm / yarn
* git

## 💻 Tecnologias

* Java 11
* Spring 
  * Spring Boot
  * Spring Security
  * DevTools
* Lombok
* H2 
* Postgres

## 🚀 Execução do projeto

```bash
# Clone do repositório
$ git clone https://github.com/ImGabreuw/projeto-sds3
```

### Backend

```bash
# Entrar no diretório backend
$ cd backend
```

```bash
# Limpar o diretório target
$ mvn clean

# Criar o fat JAR
$ mvn package
```

```bash
# Entrar no diretório target
$ cd target/ 
```

```bash
# Executar o fat JAR
$ java -jar dsvendas-0.0.1-SNAPSHOT.jar
```

### Frontend

```bash
# Entrar no diretório backend
$ cd frontend
```

```bash
# Instalar as dependências
$ yarn install
```

```bash
# Executar o projeto
$ yarn start
```

Entrar em http://localhost:3000

## 📫 Contribuição
Para contribuir com <nome_do_projeto>, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <funcionalidade>`.
3. Faça suas alterações e confirme-as: `git commit -m '<funcionalidade>'`
4. Envie para o branch original: `git push origin <funcionalidade>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/ImGabreuw">
        <img src="https://avatars.githubusercontent.com/u/60116449?v=4" width="100px;" alt="ImGabreuw"/><br>
        <sub>
          <b>ImGabreuw</b>
        </sub>
      </a>
    </td>
  </tr>
</table>


## 😄 Seja um dos contribuidores<br>

Quer fazer parte desse projeto? Clique [AQUI](CONTRIBUTING.md) e leia como contribuir.

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.

[⬆ Voltar ao topo](#projeto-sds3)<br>

