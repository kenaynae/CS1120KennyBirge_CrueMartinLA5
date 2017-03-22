package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	private String analysis;
	private ArrayList<IArea> path;
	private IMapCreator mc;
	
	public IMapCreator getMapCreator() {
		return mc;
	}
	public void setMapCreator(IMapCreator mc) {
		this.mc = mc;
	}
	public ArrayList<IArea> getPath() {
		return path;
	}
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}
	public void analyzePath() {
		double radiation = 0.0;
		for (int i = 0; i<path.size()-1; i++) {
			radiation+=path.get(i).getRadiation();
		}
		analysis = radiation + "";
	}
	public String getAnalysis() {
		return analysis;
	}
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
}
