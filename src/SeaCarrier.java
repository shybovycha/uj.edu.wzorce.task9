/**
 * Created by shybovycha on 11.05.15.
 */
public class SeaCarrier extends ICargoHandler {
    public SeaCarrier() {
    }

    @Override
    public void handle(Cargo c) {
        if (c.weight >= 100.f && (c.destCountry.equals("Rosja") ||
                c.destCountry.equals("Japonia") ||
                c.destCountry.equals("Stany")
        )) {
            System.out.println("Lotnicza przesyłka");
            return;
        }

        super.handle(c);
    }
}
