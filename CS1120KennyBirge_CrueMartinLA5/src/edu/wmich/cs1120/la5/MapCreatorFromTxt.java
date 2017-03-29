package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import edu.wmich.cs1120.la5.TerrainScanner;
public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner terrain = new TerrainScanner();
	private Area[][] area;
	
	/**
	 * This method takes the input file and sets the Area[][] with the corresponding Areas with correct elevation, radiation, and energy
	 * 
	 * @param fileName the name of the file we are reading from
	 * @param threshold the threshold for what is a passable area
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		this.area= new Area[10][10];
		File  file = new File(fileName);
		Scanner infile =  new Scanner(file);
		String temp;
		String[] feild = new String[3];
		
		
		while(infile.hasNext()){
			for(int i=0; i<10; i++){
				for(int j=0; j<10;j++){
					
						temp = infile.nextLine();
						feild = temp.split(" ");
						double cost =Double.parseDouble(feild[0]);
						double elev =Double.parseDouble(feild[1]);
						double rad = Double.parseDouble(feild[2]);
						
					
						
						if(rad>=0.5 || (rad< 0.5 && elev > (threshold *.5))){
							area[i][j]= new HighArea();
							
							area[i][j].setBasicEnergyCost(cost);
							area[i][j].setElevation(elev);
							area[i][j].setRadiation(rad);
						}
						
						else{
							
							area[i][j]= new LowArea();
							
							area[i][j].setBasicEnergyCost(cost);
							area[i][j].setElevation(elev);
							area[i][j].setRadiation(rad);
						}
							
						
					}
				}
			}
			infile.close();
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
		terrain =scanner;
		
	}


}
