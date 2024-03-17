package ScalerLLD.DesignPatterns.Factory.Assignment2;

public class FLACPlayer extends AudioPlayer {
    // private int volume;
    // private double playBackRate;

    public FLACPlayer(int volume, double playBackRate) {
        // this.volume = volume;
        // this.playBackRate = playBackRate;
        super(volume,playBackRate);
    }

    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing FLAC audio");
    }

    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing FLAC audio");
    }

    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping FLAC audio");
    }

    // commented as these are available in parent class
    // public int getVolume() {
    //     return volume;
    // }

    // public void setVolume(int volume) {
    //     if (volume >= 0 && volume <= 100) {
    //         this.volume = volume;
    //         System.out.println("Volume set to " + volume);
    //     } else {
    //         System.out.println("Invalid volume level");
    //     }
    // }

    // public double getPlayBackRate() {
    //     return playBackRate;
    // }

    public MediaFormat supportsType() {
        return MediaFormat.FLAC;
    }
}
