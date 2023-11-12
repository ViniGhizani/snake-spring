# **Snake Spring**

## **Descrição**

O código do jogo "Snake Spring" implementa uma versão simples e interativa do clássico jogo Snake. O jogador controla uma cobra que se move pelo canvas, tentando comer a comida para ganhar pontos. O jogo termina se a cobra colide com as bordas do canvas ou consigo mesma.

Nossa cobra vai ser um array com várias posições, cada quadradinho dela é uma posição do array, para se mover vamos fazer com que a última posição do array que é a ponta do rabo da cobra vá para frente, que é a cabeça da cobra, então a cada movimento ela ira realizar esse processo.

Quando a cobra encontra a comida é adicionado mais um quadrado de tamanho para ela, assim a cada vez que ela come seu tamanho aumenta.

## **Instruções de Uso**

1. Use as setas do teclado para controlar a direção da cobra.
2. Tente comer a comida para ganhar pontos.
3. Evite colidir com as bordas do canvas ou com a própria cobra.

## **Tecnologias Utilizadas**

- HTML5
- CSS3
- JavaScript
- Java
- Spring Boot

## **Estrutura do Projeto**

- **index.html**: Página principal do jogo.
- **css/style.css**: Estilos para a aparência do jogo.
- **js/script.js**: Lógica principal do jogo.
- **.java**: Realiza conexão do projeto com Spring Boot.

## **Variáveis e Constantes Principais**

- **canvas**: Referência para o elemento **`<canvas>`**.
- **ctx**: Contexto 2D do canvas.
- **score**: Referência para o elemento de pontuação.
- **finalScore**: Referência para o elemento de pontuação final na tela de menu.
- **menu**: Referência para o elemento da tela de menu.
- **buttonPlay**: Referência para o botão "Jogar Novamente".
- **audio**: Objeto de áudio para reproduzir efeitos sonoros.
- **size**: Tamanho dos segmentos da cobra e da comida.
- **initialPosition**: Posição inicial da cobra.
- **snake**: Array que armazena as posições da cobra.
- **food**: Objeto que representa a comida.

## **Funções Principais**

### **`incrementScore`**

Incrementa a pontuação do jogador em 10 pontos.

### **`randomNumber`**

Gera um número aleatório dentro de um intervalo especificado.

### **`randomPosition`**

Gera uma posição aleatória alinhada à grade do canvas.

### **`randomColor`**

Gera uma cor RGB aleatória.

### **`drawFood`**

Desenha a comida no canvas com uma sombra de destaque.

### **`drawSnake`**

Desenha a cobra no canvas.

### **`moveSnake`**

Move a cobra na direção especificada.

### **`drawGrid`**

Desenha uma grade no canvas para melhor visualização.

### **`checkEat`**

Verifica se a cobra comeu a comida, aumenta a pontuação e gera uma nova posição para a comida.

### **`checkCollision`**

Verifica se a cobra colidiu com as bordas do canvas ou consigo mesma.

### **`gameOver`**

Encerra o jogo, exibindo a tela de menu, pontuação final e aplicando um efeito de desfoque.

### **`gameLoop`**

Loop principal do jogo que atualiza o canvas, move a cobra, verifica colisões, etc.

## **Controles de Teclado e Botão de Jogar Novamente**

- O jogo responde às teclas de seta (Arrow keys) para controlar a direção da cobra.
- O botão "Jogar Novamente" reinicia o jogo, resetando a pontuação e a posição da cobra.

## **Conclusão**

O código do jogo "Snake Spring" fornece uma implementação básica e funcional de um jogo Snake. Os jogadores podem desfrutar da jogabilidade simples e interativa, movendo a cobra pelo canvas e tentando alcançar a pontuação mais alta.

## **Autor**

Vinicius Ghizani da Silva, projeto realizado acompanhando vídeo do canal Manual do Dev no Youtube, porém com alterações pessoais e sincronização com Spring Boot para cumprir a proposta do trabalho.
