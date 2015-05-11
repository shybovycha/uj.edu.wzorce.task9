/**
 * Created by shybovycha on 11.05.15.
 */
public class Currier extends ICargoHandler {
    public Currier() {
    }

    @Override
    public void handle(Cargo c) {
        if (c.destCountry.equals("Polska") && c.weight < 20.0f) {
            System.out.println("Currier");
            return;
        }

        super.handle(c);
    }
}
