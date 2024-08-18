package com.dinkyinkydog.views.track;

import com.dinkyinkydog.entity.Health;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Track")
@Route(value = "")
@RouteAlias(value = "")
public class TrackView extends HorizontalLayout {

    private Health health = new Health(16);
    
    

    public TrackView() {
    	
         NativeLabel maxHealthLabel = new NativeLabel("" + health.getMaxHealth());
         NativeLabel currentHealthLabel = new NativeLabel("" + health.getCurrentHealth());
         add(maxHealthLabel);
         add(currentHealthLabel);
         String brokenHeart = "img/Icon.brokenheart.png";
         Image takeDamageIcon = new Image(brokenHeart, "broken heart");
         takeDamageIcon.setWidth("100px");
         Button takeDamageButton = new Button(takeDamageIcon);
         takeDamageButton.addThemeVariants(ButtonVariant.LUMO_ICON);
         
         add(takeDamageButton);
    }

}
