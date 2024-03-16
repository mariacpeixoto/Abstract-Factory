package factories;

import buttons.Buttons;
import buttons.WindowsButton;
import checkboxes.Checkboxes;
import checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Buttons createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkboxes createCheckbox() {
		return new WindowsCheckbox();
	}

}
