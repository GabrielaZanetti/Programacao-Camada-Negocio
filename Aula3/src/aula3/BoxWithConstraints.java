package aula3;

/**
 *
 * @author gabriela.zanetti
 */

public class BoxWithConstraints <T extends HomeAppLiance> {
    private T value;

    public BoxWhithConstraint (T value) {
        this.value = value;
    }

    public void setValue (T value) {
        this.value = value;
    }

    public void getValue () {
        return this.value;
    }

}
