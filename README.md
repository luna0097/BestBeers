# BestBeers
Aplicacion de prueba para intercam
ANDROID
Esta prueba consiste en validar los conocimientos de los integrantes, realizando una aplicación desde cero usando lo más actual que se encuentra en esta plataforma. Esta prueba está diseñada para realizarse en un tiempo aproximado de 4 días.
El integrante deberá considerar lo siguiente:
1.	Tener Android Studio en la versión estable 
2.	Tener un dispositivo físico o emulador para realizar sus compilaciones.
3.	Se usará la arquitectura MVVM
4.	Empaquetar su aplicativo al final y subirlo a un Git.
La prueba consiste en realizar una aplicación que contenga 4 vistas.

  ●	Login

  ●	Principal

  ●	Detalle

  ●	Favoritos

Ésta aplicación deberá cumplir con las siguientes recomendaciones las cuales son las siguientes:
1.	Las vistas deberán estar diseñadas con ConstraintLayout según lo consideren necesario.
2.	Harán uso de RecyclerView.
3.	Para el uso de botones emplearán MaterialDesign
4.	Para la navegación deberá realizarse con NavigationComponet 
5.	La aplicación deberá consumir el Api descrito más abajo con Retrofit. 
6.	Se hará uso de Base de datos donde tendrán dos tablas una será Usuarios y la otra Favoritos.
7.	El botón de Salir mostrará una alerta, y esta debe estar en todas las vistas, como parte de la NavBar. La alerta debe considerar lo siguiente:

  a.	Debe tener dos botones uno que sea para cancelar y otro de aceptar  

  b.	La leyenda será  “Deseas salir de la aplicación”

  c.	Titulo “Aviso”

  d.	Cuando le des clic al botón aceptar este debe cerrar la aplicación.

  e.	Cuando le des clic al botón cancelar solo deberá cerrar la alerta.

La vista de Login deberá tener dos campos de texto (Usuario y Contraseña), y un botón de Login.
●	Dentro dichos campos deben estar guardados en una Base de Datos
●	La contraseña deberá  llevar una encriptación BASE64 
●	Los campos deberán ser de tipo TextField
●	Si el usuario presiona el botón sin haber llenado los campos de texto estos se mostrarán en color Rojo. Usando la leyenda “campos vacíos“
●	Si el usuario no está registrado (se enviará una alerta con la leyenda “Usuario y contraseña incorrectos intente de nuevo.”
Debe contener una lista (Recyclerview) con la data de obtenida del endpoint Get Beers, cada elemento de la lista debe mostrar:
1.	 Image
2.	 Name
3.	 Tagline
4.	Botón de Favoritos.

Sugerencias
1.	 Cargaremos las imágenes con el framework de Picasso(https://square.github.io/picasso/)
Cuando se de clic en el botón de favoritos este deberá guardarse en la base de datos.

API REST
Usaremos un API REST gratuita la cual se llama Punk API (https://punkapi.com/documentation/v2).
 Esta contiene un catálogo de cervezas y una  pequeña descripción de cada una.
Host (GET): https://api.punkapi.com/v2/beers
params: 
1.	page <- Indica el número de página 
2.	per_page <- Indica el número de resultados por página
Response: (application/json)
Siendo el Api un servicio paginado, esta aplicación debe tener un scroll Infinito, actualizando el número de resultados según el usuario lo requiera.
