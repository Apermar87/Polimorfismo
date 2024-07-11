public class Alumno extends Persona {

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Datos del alumno: " + super.toString();
    }

}
