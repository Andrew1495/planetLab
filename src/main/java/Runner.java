public class Runner {
    public static void main(String[] args) {
        Planet planet = new Planet( "mars", 908973 );
        System.out.println(planet.getName()  + " is " + planet.getSize());
        planet.explode();
    }
}
