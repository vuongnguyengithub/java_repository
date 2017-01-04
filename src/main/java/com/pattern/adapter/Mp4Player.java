package com.pattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
	@Override
	public void playMp4(String fileName) {
		System.out.println("I am playing an mp4 file!");
		
	}
	@Override
	public void playVlc(String fileName) {
		//do nothing
	}
}
