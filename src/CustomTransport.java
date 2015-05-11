/**
 * Created by shybovycha on 11.05.15.
 */
public class CustomTransport extends ICargoHandler {
    public CustomTransport() {
    }

    @Override
    public void handle(Cargo c) {
        if (c.destCountry.equals("Czechy") ||
                c.destCountry.equals("Słowacja") ||
                c.destCountry.equals("Ukraina") ||
                c.destCountry.equals("Niemcy")
                ) {
            System.out.println("Własny transport");
            return;
        }

        super.handle(c);
    }
}
