****************************************************************
Proyecto creado por: Rodrigo Jurado González

Estimados representantes de Alura Latam (y compañeros que tengan la oportunidad de revisar mi proyecto), me enorgullece decir que la realización del challenge fue sencilla,
aunque debido a que me encuentro realizando mis prácticas profesionales, no me fué posible dedicarle tanto tiempo y únicamente me concentré en completar
lo que se debía de completar sin llegar a añadir funcionalidades extras.

El menú está realizado de manera sencilla utilizando dos bucles anidados, uno para validar opciones dentro del rango, dentro del bucle principal para las opciones principales.
Cada opción manda a llamar a una función del servicio mediante un switch, y en el servicio opté por realizar una conexión básica a la API la cual se realiza en un inicio
de la aplicación (al ejecutarse por primera vez el servicio mas bien) y esta misma es la que se recicla cada vez que se quiere acceder a los datos de las monedas
(algo parecido a un patrón Singleton),
ya que se me hizo algo redundante el estar volviendo a realizar solicitudes a la API con diferentes monedas, siento que el resultado es "Practicamente el mismo", pues 
el mismo endpoint para las tasas con la moneda USD basta para saber convertir cualquier moneda a USD y viceversa usando multiplicacion y división,
Tal vez con un enfoque de convertir entre monedas de latam (sin involucrar los USD) si hubiese necesitado que se hicieran solicitudes en tiempo real, pero en fin, me
concentré en mantenerlo así como en el ejemplo.

Agradezco la atención prestada.
