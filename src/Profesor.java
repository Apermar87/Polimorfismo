public class Profesor extends Persona {

    public Profesor(){
        super();
    }

    public Profesor (String nombre, String apellidos){
        super(nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Datos del profesor: " + super.toString();
    }
    
}
