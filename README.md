# SalarioTransferido - Cálculo de Salário Líquido com Benefícios

Este projeto é uma aplicação Java que calcula o salário líquido de um usuário após aplicar deduções com base no valor do salário bruto e adicionar benefícios. O programa também lida com exceções para garantir que valores negativos não sejam aceitos.

## Funcionalidades Principais

1. **Coleta de Dados do Usuário:** O programa solicita que o usuário insira o valor do salário bruto e o valor total dos benefícios.

2. **Cálculo do Salário Líquido:** 
   - Se o salário bruto for até R$ 1.100,00, é aplicada uma dedução de 5% sobre o valor do salário.
   - Se o salário bruto estiver entre R$ 1.100,01 e R$ 2.500,00, é aplicada uma dedução de 10%.
   - Para salários acima de R$ 2.500,00, a dedução é de 15%.

3. **Exibição do Resultado:** Após o cálculo, o programa exibe o valor total do salário líquido somado ao valor dos benefícios.

4. **Tratamento de Exceções:** Se o usuário inserir um valor negativo para o salário ou benefícios, uma exceção será lançada e uma mensagem de erro será exibida.

## Passo a Passo do Projeto

### Passo 1: Coletar Dados do Usuário
O programa solicita que o usuário insira:
- O valor do salário bruto (exemplo: R$ 2000,85)
- O valor total dos benefícios (exemplo: R$ 400,25)

### Passo 2: Verificar Valores Negativos
O programa verifica se o salário ou os benefícios inseridos são valores negativos. Se forem, uma exceção `IllegalArgumentException` é lançada, e uma mensagem de erro é exibida.

### Passo 3: Calcular o Salário Líquido
Com base no valor do salário bruto, o programa aplica a dedução correspondente e soma o valor dos benefícios:
- Para salários até R$ 1.100,00, aplica-se uma dedução de 5%.
- Para salários entre R$ 1.100,01 e R$ 2.500,00, aplica-se uma dedução de 10%.
- Para salários acima de R$ 2.500,00, aplica-se uma dedução de 15%.

### Passo 4: Exibir o Resultado
O valor total do salário líquido somado aos benefícios é exibido para o usuário.

### Passo 5: Tratamento de Exceções
Se uma exceção ocorrer durante a execução (como a inserção de valores negativos), o programa exibe uma mensagem de erro apropriada.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para desenvolver a aplicação.
- **Scanner (java.util.Scanner):** Pacote utilizado para capturar entradas do usuário via console.

## Autor

- **Nome:** Lucas Degrande