public class Main {
    public static void main(String[] args) {
        // Crear una instancia de MineriaDatosTitanic para la exploración de datos y entrenamiento del modelo
        MineriaDatosTitanic mineriaDatosTitanic = new MineriaDatosTitanic();

        // Especificar el archivo CSV para la exploración de datos
        String archivoCSVExploracion = "titanic.csv";

        // Explorar los datos antes de entrenar el modelo
        mineriaDatosTitanic.explorarDatos(archivoCSVExploracion);

        // Especificar el archivo CSV y otros parámetros para el entrenamiento del modelo
        String archivoCSVEntrenamiento = "titanic.csv"; // Ruta del archivo CSV con los datos del Titanic
        int maxIteraciones = 100000; // Número máximo de iteraciones para el entrenamiento
        double tasaAprendizaje = 0.70; // Tasa de aprendizaje para el entrenamiento del modelo

        // Entrenar el modelo
        mineriaDatosTitanic.entrenar(archivoCSVEntrenamiento, maxIteraciones, tasaAprendizaje);

        System.out.print("\nPREDICCION\n");
        // Realizar predicciones de ejemplo
        double pclass = 3.0; // Clase del boleto (tercera clase)
        String sexo = "male"; // Género del pasajero (masculino)
        double edad = 30; // Edad del pasajero
        double sibSp = 1.0; // Número de hermanos/cónyuges a bordo
        double parch = 2.0; // Número de padres/hijos a bordo

        // Calcular la probabilidad de sobrevivir usando el modelo de entrenamiento
        double probabilidadSobrevivir = mineriaDatosTitanic.predecir(pclass, sexo, edad, sibSp, parch);

        // Imprimir datos de entrada
        System.out.println("Clase del boleto: " + pclass);
        System.out.println("Género del pasajero: " + sexo);
        System.out.println("Edad del pasajero: " + edad);
        System.out.println("Número de hermanos/cónyuges a bordo: " + sibSp);
        System.out.println("Número de padres/hijos a bordo: " + parch);

        // Imprimir los resultados en porcentaje y el resultado numérico
        System.out.printf("\nResultado: %.2f\nProbabilidad de sobrevivir: %.2f%%\n", probabilidadSobrevivir, probabilidadSobrevivir * 100);
    }
}
