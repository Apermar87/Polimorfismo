public class Polimorfismo {
    public static void main(String[] args) throws Exception {
        Alumno alumno = new Alumno("Antonio", "Pérez");
        Profesor profesor = new Profesor("Fran", "Pérez");

        System.out.println(alumno);
        System.out.println(profesor);
    }
}