package br.inatel.labs.labjpa.service;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.inatel.labs.labjpa.dto.TotalCompradoPorFornecedorDTO;

@SpringBootTest
public class RelatorioServiceTest {
	@Autowired
	private RelatorioService relatorioService;

	@Test
	void test() {
		List<TotalCompradoPorFornecedorDTO> listaDTO = relatorioService.pesquisarTotalCompradoPorFornecedor();

		assertFalse(listaDTO.isEmpty());

//		System.out.println("ForncedorRazaoSocial : TotalComprada");
//
//		listaDTO.forEach(r -> {
//			System.out.print(r.fornecedorRazaoSocial());
//			System.out.print(" : ");
//			System.out.println(r.totalComprado());
//		});

		listaDTO.forEach(r -> System.out.println(r.toString()));
	}
}
