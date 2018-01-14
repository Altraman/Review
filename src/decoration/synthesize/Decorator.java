package decoration.synthesize;

/**
 * Created by HuQiang on 2018/1/8.
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
