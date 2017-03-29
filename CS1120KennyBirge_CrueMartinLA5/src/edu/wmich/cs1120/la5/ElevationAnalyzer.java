package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover{
	
	private ArrayList<IArea> path;
	private String analysis;

	
	/**
	 * This is the getter for the path field
	 * 
	 * @return path this is the path that the rover will take
	 */
	public ArrayList<IArea> getPath(){
		return path;
	}
	
	/**
	 * This is the setter for the path field
	 * 
	 * @param path this is the path that the rover will take
	 */
	public void setPath(ArrayList<IArea> path){
		this.path= path;
	}
	
	/**
	 * This method finds the average elevation in the path and sets the analysis field
	 */
	public void analyzePath(){
		double elevation =0.0;
		for(int i=0; i<path.size();i++){
			elevation +=path.get(i).getElevation();
			
		}
		double avgEl= elevation/path.size();
		this.analysis=""+ avgEl;
	}
	
	/**
	 * This is the getter for the analysis field
	 * 
	 * @return analysis this is the value of the average elevation in the entire path
	 */
	public String getAnalysis(){
		return analysis;
	}
	
	/**
	 * This is the setter for the analysis field
	 * 
	 * @param analysis this is the value of the average elevation in the entire path
	 */
	public void setAnalysis(String analysis){
		this.analysis = analysis;
		
	}
	public String toString(){
		return this.analysis;
	}
}
