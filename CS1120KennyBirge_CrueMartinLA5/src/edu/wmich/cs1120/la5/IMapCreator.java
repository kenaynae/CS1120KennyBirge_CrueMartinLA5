package edu.wmich.cs1120.la5;

import java.io.IOException;

public interface IMapCreator {
	void scanTerrain(String fileName, int threshold) throws IOException;
<<<<<<< HEAD
	TerrainScanner getScanner();
	void setScanner(TerrainScanner scanner);
=======
	// Read from the file, set up the IArea[10][10] and set the
	//terrain for the object of TerrainScanner
	TerrainScanner getScanner();
	void setScanner(TerrainScanner scanner);
	
	
>>>>>>> branch 'master' of https://github.com/kenaynae/CS1120KennyBirge_CrueMartinLA5.git
}
