public class Pintura {
    //Crear la variable de instancia de cobertura
    private double cobertura;

//Construir el objeto cobertura
    public Pintura(double cobertura) {
        this.cobertura = cobertura;

    }//Usar el metodo para calcular el area de una de las formas y dividirlas por la cobertura
    public double cantidadpintura(Forma forma){
        return forma.Area()/cobertura;
    }

}
