package edu.wmich.cs1120.la5;

import java.io.IOException;

public interface IMapCreator {
	void scanTerrain(String fileName, int threshold) throws IOException;
	public TerrainScanner getScanner();
	public void setScanner(TerrainScanner scanner);
	
}
