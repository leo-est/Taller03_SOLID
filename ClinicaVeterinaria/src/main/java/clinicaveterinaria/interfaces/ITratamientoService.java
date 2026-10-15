package clinicaveterinaria.interfaces;

import clinicaveterinaria.model.Tratamiento;

/**
 *
 * @author CltControl
 */
public interface ITratamientoService {
     void crearTratamiento(Tratamiento tratamiento);

    double calcularTratamiento(Tratamiento tratamiento);
}
