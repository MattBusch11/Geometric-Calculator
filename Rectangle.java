import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Caluculator");
		Optional<String> result = textInputDialog.showAndWait();
		String WidthInput = result.get();
		double width = Double.parseDouble(WidthInput);
	}
}
