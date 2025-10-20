
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


// RadioStation tests

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationBelow0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationAbove9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(10);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(-2);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchRadioStationNext();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFromTheMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.switchRadioStationNext();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.switchRadioStationPrev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevFromTheMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchRadioStationPrev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // volume tests

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAbove100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeBelow0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(23);
        radio.increaseCurrentVolumeBy1();

        int expected = 24;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentVolumeBy1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(39);
        radio.reduceCurrentVolumeBy1();

        int expected = 38;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeBy1FromTheMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolumeBy1();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceCurrentVolumeBy1FromTheMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceCurrentVolumeBy1();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

