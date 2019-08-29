package refactoring_study.extract_class;

public class Player { //ppt95p
	/*
	private boolean isMusic;
	private Music music = new Music("좋니");
	private Video video = new Video("효리네민박");

	public void setCurrentMedia(boolean isMusic) {
		this.isMusic= isMusic;
	}
	
	public void play() {
		if(isMusic) {
			playMusic();
		}else{
			playVideo();
	}
	}
	public void loop() {
		if(isMusic) {
			loopMusic();
		}else{
			loopVideo();
		}
	}
	public void stop() {
		if(isMusic) {
			stopMusic();
		}else{
			stopVideo();
		}
	}
	
	private void playMusic() {
		music.play();
	}
	private void loopMusic() {
		music.loop();
	}
	private void stopMusic() {
		music.stop();
	}
	private void playVideo() {
		video.play();
	}
	private void loopVideo() {
		video.loop();
	}
	private void stopVideo() {
		video.stop();
	}
	*/
	
	private Media media;
	
	public void setMedia(Media media) {
		this.media= media;
	}
	
	public void play() {
		media.play();
	}
	public void loop() {
		media.loop();
	}
	public void stop() {
		media.stop();
	}
}

