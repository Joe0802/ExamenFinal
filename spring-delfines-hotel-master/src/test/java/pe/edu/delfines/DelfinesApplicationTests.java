package pe.edu.delfines;



import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.delfines.models.entity.Alquiler;
import pe.edu.delfines.models.entity.Cliente;
import pe.edu.delfines.models.entity.Habitacion;
import pe.edu.delfines.models.entity.Tipo;
import pe.edu.delfines.models.entity.Vendedor;
import pe.edu.delfines.models.repository.AlquilerRepository;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.models.repository.HabitacionRepository;
import pe.edu.delfines.models.repository.TipoRepository;
import pe.edu.delfines.models.repository.VendedorRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class DelfinesApplicationTests {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private AlquilerRepository alquilerRepository;
	@Autowired
	private VendedorRepository vendedorRepository;
	@Autowired
	private HabitacionRepository habitacionRepository;
	@Autowired
	private TipoRepository tipoRepository;
	
	@Test
	public void contextLoads(){
		try {
			
			Vendedor juan = new Vendedor();
			juan.setId("V01");
			juan.setNombre("Albertp");
			juan.setDireccion("Av. Galvez");
			juan.setTelefono("98234452");
			juan.setObservacion("al dia");
			juan.setSueldo((float) 979.34);
			
			Vendedor mario = new Vendedor();
			mario.setId("V02");
			mario.setNombre("Morron");
			mario.setDireccion("Av. dancins");
			mario.setTelefono("98638232");
			mario.setObservacion("excelente");
			mario.setSueldo((float) 1050.90);
			
			juan = vendedorRepository.save(juan);
			mario = vendedorRepository.save(mario);
			
			
			
			Alquiler n01 = new Alquiler();
			n01.setPrecio((float) 50.10);
			n01.setFecha_entrada(new Date(119, 9, 15));
			n01.setFecha_entrada(new Date(119, 9, 16));
			n01.setEstado("muy bueno");
			n01.setObservacion("duradero");
			
			Alquiler n02 = new Alquiler();
			n02.setPrecio((float) 40.10);
			n02.setFecha_entrada(new Date(119, 5, 10));
			n02.setFecha_entrada(new Date(119, 5, 11));
			n02.setEstado("regular");
			n02.setObservacion("con ducha");
			
			n01 = alquilerRepository.save(n01);
			n02 = alquilerRepository.save(n02);
			
			
			
			
			Habitacion h1 = new Habitacion();
			h1.setNumeroCamas(2);
			h1.setDescripcion("comodas");
			h1.setPrecio((float) 15.80);
			h1.setObservacion("acolchadas");
			
			Habitacion h2 = new Habitacion();
			h2.setNumeroCamas(3);
			h2.setDescripcion("blandas");
			h2.setPrecio((float) 34.42);
			h2.setObservacion("amobladas");
			
			h1 = habitacionRepository.save(h1);
			h2 = habitacionRepository.save(h2);
			
			
			
			Cliente c1 = new Cliente();
			c1.setDocumento("73972154");
			c1.setNombre("Frank");
			c1.setFechaNacimiento(new Date(2019, 5, 9));
			c1.setLugarNacimiento("Miraflores");
			c1.setSexo('M');
			c1.setObservacion("cumplido");
			
			Cliente c2 = new Cliente();
			c2.setDocumento("03826544");
			c2.setNombre("Eliana");
			c2.setFechaNacimiento(new Date(2019, 12, 2));
			c2.setLugarNacimiento("Miraflores");
			c2.setSexo('F');
			c2.setObservacion("morosa");
			
			c1 = clienteRepository.save(c1);
			c2 = clienteRepository.save(c2);

			
			
			Tipo t1 = new Tipo();
			t1.setId("T01");
			t1.setNombre("Queen");
			
			Tipo t2 = new Tipo();
			t2.setId("T02");
			t2.setNombre("extralarge");
			
			t1 = tipoRepository.save(t1);
			t2 = tipoRepository.save(t2);
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}

}
