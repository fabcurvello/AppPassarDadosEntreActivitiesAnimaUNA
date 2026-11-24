# App Passar Dados Entre Activities (Anima UNA)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo com duas telas que demonstra como **enviar dados de uma Activity para outra**.

## Contexto acadêmico

Exercício aplicado em sala de aula na **UNA**, faculdade do grupo **Ânima Educação**, na disciplina de desenvolvimento mobile. A Ânima Educação é um conglomerado de instituições de ensino superior brasileiras, do qual fazem parte o Centro Universitário IBMR (Rio de Janeiro) e a UNA (Minas Gerais).

## O que o app faz

- Na primeira tela, o usuário digita a idade e toca em **Enviar**.
- A idade é enviada para a `SegundaActivity` por meio de uma `Intent` (`putExtra`).
- A segunda tela recupera o valor (`getExtras`), exibe a idade e informa se a pessoa é maior ou menor de idade.
- Botão **Retornar** encerra a segunda tela com `finish()`.

## Conceitos trabalhados em aula

- Navegação entre telas com `Intent` explícita
- Envio e recebimento de dados com `putExtra` e `Bundle`
- Conversão de tipos (`String` ↔ `int`)
- Estrutura de decisão (`if/else`)
- Encerramento de Activity com `finish()`

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 29` / `compileSdk 35`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppPassarDadosEntreActivitiesAnimaUNA.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 29 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppPassarDadosEntreActivitiesJava](https://github.com/fabcurvello/AppPassarDadosEntreActivitiesJava)
- [AppPassarDadosEntreActivities](https://github.com/fabcurvello/AppPassarDadosEntreActivities)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
