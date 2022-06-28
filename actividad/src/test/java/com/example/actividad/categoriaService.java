package com.example.actividad;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.actividad.repository.CategoriaRepository;
import com.example.actividad.service.CategoriaService;

public class categoriaService {
	
	@Mock
	private CategoriaRepository repositorioC;
	
	@InjectMocks
	private CategoriaService servicioCT;
	
	private categoria categoriaV;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		categoriaV = new categoria();
		categoriaV.setIdcat("1");
		categoriaV.setNomcat("Ropa");
		categoriaV.setDetcat("Ropa para toda la familia");
	}

	@Test
	public void listaC() {
		when(servicioCT.ListaCategoria()).thenReturn(Arrays.asList(categoriaV));
		assertNotNull(servicioCT.ListaCategoria());
		//fail("Not yet implemented");
	}
	
	@Test
	void guardarC() {
		when(servicioCT.ListaCategoria()).thenReturn(Arrays.asList(categoriaV));
		assertNotNull(servicioCT.GuardaCategoria(categoriaV));
	}
	
	@Test
	void listaid() {
		assertNotNull(servicioCT.ListaCID("1"));
	}
	
	@Test
	void eliminaid() {
		assertNotNull(servicioCT.eliminaCategoria("1"));
	}

}


