package com.alexco.potluck.views.gathering;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Gathering")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 3)
@Route(value = "gatheringdetails")
@RolesAllowed("USER")
public class GatheringView extends Composite<VerticalLayout> {

    public GatheringView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H1 h1 = new H1();
        TextField textField = new TextField();
        RichTextEditor richTextEditor = new RichTextEditor();
        TextField textField2 = new TextField();
        DateTimePicker dateTimePicker = new DateTimePicker();
        DateTimePicker dateTimePicker2 = new DateTimePicker();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.START);
        layoutRow.setJustifyContentMode(JustifyContentMode.END);
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h1.setText("Gathering title");
        h1.setWidth("max-content");
        textField.setLabel("Title");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, textField);
        textField.setWidth("100%");
        richTextEditor.setWidth("100%");
        textField2.setLabel("Location");
        textField2.setWidth("100%");
        dateTimePicker.setLabel("Start time");
        dateTimePicker.setWidth("min-content");
        dateTimePicker2.setLabel("End time");
        dateTimePicker2.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h1);
        layoutColumn2.add(textField);
        layoutColumn2.add(richTextEditor);
        layoutColumn2.add(textField2);
        layoutColumn2.add(dateTimePicker);
        layoutColumn2.add(dateTimePicker2);
    }
}
