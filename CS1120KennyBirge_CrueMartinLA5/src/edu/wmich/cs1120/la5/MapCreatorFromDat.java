package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MapCreatorFromDat implements IMapCreator {
	private TerrainScanner terrain = new TerrainScanner();
	private Area[][] area;

	/**
	 * This method takes the input file and sets the Area[][] with the corresponding Areas with correct elevation, radiation, and energy
	 * 
	 * @param fileName the name of the file we are reading from
	 * @param threshold the threshold for what is a passable area
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		terrain = new TerrainScanner();
		this.area = new Area[10][10];
		IExpression exp;
		double rad, elevation, cost;
		int int1, int2, location = 0, i = 0, j = 0;
		char op;
		RandomAccessFile file = new RandomAccessFile(fileName, "r");
		do {
			file.seek((long)location*34);
			cost = file.readDouble();
			elevation = file.readDouble();
			rad = file.readDouble();
			op = file.readChar();
			int1 = file.readInt();
			int2 = file.readInt();
			exp = ExpressionFactory.getExpression(op, int1, int2);
			location = exp.getValue();
			if(rad>=0.5 || (rad< 0.5 && elevation > (threshold *.5))){
				area[i][j]= new HighArea();
				
				area[i][j].setBasicEnergyCost(cost);
				area[i][j].setElevation(elevation);
				area[i][j].setRadiation(rad);
			}
			
			else{
				
				area[i][j]= new LowArea();
				
				area[i][j].setBasicEnergyCost(cost);
				area[i][j].setElevation(elevation);
				area[i][j].setRadiation(rad);
			}
			j++;
			j = j%10;
			if (j == 0)
				i++;
		} while (location != -1);
		file.close();
		terrain.setTerrain(area);
	}

	/**
	 * This is the getter for the terrain field
	 * 
	 * @return terrain this is the TerrainScanner object used in the scanTerrain method
	 */
	public TerrainScanner getScanner() {
		return terrain;
	}

	/**
	 * This is the setter for the terrain field
	 * 
	 * @return terrain this is the TerrainScanner object used in the scanTerrain method
	 */
	public void setScanner(TerrainScanner scanner) {
		terrain = scanner;
	}
	
}
