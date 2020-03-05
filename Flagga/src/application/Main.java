package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {

    //Buttons
    Button _sweKey;
    Button _japKey;

    //Flags
    StackPane _flagOfJapan = new StackPane();
    StackPane _flagOfSweden = new StackPane();

    //Define all main GUI elements
    HBox _buttonBox = new HBox();
    Group _root = new Group(buttons());
    //Scene _mainSceneJ = new Scene(_root, 300, 200);
    Scene _mainScene = new Scene(_root, 450, 250);
    
    Stage _window;

    @Override
    public void start(Stage window) throws Exception {
        _window = window;

        generateFlags();

        _window.setScene(_mainScene);
        
        _window.show();
    }

    private void generateFlags() {
        sweden();
        japan();
    }

    private HBox buttons(){
        _sweKey = new Button("Sweden");
        _sweKey.setOnAction(this);

        _japKey = new Button("Japan");
        _japKey.setOnAction(this);

        _buttonBox.getChildren().addAll(_sweKey, _japKey);
 

        return _buttonBox;
    }

    private void japan() {
        Circle circle = new Circle(150, 100, 75, Color.RED);
       Rectangle line = new Rectangle(300, 200, Color.BLACK);
       Rectangle line2 = new Rectangle(298, 198, Color.WHITE);

        _flagOfJapan.getChildren().addAll(line, line2, circle);

       //_mainSceneJ.setFill(Color.RED);
    }

    private void sweden() {
        Rectangle horizontalLine = new Rectangle(48, 198, Color.YELLOW);
        Rectangle vericalLine = new Rectangle(298, 48, Color.YELLOW);
        Rectangle line = new Rectangle(300, 200, Color.BLACK);  
        Rectangle blue = new Rectangle(298, 198, Color.BLUE);
        
        _flagOfSweden.getChildren().addAll(line, blue, horizontalLine, vericalLine);
       //_mainScene.setFill(Color.BLUE);

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if (actionEvent.getSource() == _sweKey) {
            if (!_buttonBox.getChildren().contains(_flagOfJapan)){
                _buttonBox.getChildren().add(_flagOfSweden);
                return;
            }

            _buttonBox.getChildren().remove(_flagOfJapan);
            _buttonBox.getChildren().add(_flagOfSweden);
            return;
        }

        if (actionEvent.getSource() == _japKey) {
            if (!_buttonBox.getChildren().contains(_flagOfSweden)){
                _buttonBox.getChildren().add(_flagOfJapan);
                return;
            }

            _buttonBox.getChildren().remove(_flagOfSweden);
            _buttonBox.getChildren().add(_flagOfJapan);
            return;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
