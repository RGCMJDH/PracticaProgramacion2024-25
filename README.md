# Práctica Final: Hundir la Flota

Este proyecto implementa el clásico juego de mesa **Hundir la Flota**, desarrollado como práctica final para la asignatura *Programación - Informática I (GEIN, GTTT)* del curso 2024-2025 en la Universidad de las Islas Baleares.

## Descripción del Proyecto

El objetivo del proyecto es consolidar los conocimientos adquiridos durante el curso mediante el desarrollo de un programa que permita jugar al juego "Hundir la Flota". Las principales características son:

- **Modos de juego:**
  - Un jugador contra la CPU.
  - Dos jugadores entre sí.
  - Partida individual (jugador contra el sistema).
- **Registros y estadísticas:**
  - Detalles de cada partida jugada.
  - Estadísticas individuales de los jugadores.
- **Configuración del juego:**
  - Tablero de 10x10 casillas.
  - Distribución de barcos predeterminada: 5-4-3-3-2.

El desarrollo se realiza con un enfoque orientado a objetos, utilizando el lenguaje de programación **Java** y el entorno de desarrollo integrado **NetBeans**. Se proporcionan herramientas adicionales, como ficheros de texto para la inicialización del tablero.

## Funcionalidades Obligatorias

Para que el proyecto sea considerado aprobado, debe cumplir con las siguientes funcionalidades obligatorias:

1. **Modo de juego obligatorio: Jugar en solitario**
   - El jugador introduce su nombre y dispara contra un tablero controlado por el programa hasta hundir todos los barcos.
   - El programa utiliza un fichero para determinar la distribución inicial de los barcos.
   - Los resultados de la partida deben ser registrados.

2. **Registro de partidas**
   - Mostrar detalles de las partidas jugadas, incluyendo:
     - Fecha y hora de la partida.
     - Nombre del jugador.
     - Modo de juego (solitario, contra otro jugador o contra la CPU).
     - Dimensiones del tablero y configuración de barcos.
     - Número de disparos realizados (tocados, hundidos y agua).
     - Resultado de la partida (victoria/derrota).

3. **Estructura del proyecto**
   - Implementación en Java, utilizando NetBeans como entorno de desarrollo.
   - Uso de orientación a objetos para representar los datos y procesos necesarios.

4. **Restricciones técnicas**
   - Procesamiento de ficheros de manera secuencial sin cargar su contenido completo en memoria.
   - Prohibición de uso de métodos de manipulación de cadenas de la clase `String`, salvo para entrada/salida.
   - No se permite el uso de técnicas avanzadas no vistas en clase (e.g., recursividad, backtracking).

5. **Menú principal**
   - Incluir un menú interactivo que permita seleccionar las opciones obligatorias:
     - Jugar en solitario.
     - Consultar el registro de partidas.

## Objetivos Académicos

El proyecto busca desarrollar habilidades en:
- Programación orientada a objetos.
- Uso de estructuras de datos y control.
- Diseño de algoritmos eficientes.
- Gestión de entradas/salidas desde y hacia ficheros.
- Presentación de información al usuario mediante interfaces claras y funcionales.

## Evaluación

La calidad del código, la implementación de los objetivos obligatorios y la correcta documentación del proyecto son aspectos clave para la evaluación. Además, el proyecto debe cumplir con las restricciones indicadas para ser considerado válido.
