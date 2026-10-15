package clinicaveterinaria.interfaces;

import clinicaveterinaria.repository.BaseDatos;


public interface ITratamiento {
    int getId();

    double calcularCostoFinal();

    String obtenerIndicaciones();

    String prepararSala();
    
    double calcularConImpuestos();
}

