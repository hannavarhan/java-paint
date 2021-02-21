package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ShapeController {

    @FXML
    private Pane drawPanel;

    @FXML
    private TextField userInfoArea;

    @FXML
    private Text parameterDescriptionField;

    @FXML
    private ColorPicker lineColorPicker;

    @FXML
    private ColorPicker fillColorPicker;

    @FXML
    private RadioButton lineBtn;

    @FXML
    private RadioButton rayBtn;

    @FXML
    private RadioButton polygonBtn;

    @FXML
    private RadioButton brokenLineBtn;

    @FXML
    private RadioButton segmentBtn;

    @FXML
    private RadioButton ellipseBtn;

    @FXML
    private RadioButton rhombusBtn;

    @FXML
    private RadioButton parallelogramBtn;

    @FXML
    private RadioButton circleBtn;

    @FXML
    private RadioButton rectangleBtn;

    @FXML
    private RadioButton regularPolygon;

    @FXML
    void initialize() {

        ToggleGroup radioButtonGroup = new ToggleGroup();
        lineBtn.setToggleGroup(radioButtonGroup);
        rayBtn.setToggleGroup(radioButtonGroup);
        polygonBtn.setToggleGroup(radioButtonGroup);
        brokenLineBtn.setToggleGroup(radioButtonGroup);
        segmentBtn.setToggleGroup(radioButtonGroup);
        ellipseBtn.setToggleGroup(radioButtonGroup);
        rhombusBtn.setToggleGroup(radioButtonGroup);
        parallelogramBtn.setToggleGroup(radioButtonGroup);
        circleBtn.setToggleGroup(radioButtonGroup);
        rectangleBtn.setToggleGroup(radioButtonGroup);
        regularPolygon.setToggleGroup(radioButtonGroup);

        radioButtonGroup.selectedToggleProperty().addListener((observableValue, toggle, t1) -> {
            if(radioButtonGroup.getSelectedToggle() != null) {
                RadioButton selected = (RadioButton) radioButtonGroup.getSelectedToggle();

            }

        });
    }

}


