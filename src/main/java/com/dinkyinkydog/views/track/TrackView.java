package com.dinkyinkydog.views.track;

import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Track")
@Route(value = "")
@RouteAlias(value = "")
public class TrackView extends HorizontalLayout {

    
    
    

    public TrackView() {
    	
    	
    	
    	 int intValue = 42; // Your int value
         NativeLabel label = new NativeLabel("The value is: " + intValue);
         add(label);
    }

}
