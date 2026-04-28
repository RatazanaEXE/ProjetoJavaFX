import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExemploGridPane extends Application {
    @Override
    public void  start (Stage palco){
        //Criação dos elementos
        Label rotuloNome = new Label("Nome: ");
        Label rotuloEmail = new Label("Email: ");


        TextField campoNome =  new TextField();
        TextField campoEmail = new TextField();

        Button botaoEnviar = new Button("Enviar");


        //criação do grid
        GridPane grid = new GridPane();
        grid.setHgap(8); //Espaçamento Horizontal
        grid.setVgap(8); //Espaçamento Vertical
        grid.setPadding(new Insets(5)); //Espaçamento Externo

        //Adição de elementos ao grid
        grid.addRow(0 , rotuloNome, campoNome);
        grid.addRow(1, rotuloEmail, campoEmail);
        grid.addRow(2 , botaoEnviar);

        Scene cena = new Scene(grid, 400,200);
        palco.setScene(cena);
        palco.show();

    }
}
