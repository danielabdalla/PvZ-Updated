import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
	
	private Game game;
	private ArrayList<Zombie> zombies;
	private ArrayList<Plant> plants;
	private Zombie zombie;
	private Plant plant;
	private int sunPoints = 100;
	private int time = 0;
	private Stats stats;
	private int x = 10;
	private int y = 20;
	
	@Before
	public void setUp() throws Exception {
		game = new Game();
		zombies = new ArrayList<Zombie>();
		plants = new ArrayList<Plant>();
		zombie = new Zombie(stats, time);
		plant = new Plant(x, y);
		zombies.add(zombie);
		plants.add(plant);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestZombieAddition(){
		assertEquals("Adding zombie", 1, zombies.size());
	}
	
	@Test
	public void TestPlantAddition(){
		assertEquals("Adding plant", 1, plants.size());
	}
	
	@Test
	public void TestSunPointsValue(){
		assertEquals("Testing sun points value", 100, game.getSunPoints());
	}
	
	@Test
	public void TestIfGameIsFinished(){
		assertFalse("Testing if game is finished", game.isGameFinished());
	}
	
	@Test
	public void TestingTime(){
		assertEquals("Testing time value", 0, game.getTime());
	}
	
	@Test
	public void TestPlantCoordinateX(){
		assertEquals("Testing plant's coordinates", 10, plant.getX());
	}
	
	@Test
	public void TestPlantCoordinateY(){
		assertEquals("Testing plant's coordinates", 20, plant.getY());
	}
	
}
