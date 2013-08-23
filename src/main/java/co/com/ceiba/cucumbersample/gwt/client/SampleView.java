package co.com.ceiba.cucumbersample.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SampleView extends Composite {

	private static SampleViewUiBinder uiBinder = GWT
			.create(SampleViewUiBinder.class);

	interface SampleViewUiBinder extends UiBinder<Widget, SampleView> {
	}
	
	public @UiField Button button;

	public SampleView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
