package com.gl.subway.web.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gl.subway.domain.Ciudad;
import com.gl.subway.domain.Provincia;
import com.gl.subway.domain.Sucursal;
import com.gl.subway.repository.CiudadRepository;
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
		}

	}
}
