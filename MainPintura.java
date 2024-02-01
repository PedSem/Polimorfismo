public class MainPintura {
    public static void main(String[]args){
        //Llamar a la variable de pintura
        Pintura pintura=new Pintura(250);
        //Llamar a la variable de la esfera
        Esfera esfera=new Esfera(15);
        //Llamar a las variables del rectangulo
        Rectangulo rectangulo=new Rectangulo(20,35);
        //Llamar a las variables del cilindro
        Cilindro cilindro=new Cilindro(10,30);

        //Crear una variable para calcular esa cantidad de pintura de la esfera
        double cantidadpinturaEsfera= pintura.cantidadpintura(esfera);
        System.out.println("Esfera:"+ cantidadpinturaEsfera);

        //Crear una variable para calcular esa cantidad de pintura del Rectangulo
        double cantidadpinturaRectangulo=pintura.cantidadpintura(rectangulo);
        System.out.println("Rectangulo:" +cantidadpinturaRectangulo);

        //Crear una variable para calvular esa cantidad de pintura del Cilindro
        double cantidadpinturaCilindro=pintura.cantidadpintura(cilindro);
        System.out.println("Cilindro:" +cantidadpinturaCilindro);

    }
}
