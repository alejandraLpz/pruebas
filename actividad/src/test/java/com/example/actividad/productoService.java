package com.example.actividad;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.actividad.repository.ProductoRepository;
import com.example.actividad.service.ProductoService;

public class productoService {
	
	@Mock
	private ProductoRepository repositorioP;
	
	@InjectMocks
	private ProductoService servicioPP;
	
	private producto productoV;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		productoV = new producto();
		productoV.setIdpro("10");
		productoV.setNompro("Leggins Skinny");
		productoV.setCarpro("Corte recto");
		productoV.setPrepro("350");
	}

	@Test
	public void listaP() {
		when(servicioPP.ListaProducto()).thenReturn(Arrays.asList(productoV));
		assertNotNull(servicioPP.ListaProducto());
		
	}
	
	@Test
	public void guardaP() {
		when(servicioPP.ListaProducto()).thenReturn(Arrays.asList(productoV));
		assertNotNull(servicioPP.GuardaProducto(productoV));
		
	}
	
	@Test
	void listaid() {
		assertNotNull(servicioPP.ListaPID("1"));
	}
	
	@Test
	void eliminaid() {
		assertNotNull(servicioPP.eliminaP("1"));
	}
	

}
