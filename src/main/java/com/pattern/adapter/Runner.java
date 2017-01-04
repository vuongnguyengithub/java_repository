package com.pattern.adapter;

import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String...strings) {
		List<String> files = Arrays.asList("mp4","mp3","vlc","mp5");
		AudioPlayer player = new AudioPlayer();
		files.forEach(s -> player.play(s));
		
	}
}
