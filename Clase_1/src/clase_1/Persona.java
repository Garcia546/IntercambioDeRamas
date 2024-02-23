//Clase persona con sus atributos


package clase_1;


public class Persona 
{
    String name = "Juan";  //no es tipo de dato primitivo, es una clase
    
    int age;
    boolean isFemale;
    String direccion;
    String ocupacion;
    String country;
    
    /*
    El metodo constructor permite darle valores iniciales a cada objeto, se pone dentro de
    la clase persona
   */
   public Persona(String name, int age, boolean isFemale, String direccion, String country) // Método Constructor con el nombre de la clase
    {
        this.name = name;
        this.age = age;
        this.isFemale = false;
        this.direccion = direccion;
        this.country = country;
    }
   
   //Método para atributos de cada persona
    String getPeronInfo()
   {
       //return "Name: " + this.name + " Age: " + this.age + " Is Female?: " + this.isFemale + " Addres: " + this.direccion + " Country: " + this.country ;
       
       //con formato
       String data =  String.format("Name: %s  \nAge: %d  \nIs Female?: %b  \nAddress: %s  \nCountry: %s", this.name, this.age, this.isFemale, this.direccion, this.country);
       return data;
   }
}



