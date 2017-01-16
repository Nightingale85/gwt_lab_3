package com.gwt.client.mvp.view.greeting;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwt.client.i18n.Message;
import com.gwt.client.mvp.view.IGreetingView;


public class GreetingView extends Composite implements IGreetingView {
	interface GreetingViewUiBinder extends UiBinder<Widget, GreetingView> {	}
	private static GreetingViewUiBinder uiBinder = GWT.create(GreetingViewUiBinder.class);
	@UiField(provided = true)
	final Message i18n;
	@UiField
	Anchor logOut;
	@UiField
	Label userGreeting;
	private IGreetingPresenter presenter;

	public GreetingView() {
		this.i18n = GWT.create(Message.class);
		initWidget(uiBinder.createAndBindUi(this));
	}


	public Label getUserGreeting() {
		return userGreeting;
	}

	public void setUserGreeting(Label userGreeting) {
		this.userGreeting = userGreeting;
	}

	public Anchor getLogOut() {
		return logOut;
	}

	public void setLogOut(Anchor logOut) {
		this.logOut = logOut;
	}

	public Message getI18n() {
		return i18n;
	}

	@Override
	public void setPresenter(IGreetingPresenter presenter) {
		this.presenter = presenter;
	}
}