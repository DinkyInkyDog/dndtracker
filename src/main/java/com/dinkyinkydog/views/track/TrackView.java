package com.dinkyinkydog.views.track;

import com.dinkyinkydog.entity.Health;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.notification.Notification;
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

		// --containers---
		Div mainPage = new Div();
		mainPage.setClassName("main-page");

		Div healthcontrols = new Div();
		Div currentHealthDisplay = new Div();
		currentHealthDisplay.setClassName("health-display");

		// ---max health state----
		NativeLabel maxHealthLabel = new NativeLabel("Max: " + health.getMaxHealth());
		maxHealthLabel.addClassName("max_health_label");
		NativeLabel currentHealthLabel = new NativeLabel("" + health.getCurrentHealth());
		currentHealthLabel.setClassName("centered-label");
		Image hp = new Image("icons/HPicon.png", "currentHealthIcon");
		hp.setClassName("health-image");

		// ---change number input---
		NumberField healthChange = new NumberField();
		healthChange.setWidth("50px");

		// heal/damage buttons
		String buttonSize = "70px";

		Image takeDamageIcon = new Image("img/Icon.brokenheart.png", "broken heart");
		takeDamageIcon.setWidth(buttonSize);
		Button takeDamageButton = new Button(takeDamageIcon);
		takeDamageButton.addClickListener(event -> {
			if (healthChange.getValue() != null) {
				double value = healthChange.getValue();
				health.takeDamage((int) value);
				currentHealthLabel.setText("" + health.getCurrentHealth());
				Notification.show("Damage subtracted from health");
				healthChange.setValue(null);
			} else {
				Notification.show("Please enter a number in the feild");
			}
		});

		Image healthpotionIcon = new Image("img/icon.potion.png", "potion bottle");
		healthpotionIcon.setWidth(buttonSize);
		Button healButton = new Button(healthpotionIcon);
		healButton.addClickListener(event -> {
			if (healthChange.getValue() != null) {
				double value = healthChange.getValue();
				health.heal((int) value);
				currentHealthLabel.setText("" + health.getCurrentHealth());
				Notification.show("Health added to health");
				healthChange.setValue(null);
			} else {
				Notification.show("Please enter a number in the feild");
			}
		});

		// --view---
		mainPage.add(currentHealthDisplay, healthcontrols);
		healthcontrols.add(healButton, healthChange, takeDamageButton);
		currentHealthDisplay.add(hp, currentHealthLabel);

		add(mainPage);

	}

}
