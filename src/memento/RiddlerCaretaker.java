package memento;

/**
 * @author Jerry Salonen
 */
public class RiddlerCaretaker {

    Riddler r;

    public Object liityPeliin(Riddler r) {
        this.r = r;
        return r.liityPeliin();
    }

    public boolean guess(Object o, int guess) {
        return r.guess(o, guess);
    }

}
