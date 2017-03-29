package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	private String analysis;
	private ArrayList<IArea> path;
	private IMapCreator mc;
	
	/**
	 * This is the getter for the mc field
	 * 
	 * @return mc the IMapCreator we are accessing
	 */
	public IMapCreator getMapCreator() {
		return mc;
	}
	
	/**
	 * This is the setter for the mc field
	 * 
	 * @param mc the IMapCreator we are setting
	 */
	public void setMapCreator(IMapCreator mc) {
		this.mc = mc;
	}
	
	/**
	 * This is the getter for the path field
	 * 
	 * @return path this is the path that the rover will take
	 */
	public ArrayList<IArea> getPath() {
		return path;
	}
	
	/**
	 * This is the setter for the path field
	 * 
	 * @param path this is the path that the rover will take
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}
	
	/**
	 * This method finds the radiation in the path and sets the analysis field
	 */
	public void analyzePath() {
		double radiation = 0.0;
		for (int i = 0; i<path.size()-1; i++) {
			radiation+=path.get(i).getRadiation();
		}
		analysis = radiation + "";
	}
	
	/**
	 * This is the getter for the analysis field
	 * 
	 * @return analysis this is the value of the radiation in the entire path
	 */
	public String getAnalysis() {
		return analysis;
	}
	
	/**
	 * This is the setter for the analysis field
	 * 
	 * @param analysis this is the value of the radiation in the entire path
	 */
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
}
