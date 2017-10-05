public class Rectangle {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Caluculator");
		Optional<String> reult = textInputDialog.showAndWait();
		String input = result.get();
	}
}
