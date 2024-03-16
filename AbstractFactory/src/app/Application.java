package app;

import buttons.Buttons;
import checkboxes.Checkboxes;
import factories.GUIFactory;

public class Application {
	private Buttons buttons;
    private Checkboxes checkboxes;

    public Application(GUIFactory factory) {
        buttons = factory.createButton();
        checkboxes = factory.createCheckbox();
    }

    public void paint() {
        buttons.paint();
        checkboxes.paint();
    }
}
