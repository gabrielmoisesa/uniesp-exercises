const nome = prompt("Digite o nome do aluno:");
const nota1 = Number(prompt("Digite a nota da primeira avaliação:"));
const nota2 = Number(prompt("Digite a nota da segunda avaliação:"));

const mediaDoAluno = (nota1 + nota2) / 2;
const mediaMinima = 7;

let situacaoAluno = "Reprovado";

if (mediaDoAluno >= mediaMinima) {
    situacaoAluno = "Aprovado";
} else if (mediaDoAluno >= 5 && mediaDoAluno < mediaMinima) {
    situacaoAluno = "Recuperação";
}

let notaRecuperacao = null;

if (situacaoAluno == "Recuperação") {
    notaRecuperacao = Number(prompt("Digite a nota da recuperação:"));

    if (notaRecuperacao < 5) {
        situacaoAluno = "Reprovado";
    } else {
        situacaoAluno = "Aprovado";
    }
}

// Logs
console.log("==================");
console.log("Situação do Aluno");
console.log("==================");
console.log(`Nome do aluno: ${nome}\nNota 1: ${nota1}\nNota 2: ${nota2}\nMédia: ${mediaDoAluno}`);

if (notaRecuperacao) console.log(`Nota de recuperação: ${notaRecuperacao}`);

console.log(`Situação do aluno: ${situacaoAluno}`)

// Alert
alert(`==================\nSituação do Aluno\n==================\nNome do aluno: ${nome}\nNota 1: ${nota1}\nNota 2: ${nota2}\nMédia: ${mediaDoAluno}\n${notaRecuperacao ? `Nota de recuperação: ${notaRecuperacao}` : ""}\nSituação do aluno: ${situacaoAluno}`);