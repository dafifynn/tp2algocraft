package vista;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class RepetidorAudio {

    public RepetidorAudio(Media audio) {

        MediaPlayer reproductor = new MediaPlayer(audio);
        reproductor.setOnEndOfMedia(new Runnable() {
            public void run() {
                reproductor.seek(Duration.ZERO);
            }
        });
        reproductor.play();
    }
}
