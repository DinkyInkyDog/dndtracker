package com.dinkyinkydog.views.track;

import com.dinkyinkydog.entity.Health;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Track")
@Route(value = "")
@RouteAlias(value = "")
@CssImport("./styles/myStyles.css")
public class TrackView extends HorizontalLayout {

    private Health health = new Health(16);
    
    

    public TrackView() {
    	
    	//--containers---
    	Div mainPage = new Div();
    	mainPage.setClassName("main-page");
    	
    	Div healthcontrols = new Div();
    	Div currentHealthDisplay = new Div();
    	currentHealthDisplay.setClassName("health-display");
    	
    	//---max health state----
         NativeLabel maxHealthLabel = new NativeLabel("Max: " + health.getMaxHealth());
         NativeLabel currentHealthLabel = new NativeLabel("" + health.getCurrentHealth());
         currentHealthLabel.setClassName("centered-label");
         Image hp = new Image("icons/HPicon.png", "currentHealthIcon");
         
         //---change number input---
         NumberField healthChange = new NumberField();
         healthChange.setWidth("50px");
         
         
         //heal/damage buttons
         String buttonSize = "70px";
         
         Image takeDamageIcon = new Image("img/Icon.brokenheart.png", "broken heart");
         takeDamageIcon.setWidth(buttonSize);
         Button takeDamageButton = new Button(takeDamageIcon);
         takeDamageButton.addClickListener(event ->{ 
        	 double value = healthChange.getValue();
        	 health.takeDamage((int)value);
        	 });
         
         Image healthpotionIcon = new Image("img/icon.potion.png", "potion bottle");
         healthpotionIcon.setWidth(buttonSize);
         Button healButton = new Button(healthpotionIcon);
         healButton.addClickListener(event -> {
        	 double value = healthChange.getValue(); 
        	 health.heal((int)value);
         });
         
         
         //--view---
         mainPage.add(currentHealthDisplay, healthcontrols);
         healthcontrols.add(healButton,healthChange, takeDamageButton);
         currentHealthDisplay.add(currentHealthLabel);
         
         add(mainPage);
         
    }

}
