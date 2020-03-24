package oop.inheritance.verifone.v240m;

public class VerifoneV240mDisplay {

    private static VerifoneV240mDisplay instance;

    private VerifoneV240mDisplay()
    {

    }

    public static VerifoneV240mDisplay getInstance()
    {
        if(instance == null)
            instance = new VerifoneV240mDisplay();
        return instance;
    }


    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
