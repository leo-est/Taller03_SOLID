package clinicaveterinaria.interfaces;

import clinicaveterinaria.repository.BaseDatos;

public interface ITratamiento {
    double calcularCostoFinal();

    String obtenerIndicaciones();

    String prepararSala();
    }

