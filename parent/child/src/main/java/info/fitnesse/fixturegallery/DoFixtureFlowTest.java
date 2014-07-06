package info.fitnesse.fixturegallery;

import info.fitnesse.fixturegallery.domain.Player;

import java.util.List;

import fit.Fixture;
import fitlibrary.DoFixture;

public class DoFixtureFlowTest extends DoFixture{
	
	public DoFixtureFlowTest(){
		
	}
	
	public Fixture preparePlayers(){
		return new SetUpFixtureTest();
	}
	public List<Player> listPlayers(){
		return Player.players;
	}
}