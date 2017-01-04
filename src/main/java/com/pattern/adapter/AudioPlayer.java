package com.pattern.adapter;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter adapter;
	
	@Override
	public void play(String fileName) {
		
		if(fileName.contains("mp3")) {
			System.out.println("I am playing mp3 files");
		} else if(fileName.contains("mp4")) {
			adapter = new MediaAdapter(fileName);
			adapter.play(fileName);
		} else if(fileName.contains("vlc")) {
			adapter = new MediaAdapter(fileName);
			adapter.play(fileName);
		} else {
			throw new RuntimeException("Unsupport media type!");
		}
	}
}
