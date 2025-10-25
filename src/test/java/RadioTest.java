
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetCurrentRadioStationWithParam() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetRadioStationAboveMaxParam() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(55);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(12);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMinParam() {
        Radio radio = new Radio(40);
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(-1);
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
    public void shouldSetCurrentRadioStation29Param() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(29);

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation30Param() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(30);

        int expected = 30;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStation31Param() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(31);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation0Param() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1Param() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationBelow0Param() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentRadioStation8() {
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
    public void shouldNotSetCurrentRadioStation10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(10);

        int expected = 5;
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
    public void shouldNotSetCurrentRadioStationBelow0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFrom29Param() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(29);
        radio.switchRadioStationNext();

        int expected = 30;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFromTheMaxParam() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(30);
        radio.switchRadioStationNext();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFrom1RunParam() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationNext();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFrom0Param() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(0);
        radio.switchRadioStationNext();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevParam() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationPrev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevFromTheMinParam() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(0);
        radio.switchRadioStationPrev();

        int expected = 30;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevFrom29Param() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(29);
        radio.switchRadioStationPrev();

        int expected = 28;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevFrom30Param() {
        Radio radio = new Radio(31);
        radio.setCurrentRadioStation(30);
        radio.switchRadioStationPrev();

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFrom8() {
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
    public void shouldSwitchCurrentRadioStationNextFrom1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationNext();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationNextFrom0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchRadioStationNext();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchRadioStationPrev();

        int expected = 0;
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

    @Test
    public void shouldSwitchCurrentRadioStationPrevFrom9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.switchRadioStationPrev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchCurrentRadioStationPrevFrom8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchRadioStationPrev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // volume tests

    @Test
    public void shouldSetCurrentVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-20);

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
    public void shouldSetCurrentVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

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
    public void shouldSetCurrentVolume99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolume101() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1001);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1FromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseCurrentVolumeBy1();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1From1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseCurrentVolumeBy1();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolumeBy1From99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseCurrentVolumeBy1();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeBy1From100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolumeBy1();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceCurrentVolumeBy1FromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceCurrentVolumeBy1();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentVolumeBy1FromThe1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceCurrentVolumeBy1();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentVolumeBy1From100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceCurrentVolumeBy1();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentVolumeBy1From99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reduceCurrentVolumeBy1();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


