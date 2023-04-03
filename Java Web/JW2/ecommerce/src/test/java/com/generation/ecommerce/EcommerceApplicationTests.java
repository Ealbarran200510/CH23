package com.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void pruebaGET () throws Exception {
		
		// Realizar el get a la URL
		this.mockMvc.perform(
				// Después se imprime con andDo(print())
				get("/miOtzo/productos/1"))
				.andDo(print())
				// Luego se espera que es estátus sea ok
				.andExpect(status().isOk())
				// Y se espera que el contenido sea el siguiente:
				.andExpect(content().string(
						containsString("papas")));
		
	}
	
	@Test
	@Disabled("Ya fue probado")
	public void pruebaDelete () throws Exception {
		
		// Realizar el get a la URL
		this.mockMvc.perform(
				// Después se imprime con andDo(print())
				delete("/miOtzo/productos/6"))
				.andDo(print())
				// Luego se espera que es estátus sea ok
				.andExpect(status().isOk());

	}
	
	@Test
	public void pruebaPOST () throws Exception {
		Producto producto = new Producto ();
		
		producto.setNombre("Maruchan pollo");
		producto.setDescripcion("Maruchan Pollo");
		producto.setPrecio(41.09);
		producto.setURL_Imagen("MaruchanHabanero.jpg");
		
		// Realizar el get a la URL
		this.mockMvc.perform(
				// La URL NO VA sobre el id, sino sobre el general
				post("/miOtzo/productos/")
				// Primero se especifica el tipo de dato a recibir
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(producto)))
				// Después se imprime con andDo(print())
				.andDo(print())
				// Luego se espera que es estátus sea ok
				.andExpect(status().isOk());
		
	}
	
	private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString
	
	@Test
	public void pruebaPUT () throws Exception {
		
		// Realizar el get a la URL
		this.mockMvc.perform(
				put("/miOtzo/productos/6")
				// Primero se agrega el parámetro a modificar
				.queryParam("descripcion", "Sopa Maruchan Sabor Pollo"))
				// Después se imprime con andDo(print())
				.andDo(print())
				// Luego se espera que es estátus sea ok
				.andExpect(status().isOk());

	}

}
