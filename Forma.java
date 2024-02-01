public class Forma {
    //Hacer el atributo de instancia de las formas
    private String nombre;
    public Forma(String nombre){
        this.nombre=nombre;
    }
//Añadir un método Area para las formas
    public double Area(){
        return 0;

    }
    //Sobreescribir para pasar el nombre de las formas
    @Override
    public String toString(){
        return "Nombre:" + nombre;
    }


}
//Crear una clase Esfera que descienda de Forma
class Esfera extends Forma{
   private double radio;
//Construir la variable radio en la Esfera
    public Esfera(double radio){
       super("Esfera:");
       this.radio=radio;


   }//Sobreescribir el area de la esfera
   @Override
   public double Area(){
        return (4* Math.PI*(Math.pow(radio,2)));
   }





}
//Crear una clase Rectangulo de Forma
class Rectangulo extends Forma{
    private double longitud;
    private double ancho;
    //Construir las variables longitud y ancho en el Rectangulo
    public Rectangulo(double longitud,double ancho){
        super("Rectangulo:");
        this.longitud=longitud;
        this.ancho=ancho;

    }//Sobreescribir el area del rectangulo
    @Override
    public double Area(){
        return longitud*ancho;
    }
}//Crear una clase Cilindro de Forma
class Cilindro extends Forma{

    private double radio;
    private double altura;
    //Construir las variables radio y altura en Cilindro
    public Cilindro(double radio,double altura){
        super("Cilindro:");
        this.radio=radio;
        this.altura=altura;

    }
    //Sobreescribir el area del cilindro
    @Override
    public double Area(){
        return (Math.PI*(Math.pow(radio,2))*altura);
    }



}
