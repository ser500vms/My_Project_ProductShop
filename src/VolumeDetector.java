public class VolumeDetector {
    public int volumeDetectorID;
    public boolean volumeSignal;
    public double volume;

    public int getVolumeDetectorID() {
        return volumeDetectorID;
    }

    public void setVolumeDetectorID(int volumeDetectorID) {
        this.volumeDetectorID = volumeDetectorID;
    }

    public boolean isVolumeSignal() {
        return volumeSignal;
    }

    public void setVolumeSignal(boolean volumeSignal) {
        this.volumeSignal = volumeSignal;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public VolumeDetector(int volumeDetectorID) {
        this.volumeDetectorID = volumeDetectorID;
    }
}
