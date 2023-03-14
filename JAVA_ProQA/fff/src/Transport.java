public enum Transport {
    AIRPLANE(1.0),
    TRAIN(6.0),
    CAR(6.5),
    BICYCLE(44.0),
    WALKING(147.0);

    private final double duration;

    Transport(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public String getDurationInDays() {
        double days = duration / 24;
        double hours = duration % 24;
        double minutes = (duration * 60) % 60;
        double seconds = (duration * 60 * 60) % 60;
        return String.format("%d days, %d hours, %d minutes, %d seconds", (int)days, (int)hours, (int)minutes, (int)seconds);
    }

    public String getDurationInHours() {
        double hours = duration;
        double minutes = (duration * 60) % 60;
        double seconds = (duration * 60 * 60) % 60;
        return String.format("%d hours, %d minutes, %d seconds", (int)hours, (int)minutes, (int)seconds);
    }

    public String getDurationInMinutes() {
        double minutes = duration * 60;
        double seconds = (duration * 60 * 60) % 60;
        return String.format("%d minutes, %d seconds", (int)minutes, (int)seconds);
    }

    public String getDurationInSeconds() {
        double seconds = duration * 60 * 60;
        return String.format("%d seconds", (int)seconds);
    }

}
