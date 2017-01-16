package com.gwt.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.gwt.client.mvp.view.IGreetingView;
import com.gwt.client.mvp.view.ILoginView;

public interface ClientFactory {
	EventBus getEventBus();

	PlaceController getPlaceController();
	
	ILoginView getLoginView();

	IGreetingView getGreetingView();
}
