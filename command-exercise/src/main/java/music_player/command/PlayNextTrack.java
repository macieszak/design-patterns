package music_player.command;

import music_player.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }

}
