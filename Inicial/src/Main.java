public class Main {
    //Esto es un comentario para aclaracion breve de lo que hace el metodo

    /**
     * Comentario de documentacion Javadoc
     * @param args
     */
    public static void main(String[] args) {
        final String NUMERO_DNI = "49340359T"; //Esto es un variable constante
        String nombreCompleto = "José Andrés Montalbán Guerra"; //Los String son palabras que van entre comillados dobles
        int edad = 27;
        float altura = 1.82f;
        double peso = 82.250;
        char letraCarnet = 'T';
        boolean experiencia = true;

        System.out.println("Mi DNI es "+NUMERO_DNI);
        System.out.println("Hola, este es mi primer programa en JAVA. \nEsta es la segunda linea\n");
        System.out.println("Mi nombre es "+nombreCompleto);
        System.out.println("Mi edad es "+edad);
        System.out.println("Mi altura es "+altura+" m");
        System.out.println("Mi peso es "+peso+" kg");
        System.out.println("La letra de mi DNI es "+letraCarnet);
        System.out.println("tengo experiencia "+experiencia);
        /*
        Este tipo de comentraio
        te permite escribir
        en mas de una linea
         */
    }
    public void metodoCarton(){
        //TODO pendiente crear el carton con numeros aleatorios sin repetir

    }
}
