package com.gl.subway.web.rest.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gl.subway.domain.Ciudad;
import com.gl.subway.domain.Cliente;
import com.gl.subway.domain.Producto;
import com.gl.subway.domain.Promocion;
import com.gl.subway.domain.Provincia;
import com.gl.subway.domain.Sucursal;
import com.gl.subway.repository.CiudadRepository;
import com.gl.subway.repository.ClienteRepository;
import com.gl.subway.repository.ProductoRepository;
import com.gl.subway.repository.PromocionRepository;
import com.gl.subway.repository.ProvinciaRepository;
import com.gl.subway.repository.SucursalRespository;

@Controller
@RequestMapping("/import")
public class ImportController {

	@Autowired
	private SucursalRespository sucursalRepository;
	@Autowired
	private CiudadRepository ciudadRepository;
	@Autowired
	private ProvinciaRepository provinciaRepository;
	@Autowired
	private ProductoRepository productoRepository;
	@Autowired
	private PromocionRepository promocionRepository;
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@Transactional
	public void importData() {

		if (sucursalRepository.count() == 0) {

			Provincia p = new Provincia();
			p.setNombre("Mendoza");
			provinciaRepository.save(p);

			Ciudad c = new Ciudad();
			c.setNombre("Mendoza");
			c.setProvincia(p);
			ciudadRepository.save(c);

			Sucursal s = new Sucursal();
			s.setAltura(219);
			s.setCalle("Peatonal Sarmiento");
			s.setCiudad(c);
			s.setCodigo("SM1");
			sucursalRepository.save(s);

			Producto producto = new Producto();
			producto.setPrecio(BigDecimal.valueOf(32));
			producto.setCodigo("WOW15");
			producto.setNombre("Wow Suprema 15 cm");
			productoRepository.save(producto);

			Producto producto2 = new Producto();
			producto2.setPrecio(BigDecimal.valueOf(64));
			producto2.setCodigo("WOW30");
			producto2.setNombre("Wow Suprema 30 cm");
			productoRepository.save(producto2);

			Promocion promo = new Promocion();
			promo.setCantidadMin(2);
			promo.setCantidadMax(2);
			promo.setDescuento(50);
			promo.setSucursal(s);
			promo.setProducto(producto);
			promo.setCodigo("Wow15-2x1");
			promocionRepository.save(promo);

			Cliente cl = new Cliente();
			cl.setNombre("Juan");
			cl.setApellido("Perez");
			cl.setEmail("jp@gmail.com");
			cl.setSucursalCercana(s);
			clienteRepository.save(cl);
		}

	}
}
