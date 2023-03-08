package hw_Enum;

import java.time.Duration;
/*

Представьте, что Вы живете в Берлине и собираетесь поехать в Мюнхен.
Вам необходимо создать enum, в котором будут такие варианты передвижения как:
самолет, поезд, автомобиль, велосипед и пешком. Вам необходимо создать такой enum,
в котором в качестве конструктора задавалась бы продолжительность поездки, в зависимости от способа передвижения.
Значение будет задаваться в часах (дробное число, можно задать приближённое значение,
либо попробовать найти лучший вариант на google maps).
Помимо этого, в этом enum необходимо создать метод для получения информации о продолжительности поездки
в днях, часах, минутах и секундах (разными методами)

/
 */
public enum Transportation {
    AIRPLANE(1.5), TRAIN(6), CAR(5), BICYCLE(29), WALK(135);

    private final double durationInHours;

    Transportation(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    public double getDurationInHours() {
        return durationInHours;
    }
    public Duration getDuration() {
        long durationInSeconds = (long) (durationInHours * 3600);
        return Duration.ofSeconds(durationInSeconds);
    }

    public long getDurationInDays() {
        return getDuration().toDays();
    }

    public long getDurationInHoursRemainder() {
        return getDuration().toHoursPart();
    }

    public long getDurationInMinutesRemainder() {
        return getDuration().toMinutesPart();
    }

    public long getDurationInSecondsRemainder() {
        return getDuration().toSecondsPart();
    }

}
