import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
//play.mp4



public class ExemploVideo extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void  start (Stage palco){
        String urlVideo = "file:/C:/Users/claud/workspace/ProjetoJavaFX/src/main/resources/minhas_imagens/play.mp4";

        Media media = new Media(urlVideo);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hBox = new HBox();
        hBox.getChildren().add(mediaView);

        Scene scene = new Scene(hBox,800,600);

        palco.setTitle("Exemplo");
        palco.setScene(scene);
        palco.show();
        mediaPlayer.play();
    }
}
