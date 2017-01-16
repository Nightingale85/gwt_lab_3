package com.gwt.client.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwt.client.ClientFactory;
import com.gwt.client.mvp.view.IGreetingView;


public class GreetingActivity extends AbstractActivity implements IGreetingView.IGreetingPresenter {
	private ClientFactory clientFactory;
	
	public GreetingActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		final IGreetingView view = clientFactory.getGreetingView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
