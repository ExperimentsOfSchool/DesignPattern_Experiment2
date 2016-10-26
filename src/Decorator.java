/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public abstract class Decorator implements VisualComponent {
    protected VisualComponent component;
    public Decorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public abstract void draw();
}
