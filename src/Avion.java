public class Avion {
    //Atributos
    int capacidad;
    String color;
    String estado;
    //Constructor
    public Avion(){
        capacidad=1000;
        color="Blanco";
        estado="En Tierra";
    }
    //Metodos
    public String getColor(String blanco){
        return color;
    }
    public void setColor(String nuevo_color){
        color=nuevo_color;
    }
}
