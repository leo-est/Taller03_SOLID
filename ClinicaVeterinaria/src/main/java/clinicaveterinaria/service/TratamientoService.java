package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.ITratamiento;
import clinicaveterinaria.model.TipoTratamiento;
import clinicaveterinaria.model.Tratamiento;
import clinicaveterinaria.repository.BaseDatos;

import java.util.List;


public class TratamientoService {
    private final BaseDatos baseDatos;

    public TratamientoService(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void crearTratamiento(Tratamiento tratamiento) {
        baseDatos.getTratamientos().add(tratamiento);
        baseDatos.registrarOperacion("crearTratamiento");
    }

    public Tratamiento obtenerTratamiento(int id) {
        for (Tratamiento tratamiento : baseDatos.getTratamientos()) {
            if (tratamiento.getId() == id) {
                return tratamiento;
            }
        }
        return null;
    }

    public void actualizarTratamiento(Tratamiento tratamiento) {
        eliminarTratamiento(tratamiento.getId());
        crearTratamiento(tratamiento);
    }

    public void eliminarTratamiento(int id) {
        baseDatos.getTratamientos().removeIf(tratamiento -> tratamiento.getId() == id);
        baseDatos.registrarOperacion("eliminarTratamiento");
    }

    public interface ITratamiento {
        void enviar (String prepararSala);

        public class VacunaTratamiento implements  ITratamiento {
            @Override
            public void enviar(String prepararSala){

                System.out.println("Preparar refrigeracion y jeringas." + prepararSala);
            }
        }
        public class CirugiaTratamiento implements  ITratamiento {
            @Override
            public void enviar(String prepararSala){

                System.out.println("Preparar quirofano y anestesia." + prepararSala);
            }
        }
        public class MedicamentoTratamiento implements  ITratamiento {
            @Override
            public void enviar(String prepararSala){

                System.out.println("Preparar receta y dosis." + prepararSala);
            }
        }
        public class FisioterapiaTratamiento implements  ITratamiento {
            @Override
            public void enviar(String prepararSala){

                System.out.println("Preparar camilla y bandas elasticas." + prepararSala);
            }
        }
        public class TratamientoService {
        public void  registrarOperacion(ITratamiento tratamiento) {
            tratamiento.aplicar(prepararSala);

        }
    }
        
    }

    public List<Tratamiento> listarTratamientos() {
        return baseDatos.getTratamientos();
    }
}
