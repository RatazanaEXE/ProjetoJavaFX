import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class ExemploImagens extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage palco){
        String caminhiImg = "file:/C:/Users/claud/workspace/ProjetoJavaFX/src/main/resources/minhas_imagens/DimDim.jpeg";

        Image imagem = new Image(caminhiImg);
        ImageView imageView = new ImageView(imagem);

        imageView.setFitWidth(613);
        imageView.setFitHeight(640);
        imageView.setPreserveRatio(true);

        VBox vBox = new VBox(imageView);
        Scene cena = new Scene(vBox, 700,700);

        palco.setScene(cena);
        palco.show();

    }
}
