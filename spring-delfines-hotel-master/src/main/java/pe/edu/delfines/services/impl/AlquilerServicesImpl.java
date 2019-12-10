package pe.edu.delfines.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.delfines.models.entity.Alquiler;
import pe.edu.delfines.models.repository.AlquilerRepository;
import pe.edu.delfines.services.AlquilerService;

@Service
public class AlquilerServicesImpl implements AlquilerService{

	@Autowired
	private AlquilerRepository alquilerRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Alquiler> findAll() throws Exception {
		return alquilerRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alquiler> findById(Integer id) throws Exception {
		return alquilerRepository.findById(id);
	}

	@Override
	@Transactional
	public Alquiler save(Alquiler entity) throws Exception {
		return alquilerRepository.save(entity);
	}

	@Override
	@Transactional
	public Alquiler update(Alquiler entity) throws Exception {
		return alquilerRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		alquilerRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		alquilerRepository.deleteAll();
	}
	

	
}
