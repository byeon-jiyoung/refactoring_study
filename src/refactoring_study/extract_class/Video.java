package refactoring_study.extract_class;

public class Video extends Media {
	/*
	public String videoData;

	public Video(String videoData) {
		this.videoData = videoData;
	}

	public String getVideoData() {
		return videoData;
	}

	public void setVideoData(String videoData) {
		this.videoData = videoData;
	}
	
	public void play() {
		System.out.printf("%s %s%n", videoData, "play");
	}
	public void loop() {
		System.out.printf("%s %s%n", videoData, "loop");
	}
	public void stop() {
		System.out.printf("%s %s%n", videoData, "stop");
	}
	*/
	
	public Video(String data) {
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