package com.pattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		System.out.println("I am playing a vlc file!");
	}
	@Override
	public void playMp4(String fileName) {
		// Do nothing
		
	}
}
