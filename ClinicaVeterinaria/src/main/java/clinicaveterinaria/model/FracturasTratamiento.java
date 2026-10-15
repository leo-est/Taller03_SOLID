package clinicaveterinaria.model;

// Esta clase es de prueba para observar si se cumple el principio OCP
public class FracturasTratamiento extends Tratamiento {
    public FracturasTratamiento(int id, String descripcion, double costo) {
        super(id, descripcion, costo);
    }

    @Override
    public double calcularCostoFinal() {
        return (getCosto() * 1.20) + 50.0;
    }

    @Override
    public String obtenerIndicaciones() {
        return "Inmovilizar la extremidad afectada y mantener reposo absoluto durante 3 semanas.";
    }

    @Override
    public String prepararSala() {
        return "Preparar sala de rayos X, yeso, vendajes y férulas.";
    }

    @Override
    public double calcularConImpuestos() {
        return getCosto() * 1.15;
    }
}

