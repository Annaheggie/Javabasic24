package javabasicanna.homeworks.lecture11;

public class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

// PopMusic class inheriting from MusicStyles
class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing Pop music...");
    }
}

// RockMusic class inheriting from MusicStyles
class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing Rock music...");
    }
}

// ClassicMusic class inheriting from MusicStyles
class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing Classic music...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MusicStyles popMusic = new PopMusic();
        MusicStyles rockMusic = new RockMusic();
        MusicStyles classicMusic = new ClassicMusic();

        MusicStyles[] musicStyles = {popMusic, rockMusic, classicMusic};

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
