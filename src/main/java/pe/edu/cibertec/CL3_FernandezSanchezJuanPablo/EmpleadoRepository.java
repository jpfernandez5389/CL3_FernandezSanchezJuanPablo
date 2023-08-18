package pe.edu.cibertec.CL3_FernandezSanchezJuanPablo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface EmpleadoRepository extends CrudRepository <Empleado, Integer> {
    List<Empleado> findAll(); 
    
}
