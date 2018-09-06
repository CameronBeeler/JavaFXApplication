package com.cambeeler;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public
class Controller
{
    @FXML   private Button      B1, B2, B3, B4, B5;
    @FXML   private Label       label;
    @FXML   private Button      button4;
    @FXML   private GridPane    gridPane;


    @FXML
    public void
    initialize()
    {
        button4.setEffect(new DropShadow());


    }

    @FXML
    public void handleMouseEnter()
    {
        label.setScaleY(2.0);
        label.setScaleX(2.0);
    }

    @FXML
    public void handleMouseExit()
    {
        label.setScaleY(1.0);
        label.setScaleX(1.0);
    }

    @FXML
    public void handleClick()
    {
        FileChooser chooser = new FileChooser();
        chooser.showOpenDialog(gridPane.getScene().getWindow());
    }

    @FXML
    public void handleB2Click()
    {
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.showDialog(gridPane.getScene().getWindow());

    }

//    {
//
//    }
//    @FXML
//    public void
//    keyClick2()
//    {
//
//    }
//    @FXML
//    public void
//    keyClick3()
//    {
//
//    }
//    @FXML
//    public void
//    keyClick4()
//    {
//
//    }
//    @FXML
//    public void
//    keyClick5()
//    {
//
//    }

}
