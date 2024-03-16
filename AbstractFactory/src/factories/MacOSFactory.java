package factories;

import buttons.Buttons;
import buttons.MacOSButton;
import checkboxes.Checkboxes;
import checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Buttons createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkboxes createCheckbox() {
		return new MacOSCheckbox();
	}

}
