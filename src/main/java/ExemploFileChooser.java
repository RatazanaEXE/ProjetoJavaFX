import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class ExemploFileChooser extends Application {
    @Override
    public void start(Stage palco)  {
        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo");

        Button botaoAbrir = new Button("Abrir arquivo");

        botaoAbrir.setOnAction (e-> {
            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);
            if(arquivoSelecionado != null){
                exibirImagem(arquivoSelecionado,palco);
            }
        });

        VBox layout = new VBox(botaoAbrir);
        Scene cena = new Scene(layout, 800, 800);
        palco.setTitle("Testando fileChooser");
        palco.setScene(cena);
        palco.show();

    }
    private void exibirImagem (File arquivo, Stage palcoDoArquivoSelecionado ){
        Image image = new Image(arquivo.toURI().toString());
        ImageView imageView = new ImageView(image);

        VBox layout;

        layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();

        layout.getChildren().add(imageView);

        imageView.setFitWidth(500);
        imageView.setFitHeight(500);

        palcoDoArquivoSelecionado.setTitle("seletor");

    }

    public static void main(String[] args) {
        launch(args);
    }
}

