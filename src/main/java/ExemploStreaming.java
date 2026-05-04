import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ExemploStreaming extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage palco){
        WebView webView = new WebView();
        String urlVideo;
        urlVideo = "https://www.youtube.com/watch?v=Hb7y6YSkn10";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800,800);

        palco.setTitle("Exemplo");
        palco.setScene(cena);
        palco.show();
    }
}
