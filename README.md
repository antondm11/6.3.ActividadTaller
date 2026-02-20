# 6.3.ActividadTaller
Repo para la actividad 6.3 Diagrama de Clases - Entornos de Desarrollo


-- Plugin Mermaid para Visual Studio: markdown preview mermaid support**


# Explicación de decisiones tomadas

Se ha decidido establecer una relación de composición entre las clases Vehículo y Reparación, ya que en el contexto de este taller, una Reparación no tendría sentido sin un Vehículo al que realizarla. Por tanto, si se eliminan los vehículos del taller, también se eliminarían las reparaciones, cayendo con ello el propósito del proyecto.

Por otra parte, utilizar la Interfaz Especialista lleva consigo una serie de ventajas. En primer lugar, al ser una plantilla de métodos (comportamiento), permite que pueda ser implementada en la clase que se desee, siendo en cada una de éstas donde se definirá el funcionamiento de los métodos para dicha clase. Esto permite el polimorfismo, ya que varias clases pueden implementar la misma interfaz pero sus métodos funcionarán de manera diferente en cada una. Otros conceptos que favorece la Interfaz son el desacoplamiento y la flexibilidad. El desacoplamiento permite que el código no esté sujeto a implementaciones concretas. La flexibilidad es clave al permitir cambiar cómo son implementados los métodos de la interfaz sin afectar al código.




