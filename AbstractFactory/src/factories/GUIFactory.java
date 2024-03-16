package factories;

import buttons.Buttons;
import checkboxes.Checkboxes;


public interface GUIFactory {
	Buttons createButton();
    Checkboxes createCheckbox();
}
