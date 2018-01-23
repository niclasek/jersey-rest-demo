package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findAll(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		activity1.setDescription("Running");
		activity1.setDuration(90);
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		activity2.setDescription("Swimming");
		activity2.setDuration(40);
		activities.add(activity2);
		
		return activities;
	}
}
