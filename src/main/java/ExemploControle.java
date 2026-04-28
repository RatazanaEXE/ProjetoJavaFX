import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploControle extends Application {
    @Override
    public  void start (Stage palco){
        Label label = new Label("Etiqueta");
        Button botao = new Button("Clique Aqui!");
        TextField campo = new TextField();
        VBox layout = new VBox(label, botao,campo);

        Scene cena = new Scene(layout, 300, 200);
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
