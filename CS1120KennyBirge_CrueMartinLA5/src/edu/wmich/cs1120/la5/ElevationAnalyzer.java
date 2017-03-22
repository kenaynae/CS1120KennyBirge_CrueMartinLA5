package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover{
	
	private ArrayList<IArea> path;
	private String analysis;

	
	
	public ArrayList<IArea> getPath(){
		return path;
	}
	
	public void setPath(ArrayList<IArea> path){
		this.path= path;
	}
	
	public void analyzePath(){
		double elevation =0.0;
		for(int i=0; i<path.size();i++){
			elevation +=path.get(i).getElevation();
			
		}
		double avgEl= elevation/path.size();
		this.analysis=""+ avgEl;
	}
	
	public String getAnalysis(){
		return analysis;
	}
	
	public void setAnalysis(String analysis){
		this.analysis = analysis;
		
	}
	public String toString(){
		return this.analysis;
	}
}
