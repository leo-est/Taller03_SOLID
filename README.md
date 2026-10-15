# Taller03_SOLID

### Integrante 1 Valentina Concha RCP
- ¿Cuántas razones para cambiar tenía Veterinario antes del refactoring?

  Tenia 4 razones, "Veterinario" hacia las reservas, los reportes, el diagnostico y la facturación.
- ¿Qué ganamos al separar modelo y servicios?
  
  Que se cumpla el principio de solid el SRP, así evitando tener que cambiar la clase "veterinario" cada vez que cambiemos algo en una de las clases de servicio.
- ¿Qué clase debería cambiar si mañana cambia el formato del reporte?

  Solo deberia cambiar el ReporteService
### Integrante 2 Leonardo Estrada OCP
- ¿Por qué los condicionales repetidos hacen más caro el cambio?

  Cada vez que se quiera agregar un nuevo tratamiento se agregar un nuevo if con cada información nueva y si se anade mas y mas con el tiempo llegaría a ser demasiado extenso lo cual toma demasiado tiempo, dinero y encima no es practico. Por eso al cambiarlo, simplemente se agrega un nuevo tratamiento y no se modifica ninguna clase solo se extiende
- ¿Qué pasaría si agregamos `Odontologia` como tratamiento?

  Con el código anterior, no funciona y deberíamos modificar cada clase para que pueda ser posible utilizarla, con el código corregido, simplemente se agregaría el tratamiento y las clases simplemente se extienden automáticamente y no hay que modificar nada
- ¿Cuándo una interfaz ayuda a extender el sistema?

  Cuando se requiere agregar cosas sin tener que cambiar mucho el código, simplemente agregando lo que se desea y llega a ser mucho mas intuitivo y practico para el usuario
### Integrante 3- Llano Maria Belen
- ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?

  Porque una clase heredo un metodo que no se puede ejecutar.
- ¿Qué contrato estaba prometiendo `Animal`?

  Prometia que TODOS los animales podian caminar(), volar(), nadar() aunque algunos no podian ejecutar estas acciones. 
- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?

  Cree las interfaces de Caminador, Nadador y Volador para que cada animal implemente la que puede ejecutar.

  ### Integrante 4 - DIP/ISP
- ¿Qué problema causa una interfaz gigante en equipos grandes?
  
  Obliga a las clases a implementar métodos que no usan y quedan vacíos. Además, si todos en el equipo modifican la misma interfaz gigante, se arman muchos conflictos de merge en Git y es un dolor de cabeza mantener el código.
- ¿Por qué new DirectoBaseDatos() dificulta cambiar o probar la clase?

  Porque deja el código súper acoplado. Si mañana quiero usar otra base de datos, me toca meterme a modificar el código por dentro. Y para hacer pruebas es peor, porque no puedo inyectarle una base de datos falsa para probar sin tocar datos reales.
  
- ¿Qué dependencia debería conocer el código de alto nivel: interfaz o clase concreta?

  Debe conocer solo la interfaz. Las clases con la lógica principal no tienen por qué saber los detalles de cómo está construida la base de datos por debajo, solo necesitan saber qué métodos pueden usar.

