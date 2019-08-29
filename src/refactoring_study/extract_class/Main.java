package refactoring_study.extract_class;

public class Main {
	
	public static void main(String[] args) {
		Book refactoring= new Book(
			"Refactoring: improving the desginof existing code",
			"ISBN0201485672",
			"$4495",
			"Martin Fowler",
			"fowler@acm.org");
		System.out.println(refactoring.toXml());
		
		Media music= new Music("좋니");
		Media video= new Video("효리네민박");
		
		Player musicPlayer= new Player();
		//musicPlayer.setCurrentMedia(true);
		musicPlayer.setMedia(music);
		
		Player videoPlayer= new Player();
		//videoPlayer.setCurrentMedia(false);
		videoPlayer.setMedia(video);
		
		play(musicPlayer);
		play(videoPlayer);
	}

	private static void play(Player player) {
		player.play();
		player.loop();
		player.stop();
	}

}
