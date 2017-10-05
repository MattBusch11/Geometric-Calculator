public class Rectangle {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Caluculator");
		Optional<String> reult = textInputDialog.showAndWait();
		String WidthInput = result.get();
		double width = Double.parseDouble(input);
	}
}
