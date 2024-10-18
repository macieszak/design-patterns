package music_player.command;

import music_player.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play() {
        musicPlayer.playFirstTrack();
    }

}
