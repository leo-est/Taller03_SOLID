# Taller03_SOLID

# Integrante 2 OCP
- ¿Por qué los condicionales repetidos hacen más caro el cambio?
Cada vez que se quiera agregar un nuevo tratamiento se agregar un nuevo if con cada información nueva y si se anade mas y mas con el tiempo llegaría a ser demasiado extenso lo cual toma demasiado tiempo, dinero y encima no es practico. Por eso al cambiarlo, simplemente se agrega un nuevo tratamiento y no se modifica ninguna clase solo se extiende
- ¿Qué pasaría si agregamos `Odontologia` como tratamiento?
Con el código anterior, no funciona y deberíamos modificar cada clase para que pueda ser posible utilizarla, con el código corregido, simplemente se agregaría el tratamiento y las clases simplemente se extienden automáticamente y no hay que modificar nada
- ¿Cuándo una interfaz ayuda a extender el sistema?
Cuando se requiere agregar cosas sin tener que cambiar mucho el código, simplemente agregando lo que se desea y llega a ser mucho mas intuitivo y practico para el usuario