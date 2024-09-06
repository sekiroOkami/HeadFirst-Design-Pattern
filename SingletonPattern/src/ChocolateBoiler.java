public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    public ChocolateBoiler() {
        // code start when boiler is empty
        empty = true;
        boiled = false;
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty =true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled =true;
        }
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a ingredient
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
