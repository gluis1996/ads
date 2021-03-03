<h1>Sonido en java 2021</h1>

<h2>Requisitos</h2>

<p>Tener los sonidos en formato .wav</p>

<h2>¿Cómo reproducir sonidos?</h2>

<p>Primero implementamos la <a href="">clase SClip</a>.</p>

<p>Ahora intanciamos objetos de SClip, cuyo argumento del constructor es <b>la ruta del sonido</b>.</p>

<p>Sólo resta hacer uso de estos objetos a través de los siguientes métodos:</p>

<h3>play()</h3>

<p>Reproduce el sonido por única vez.</p>

<h3>loop()</h3>

<p>Reproduce el sonido en bucle hasta que sea detenido.</p>

<h3>stop()</h3>

<p>Detiene la reproducción del sonido.</p>

<h2>¿Por qué se implementa de esta forma la clase?</h2>

<p>Usualmente los sonidos se reproducen en una interfaz gráfica de usuario, el problema de no usar hilos es que cuando reproduces un sonido el programa se queda congelado hasta que se termina la reproducción, entonces no se podrían reproducir varios sonidos a la vez, ni continuar con la ejecución común de un programa mientras reproduces un sonido. Por eso utilizamos hilos.</p>

<p>Las applets han sido descontinuadas por eso se usan los recursos del paquete javax.</p>

<h2>Posibles problemas</h2>

<p>Las rutas de los sonidos dependen de cómo se ejecute el programa (de la ruta en la que se ejecute), por lo que es posible que varíe.</p>

<p>En este ejemplo no explicaremos ese asunto.</p>

<h2>Más información</h2>

<p>Quizás le interese un <a href="">video en YouTube</a> con algunos ejemplos.</p>

<p>Enlace para <a href="https://cloudconvert.com/mp3-to-wav">convertir sonidos</a> .mp3 a .wav</p>

<p>Enlace para <a href="https://notube.net/es/convert">descargar videos de YouTube</a> (soporta formato .mp3)</p>

<p><a href="https://www.youtube.com/watch?v=YYwjq5v-ALA">Sonido de láser</a> que usé en el repositorio.</p>

<p><a href="https://www.youtube.com/watch?v=GEo1zya7FyA">Sonido de background</a> que usé en el repositorio.</p>

<p>Algunos epositorios referenciados en el video.</p>

<a href="">Emulador de ATM básico</a>

<a href="">Pong game in java</a>
