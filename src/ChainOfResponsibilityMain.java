/**
 * Created by shybovycha on 11.05.15.
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Cargo c1 = new Cargo("Polska", 60.f);
        Cargo c2 = new Cargo("Polska", 10.f);
        Cargo c3 = new Cargo("Polska", 0.2f);
        Cargo c4 = new Cargo("Czechy", 10.0f);
        Cargo c5 = new Cargo("Stany", 140.0f);

        ICargoHandler handler = new SeaCarrier().pipe(new FlightCarrier().pipe(new CustomTransport().pipe(new PocztaPolska().pipe(new Currier().pipe(new UPS())))));

        handler.handle(c1);
        handler.handle(c2);
        handler.handle(c3);
        handler.handle(c4);
        handler.handle(c5);
    }
}
