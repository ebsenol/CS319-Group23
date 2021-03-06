import java.util.ArrayList;

public class WaveManager {

	private int currentWave;

	private static WaveManager manager = new WaveManager( );
	protected ArrayList<Wave> waves = new ArrayList<Wave>();

	private WaveManager() {
		currentWave = 1;
	}

	public static WaveManager getInstance( ) {
		return manager;
	}

	public Wave createWave(int diff) {
		//TODO get difficulty from game engine
		Wave created = new Wave(currentWave, diff);
		currentWave++;
		waves.add(created);
		return created;
	}
	public ArrayList<Wave> getWaves(){
		return waves;
	}

	public int getCurrentWave() {
		return currentWave;
	}
}