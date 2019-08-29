package refactoring_study.extract_class;

public class Music extends Media {
	/*
	public String musicData;

	public Music(String musicData) {
		this.musicData = musicData;
	}

	public String getMusicData() {
		return musicData;
	}

	public void setMusicData(String musicData) {
		this.musicData = musicData;
	}
	
	public void play() {
		System.out.printf("%s %s%n", musicData, "play");
	}
	public void loop() {
		System.out.printf("%s %s%n", musicData, "loop");
	}
	public void stop() {
		System.out.printf("%s %s%n", musicData, "stop");
	}
	*/
	public Music(String data) {
		super(data);
	}
	
	@Override
	public void play() {
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		System.out.printf("%s %s%n", data, "loop");
	}

	@Override
	public void stop() {
		System.out.printf("%s %s%n", data, "stop");
	}
}