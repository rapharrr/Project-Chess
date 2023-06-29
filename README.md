# Projeto Xadrez

Este é um projeto de xadrez construído em Java que segue uma arquitetura de várias camadas. O objetivo é fornecer uma implementação do jogo de xadrez com suporte a todas as regras do jogo e uma estrutura bem organizada e modularizada.

## Tabela de Conteúdos

- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Como usar o projeto](#como-usar-o-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

## Visão Geral

As principais características e elementos do projeto incluem:

**Jogabilidade em tempo real:** Os jogadores podem realizar suas jogadas e observar as jogadas do oponente em tempo real, permitindo uma experiência de jogo fluida e interativa.

**Regras do jogo completas:** Todas as regras do xadrez tradicional são implementadas, incluindo os movimentos válidos de cada peça, en passant, roque, promoção do peão, xeque, xeque-mate, empate e assim por diante.

**Validação de movimentos:** O sistema verifica a validade dos movimentos realizados pelos jogadores, garantindo que apenas movimentos legais e de acordo com as regras do jogo sejam aceitos.

**Controle de turnos:** O projeto gerencia os turnos dos jogadores, garantindo que cada jogador faça sua jogada na ordem correta e não haja violações nas regras de alternância de jogadores.

**Detecção de xeque-mate:** O sistema é capaz de detectar e anunciar um xeque-mate quando ocorre, sinalizando o fim do jogo e a vitória de um dos jogadores.

## Funcionalidades

**Tabuleiro Interativo:** O projeto utiliza uma representação visual do tabuleiro de xadrez, permitindo que os jogadores visualizem as posições das peças de forma clara e intuitiva. O tabuleiro é atualizado dinamicamente conforme as jogadas são feitas.

**Cores no Tabuleiro:** O tabuleiro é renderizado com cores diferentes para as casas claras e escuras, seguindo o padrão tradicional do xadrez. Isso torna o jogo mais agradável visualmente e ajuda os jogadores a identificar as diferentes posições no tabuleiro.

**Movimentos das Peças:** Os jogadores podem selecionar uma peça e visualizar os possíveis movimentos válidos para essa peça. Os movimentos são destacados no tabuleiro, ajudando os jogadores a tomar decisões estratégicas.

**Entrada de Jogadas:** Os jogadores podem inserir suas jogadas através de notação algébrica padrão, como "e2-e4" para mover um peão da casa e2 para a casa e4. Isso permite uma interação fácil e familiar para os jogadores.

**Verificação de Movimentos Válidos:** O sistema valida as jogadas inseridas pelos jogadores, verificando se são movimentos legais de acordo com as regras do xadrez. Movimentos inválidos são rejeitados, exigindo que o jogador faça uma jogada válida.

**Promoção de Peões:** Quando um peão alcança a última linha do tabuleiro adversário, o jogador pode escolher promover o peão para outra peça, como uma rainha, torre, bispo ou cavalo. Essa funcionalidade é implementada para garantir o cumprimento das regras do jogo.

**Detecção de Xeque e Xeque-Mate:** O sistema é capaz de detectar quando um jogador coloca o rei do oponente em xeque. Além disso, quando o xeque-mate ocorre, o jogo é encerrado e o jogador responsável pelo xeque-mate é declarado vencedor.

## Pré-requisitos

**Java Development Kit (JDK):** O JDK é necessário para compilar e executar o código Java. Certifique-se de ter o JDK instalado em sua máquina. Você pode baixar o JDK mais recente no site oficial da Oracle ou utilizar uma distribuição OpenJDK.

**Ambiente de Desenvolvimento Integrado (IDE):** Embora não seja estritamente necessário, é altamente recomendado usar um IDE para desenvolver o projeto em Java. Alguns IDEs populares para desenvolvimento Java incluem Eclipse, IntelliJ IDEA e NetBeans. Escolha um IDE de sua preferência e certifique-se de tê-lo instalado.

**Conhecimento básico de Java:** É importante ter familiaridade com a linguagem de programação Java e seus conceitos básicos, como classes, objetos, métodos, estruturas de controle, etc. Isso ajudará você a entender e modificar o código do projeto.

**Git:** Caso você queira utilizar o controle de versão Git para gerenciar seu projeto e compartilhá-lo com outras pessoas, certifique-se de ter o Git instalado em sua máquina. Você pode baixar o Git em git-scm.com.


## Como usar o projeto

**Clonar o repositório:** Comece clonando o repositório do projeto para o seu ambiente local. Você pode fazer isso usando o comando git clone seguido pelo URL do repositório.
**git clone https://github.com/rapharrr/Project-Chess**
 

## Contribuição

Se você estiver interessado em contribuir para o projeto de Xadrez em Java, aqui estão algumas sugestões de áreas em que você pode se envolver:

1. **Interface Gráfica (GUI):** Você pode aprimorar o projeto implementando uma interface gráfica mais dinâmica e interativa para os jogadores. Isso pode incluir a criação de um tabuleiro visualmente atraente, gráficos para as peças, e interações intuitivas para fazer as jogadas.

2. **Inteligência Artificial (IA):** Se você tem conhecimento em IA, pode contribuir implementando uma IA para jogar contra os jogadores humanos. Você pode explorar algoritmos de busca, como Minimax ou Alpha-Beta Pruning, para desenvolver uma IA que faça movimentos estratégicos.

3. **Testes e Depuração:** Contribua realizando testes extensivos no projeto, identificando e corrigindo possíveis bugs ou erros de lógica. Isso garantirá que o projeto esteja robusto e funcione corretamente em diferentes cenários de jogo.

4. **Documentação:** Ajude a melhorar a documentação do projeto, adicionando comentários no código, escrevendo guias de uso ou atualizando o Readme. Isso facilitará a compreensão do projeto para outros desenvolvedores e usuários interessados.

## Licença

O projeto de Xadrez em Java é licenciado sob a Licença MIT. Isso significa que você tem permissão para utilizar, modificar e distribuir o código-fonte do projeto, desde que a atribuição devida seja fornecida e a licença MIT seja incluída em qualquer cópia ou redistribuição.

Para obter mais detalhes sobre os termos e condições da Licença MIT, consulte o arquivo [LICENSE](https://github.com/rapharrr/Project-Chess/blob/main/LICENSE) no repositório do projeto.

## Contato

Para entrar em contato com os desenvolvedores do projeto de Xadrez em Java, você pode utilizar os seguintes meios de comunicação:
E-mail: Você pode enviar um e-mail para nossa equipe de desenvolvimento em rapha18023@gmail.com para obter suporte ou fazer perguntas relacionadas ao projeto.

GitHub: Visite o repositório do projeto no GitHub em [Project-Chess](https://github.com/rapharrr/Project-Chess) para abrir problemas, sugerir melhorias ou enviar solicitações de pull.
