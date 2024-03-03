// Subsistema 1: Reproductor de Audio
class AudioPlayer {
    public void playAudio(String audioFile) {
        System.out.println("Reproduciendo audio: " + audioFile);
    }
}

// Subsistema 2: Reproductor de Video
class VideoPlayer {
    public void playVideo(String videoFile) {
        System.out.println("Reproduciendo video: " + videoFile);
    }
}

// Subsistema 3: Control de Volumen
class VolumeControl {
    public void adjustVolume(int volumeLevel) {
        System.out.println("Ajustando volumen a: " + volumeLevel);
    }
}

// Facade: Interfaz única para el cliente
class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private VolumeControl volumeControl;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.volumeControl = new VolumeControl();
    }

    // Métodos simplificados para el cliente
    public void reproducir(String multimediaType, String fileName) {
        if (multimediaType.equalsIgnoreCase("audio")) {
            audioPlayer.playAudio(fileName);
        } else if (multimediaType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Tipo de multimedia no compatible");
        }
    }

    public void ajustarVolumen(int nivel) {
        volumeControl.adjustVolume(nivel);
    }
}

// Cliente: Utiliza la fachada para interactuar con el sistema multimedia
class ClienteMultimedia {
    public static void main(String[] args) {
        // Usando la fachada para reproducir audio y ajustar el volumen
        MultimediaFacade multimediaFacade = new MultimediaFacade();

        multimediaFacade.reproducir("audio", "cancion.mp3");
        multimediaFacade.reproducir("video", "pelicula.mp4");

        multimediaFacade.ajustarVolumen(70);
    }
}
