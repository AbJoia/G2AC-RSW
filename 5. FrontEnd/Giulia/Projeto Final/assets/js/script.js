function validaForm() {
    let nome = document.getElementById('nome').value;

    if (nome.length < 3) {
        alert("O nome deve ter no mínimo 3 caracteres");
        return false;
    }

    alert("Mensagem enviada com sucesso!")
    return true;
}