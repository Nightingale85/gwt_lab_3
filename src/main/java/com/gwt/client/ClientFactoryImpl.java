package com.gwt.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.gwt.client.mvp.view.IGreetingView;
import com.gwt.client.mvp.view.ILoginView;
import com.gwt.client.mvp.view.greeting.GreetingView;
import com.gwt.client.mvp.view.login.LoginView;
import com.gwt.client.utils.DayPartUtil;
import com.gwt.client.utils.Messenger;

import java.util.Date;


public class ClientFactoryImpl implements ClientFactory {
	private final EventBus eventBus = new SimpleEventBus();
	private final PlaceController placeController = new PlaceController(eventBus);
	private final Messenger messenger = Messenger.getInstance();
	private final ILoginView loginView = new LoginView();
	private final IGreetingView greetingView = new GreetingView();


	@Override public EventBus getEventBus() { return eventBus; }
	@Override public PlaceController getPlaceController() { return placeController; }
	public ILoginView getLoginView() { return loginView; }
	public IGreetingView getGreetingView() { return greetingView; }

}
