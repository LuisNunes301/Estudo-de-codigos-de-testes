# Estudo-de-codigos-de-testes
## Teste unitario , pequeno método para testar uma parte do codigo.
## Deve testar uma funcionalidade especifica.
## O codigo de teste pode ter muitas classes e que essa classe tenha muitos metodos. Mais de um teste unitario por metodo.

## Deve ser feito os codigos antes de subir para produção. 

## Principio de FIRST
### 1 - Fast (teste devem ser rapidos)
### 2 - Independent (indepedente do outro)
### 3 - Repeatable (deve ser repetivel)
### 4 - Self-validate (auto validação do teste, sem interveção do dev)
### 5 - Through  & Timely deve cobrir casos extremos

## Exemplo de estrutura de teste unitário
### Classe de teste
```java
public class CalculadoraTest {
  @Test
  public void testeSoma() {
    // Código de teste para o método de soma
  }

  @Test
  public void testeSubtracao() {
    // Código de teste para o método de subtração
  }

  @Test
  public void testeMultiplicacao() {
    // Código de teste para o método de multiplicação
  }

  @Test
  public void testeDivisao() {
    // Código de teste para o método de divisão
  }
}
```

### há 3 tipos de teste 
### End-to-end tesing/ UI testing
### Integrations( codigo  é testado sem mockar acessos ao bd e/ou https)
### Unit test (muitos, rapidos, sem http,sem bd)

### Nomeclatura para testes
#### test[SytenUnderTest]_[Condition or State change]_[Expected Result]

### BDD
#### Behavior Driven Development
#### Exemplo de estrutura de teste BDD
#### Given - Contexto inicial do cenario , 1 ou mais casos
#### When - dispara o gatilho do inicio do cenario
#### Then - avaliação do resultado
