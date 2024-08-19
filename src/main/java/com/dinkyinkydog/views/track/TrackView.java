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
    	
         NativeLabel maxHealthLabel = new NativeLabel("Max: " + health.getMaxHealth());
         NativeLabel currentHealthLabel = new NativeLabel("" + health.getCurrentHealth());
         Image hp = new Image("icons/HPicon.png", "currentHealthIcon");
         add(maxHealthLabel);
         add(currentHealthLabel);
         
         
         
         //heal/damage buttons
         String buttonSize = "70px";
         
         Image takeDamageIcon = new Image("img/Icon.brokenheart.png", "broken heart");
         takeDamageIcon.setWidth(buttonSize);
         Button takeDamageButton = new Button(takeDamageIcon);
         takeDamageButton.addThemeVariants(ButtonVariant.LUMO_ICON);
         
         Image healthpotionIcon = new Image("img/icon.potion.png", "potion bottle");
         healthpotionIcon.setWidth(buttonSize);
         Button healButton = new Button(healthpotionIcon);
         
         add(takeDamageButton);
         add(healButton);
    }

}
