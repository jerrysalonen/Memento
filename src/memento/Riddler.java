package memento;

/**
 * @author Jerry Salonen
 */
public class Riddler {

    public Object liityPeliin() {
        int ans = (int) (Math.random() * (100 + 1));
        return new Memento(ans);
    }

    public boolean guess(Object o, int guess) {
        Memento m = (Memento) o;
        if (m.getGuess() == guess) {
            return true;
        }

        return false;
    }

    private class Memento {

        int guess;

        public Memento(int guess) {
            this.guess = new Integer(guess);
        }

        protected int getGuess() {
            return this.guess;
        }

    }

}
