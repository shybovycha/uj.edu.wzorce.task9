/**
 * Created by shybovycha on 11.05.15.
 */
public class PocztaPolska extends ICargoHandler {
    public PocztaPolska() {
    }

    @Override
    public void handle(Cargo c) {
        if (/*c.destCountry.equals("Polska") && */ c.weight < 0.5f) {
            System.out.println("Poczta Polska");
            return;
        }

        super.handle(c);
    }
}
