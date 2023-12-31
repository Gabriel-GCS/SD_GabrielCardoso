package br.inatel.labs.labrest.client;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.labs.labrest.client.model.dto.ProdutoDTO;

public class WebClientPutProduto {
	public static void main(String[] args) {
		ProdutoDTO produtoExistente = new ProdutoDTO();
		produtoExistente.setId(1L);
		produtoExistente.setDescricao("Furadeira teste");
		
		ResponseEntity<Void> responseEntity = WebClient.create(Constantes.BASE_URL)
				.put()
				.uri("/produto")
				.bodyValue(produtoExistente)
				.retrieve()
				.toBodilessEntity()	
				.block();
		
		HttpStatusCode statusCode = responseEntity.getStatusCode();
		
		System.out.println("Produto atualizado: ");
		System.out.println("Status da resposta: " + statusCode);
	}
}
