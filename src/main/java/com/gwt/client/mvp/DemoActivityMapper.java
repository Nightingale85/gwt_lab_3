package com.gwt.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.gwt.client.ClientFactory;
import com.gwt.client.mvp.activity.GreetingActivity;
import com.gwt.client.mvp.activity.LoginActivity;
import com.gwt.client.mvp.place.GreetingPlace;
import com.gwt.client.mvp.place.LoginPlace;


public class DemoActivityMapper implements ActivityMapper {
	private ClientFactory clientFactory;
	
	public DemoActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof LoginPlace) {
			return new LoginActivity(clientFactory);
		} else if (place instanceof GreetingPlace) {
			return new GreetingActivity(clientFactory);
		}
		return null;
	}
}
