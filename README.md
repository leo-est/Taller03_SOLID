# Taller03_SOLID

<<<<<<< HEAD
# Integrante 2 OCP
- ¿Por qué los condicionales repetidos hacen más caro el cambio?
Cada vez que se quiera agregar un nuevo tratamiento se agregar un nuevo if con cada información nueva y si se anade mas y mas con el tiempo llegaría a ser demasiado extenso lo cual toma demasiado tiempo, dinero y encima no es practico. Por eso al cambiarlo, simplemente se agrega un nuevo tratamiento y no se modifica ninguna clase solo se extiende
- ¿Qué pasaría si agregamos `Odontologia` como tratamiento?
Con el código anterior, no funciona y deberíamos modificar cada clase para que pueda ser posible utilizarla, con el código corregido, simplemente se agregaría el tratamiento y las clases simplemente se extienden automáticamente y no hay que modificar nada
- ¿Cuándo una interfaz ayuda a extender el sistema?
Cuando se requiere agregar cosas sin tener que cambiar mucho el código, simplemente agregando lo que se desea y llega a ser mucho mas intuitivo y practico para el usuario
=======
Integrante 3- Llano Maria Belen
- ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?
Porque una clase heredo un metodo que no se puede ejecutar.
- ¿Qué contrato estaba prometiendo `Animal`?
Prometia que TODOS los animales podian caminar(), volar(), nadar() aunque algunos no podian ejecutar estas acciones. 
- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?
Cree las interfaces de Caminador, Nadador y Volador para que cada animal implemente la que puede ejecutar.
>>>>>>> 4a4c03747279a68a46d146d15cb8b5837412dd85
