document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroEnderecoForm");// armazena os dados numa constante pelo id do html

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const bairro = document.getElementById("bairro").value;
		const rua = document.getElementById("rua").value;
		const cidade = document.getElementById("cidade").value;
		const numeroCasa = document.getElementById("numero").value;
		const estado = document.getElementById("estado").value;
		const cep = document.getElementById("cep").value;
		const complemento = document.getElementById("complemente").value;

		try { //faz isso aqui

			const response = await fetch("http://localhost:8080/cadastroendereco", { //faz a conexão com a api
				method: "POST",
				headers: {
					"Content-Type": "application/json" //o formato que a api vai receber as informações
				},
				body: JSON.stringify({ //converte os dados recebidos no formato json
					bairro,
					rua,
					cidade,
					numeroCasa,
					estado,
					cep,
					complemento
				}),

			});

			if (response.ok) {
				alert("Endereço cadastrado com sucesso!");
				window.location.href = "indexendereco.html";
			} else {
				alert("Erro ao cadastrar o endereço :(");
			}
		} catch (error) { //caso tenha um erro faz isso aqui
			console.error("Erro ao cadastrar endereço :(", error);
		}

	});
});