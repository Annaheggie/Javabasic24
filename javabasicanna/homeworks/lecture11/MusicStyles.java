package javabasicanna.homeworks.lecture11;

public class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing Pop music...");
    }
}


class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing Rock music...");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing Classic music...");
    }
}


