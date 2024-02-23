//Debe estar en el mismo paquete la clase
//Desde aquí accedemos a la clase persona

package clase_1;

public class Clase_1 
{
    
    public static void main(String[] args) 
    {
        /*
        //objeto A
        Persona firstPerson = new Persona(); //Accedemos a la clase persona
        
        System.out.println("OBJETO A");
        
        //Podemos reescribir las variables desde el main
        firstPerson.name = "Jose";
        firstPerson.age = 22;
        
        System.out.println(firstPerson.name);
        System.out.println(firstPerson.age);
        System.out.println(firstPerson.isFemale);
        System.out.println(firstPerson.direccion);
        System.out.println(firstPerson.ocupacion);
        
        System.out.println("\n*****");
        
        //Objeto B
        System.out.println("\nOBJETO B");
        
        Persona secondPerson = new Persona();
        
        System.out.println(secondPerson.name);
        System.out.println(secondPerson.age);
        System.out.println(secondPerson.isFemale);
        
        //Cambiamos los valores para el objeto B
        secondPerson.direccion = "Ignacio Allende S/N";
        secondPerson.ocupacion = "Trabajador";
        
        System.out.println(secondPerson.direccion);
        System.out.println(secondPerson.ocupacion);
        */
        
        /*Ejercicio con 4 personas diferentes
        //Juan
        Persona firstPerson = new Persona("Juan",20, false, "Calle Morelos", "Morelia");
        //Maria
        Persona secondPerson = new Persona("Maria",22, true, "Calle Fovisste", "Moroleón");
        //Pedro
        Persona thirdPerson = new Persona("Pedro",24, false, "Calle Ignacio Allende", "México");
        //Carolina
        Persona fourthPerson = new Persona("Carolina",17, true, "Calle privada", "Uriangato");
        
        /*System.out.println("\nA");
        System.out.println(firstPerson.name);
        System.out.println(firstPerson.age);
        System.out.println(firstPerson.isFemale);
        System.out.println(firstPerson.direccion);
        System.out.println(firstPerson.country);
        
        System.out.println("\nB");
        System.out.println(secondPerson.name);
        System.out.println(secondPerson.age);
        System.out.println(secondPerson.isFemale);
        System.out.println(secondPerson.direccion);
        System.out.println(secondPerson.country);
        
        System.out.println("\nC");
        System.out.println(thirdPerson.name);
        System.out.println(thirdPerson.age);
        System.out.println(thirdPerson.isFemale);
        System.out.println(thirdPerson.direccion);
        System.out.println(thirdPerson.country);
        
        System.out.println("\nD");
        System.out.println(fourthPerson.name);
        System.out.println(fourthPerson.age);
        System.out.println(fourthPerson.isFemale);
        System.out.println(fourthPerson.direccion);
        System.out.println(fourthPerson.country);*/
        
        //Usando el método para imprimir
         //Juan
        Persona firstPerson = new Persona("Juan",20, false, "Calle Morelos", "Morelia");
        //Maria
        Persona secondPerson = new Persona("Maria",22, true, "Calle Fovisste", "Moroleón");
        //Pedro
        Persona thirdPerson = new Persona("Pedro",24, false, "Calle Ignacio Allende", "México");
        //Carolina
        Persona fourthPerson = new Persona("Carolina",17, true, "Calle privada", "Uriangato");
        
        System.out.println("\nFIRST PERSON");
        System.out.println(firstPerson.getPeronInfo());
        
        System.out.println("\nSECOND PERSON");
        System.out.println(secondPerson.getPeronInfo());
        
        System.out.println("\nTHIRD PERSON");
        System.out.println(thirdPerson.getPeronInfo());
        
        System.out.println("\nFOURTH PERSON");
        System.out.println(fourthPerson.getPeronInfo());
        
    }    
}

