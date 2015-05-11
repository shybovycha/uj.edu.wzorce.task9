/**
 * Created by shybovycha on 11.05.15.
 */
public abstract class ICargoHandler {
    protected ICargoHandler next;

    public ICargoHandler() {
    }

    public ICargoHandler pipe(ICargoHandler next) {
        this.next = next;

        return this;
    }

    public void handle(Cargo c) {
        if (this.next != null) {
            this.next.handle(c);
        }
    }
}
