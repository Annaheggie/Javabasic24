package javabasicanna.homeworks.lecture11;

public class MusicStylesMain {
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