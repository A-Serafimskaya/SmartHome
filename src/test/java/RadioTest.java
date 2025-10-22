
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
    public void shouldSetCurrentRadioStation9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
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
        radio.setCurrentRadioStation(-1);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchRadioStationNext(8);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFromTheMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.switchRadioStationNext(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchCurrentRadioStationNextFrom10() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.switchRadioStationNext(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationPrev(1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevFromTheMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchRadioStationPrev(0);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchCurrentRadioStationPrevBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.switchRadioStationPrev(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // volume tests

    @Test
    public void shouldSetCurrentVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
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
    public void shouldSetCurrentVolume99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
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
    public void shouldSetCurrentVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1FromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseCurrentVolumeBy1(0);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1From1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseCurrentVolumeBy1(1);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseCurrentVolumeBy1(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1From99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseCurrentVolumeBy1(99);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeBy1From100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolumeBy1(100);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1From101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseCurrentVolumeBy1(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceCurrentVolumeBy1FromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceCurrentVolumeBy1(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentVolumeBy1FromThe1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceCurrentVolumeBy1(1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotReduceCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceCurrentVolumeBy1(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentVolumeBy1From100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceCurrentVolumeBy1(100);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceCurrentVolumeBy1From101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.reduceCurrentVolumeBy1(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceCurrentVolumeBy1From99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reduceCurrentVolumeBy1(99);

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

