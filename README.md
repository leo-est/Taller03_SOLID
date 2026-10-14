# Taller03_SOLID

Integrante 3- Llano Maria Belen
- ¿Por qué lanzar `UnsupportedOperationException` puede ser señal de mal diseño?
Porque una clase heredo un metodo que no se puede ejecutar.
- ¿Qué contrato estaba prometiendo `Animal`?
Prometia que TODOS los animales podian caminar(), volar(), nadar() aunque algunos no podian ejecutar estas acciones. 
- ¿Cómo cambia el diseño cuando modelamos capacidades en lugar de herencia amplia?
Cree las interfaces de Caminador, Nadador y Volador para que cada animal implemente la que puede ejecutar.
