const character = document.getElementById("character");
const blocks = [document.getElementById("block"), document.getElementById("block2"), document.getElementById("block3")];
const pauseButton = document.getElementById("botaopause");
let counter = 0;
let isJumping = false;
let isPaused = false;
let checkDead;

// Adiciona evento de teclado para pular
document.addEventListener("keydown", function (event) {
    if (event.code === "Space" && !isPaused) {
        jump();
    } else if (event.code === "ArrowLeft" && !isPaused) {
        moveLeft();
    } else if (event.code === "ArrowRight" && !isPaused) {
        moveRight();
    }
});

// Função para pular
function jump() {
    if (!isJumping) {
        isJumping = true;
        character.classList.add("animate");
        setTimeout(() => {
            character.classList.remove("animate");
            isJumping = false;
        }, 500);
    }
}

function moveLeft() {
    const characterLeft = parseInt(window.getComputedStyle(character).getPropertyValue("left"));
    if (characterLeft > 0) {
        character.style.left = characterLeft - 20 + "px"; // Move 20px para a esquerda
    }
}

function moveRight() {
    const characterLeft = parseInt(window.getComputedStyle(character).getPropertyValue("left"));
    const gameWidth = parseInt(window.getComputedStyle(document.querySelector('.game')).getPropertyValue("width"));
    if (characterLeft < gameWidth - 20) { // Impede que o personagem saia da tela
        character.style.left = characterLeft + 20 + "px"; // Move 20px para a direita
    }
}

function collision(block) { //Função para aplicar a área de colisão, assim podendo repetir em todos blocos.
    const characterRect = character.getBoundingClientRect(); // Obtém a área do personagem
    const blockRect = block.getBoundingClientRect(); // Obtém a área do bloco

    return (
        blockRect.left < characterRect.right &&
        blockRect.right > characterRect.left &&
        blockRect.top < characterRect.bottom &&
        blockRect.bottom > characterRect.top
    );
}

// Função para iniciar o jogo
function startGame() {
    checkDead = setInterval(() => {
        if (!isPaused) {
            // Verifica se há colisão
            if (blocks.some(collision)) {
                blocks.forEach(block => block.style.animation = "none"); // Para todas as animações
                alert("Fim de jogo. Pontuação: " + Math.floor(counter / 100));
                counter = 0;
                blocks.forEach((block, index) => block.style.animation = `block ${3 + index * 2}s infinite linear`); // Reinicia a animação do bloco

            } else {
                counter++;
                document.getElementById("scoreSpan").innerText = Math.floor(counter / 100);
            }
        }
    }, 10);
}

// Função para alternar pausa
function togglePause() {
    isPaused = !isPaused;
    const playState = isPaused ? "paused" : "running";
    blocks.forEach(block => block.style.animationPlayState = playState);
    pauseButton.innerText = isPaused ? "Continuar" : "Pausar";
}

// Adiciona evento de clique para o botão de pausa
pauseButton.addEventListener("click", togglePause);

// Inicia o jogo
startGame();
