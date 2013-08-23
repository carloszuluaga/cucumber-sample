package co.com.ceiba.cucumbersample.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Sample implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Button b = new Button("Test");
		RootPanel.get().add(b);
	}

}
