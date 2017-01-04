package com.pattern.adapter;

public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String fileName) {
		if(fileName.toLowerCase().contains("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		} else if(fileName.toLowerCase().contains("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		}
	}
	
	@Override
	public void play(String fileName) {
		if(fileName.contains("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		} else if(fileName.contains("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		}
		
	}
}
