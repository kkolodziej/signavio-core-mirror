package pl.net.bluesoft.rnd.processtool.editor.jpdl.object;

import org.json.JSONException;
import org.json.JSONObject;

public class JPDLDecision extends JPDLComponent {

	
    protected JPDLDecision() {
    	
	}
	
    @Override
	public void fillBasicProperties(JSONObject json) throws JSONException {
		super.fillBasicProperties(json);
	}
    
    
    @Override
	public String toXML() { 
    	StringBuffer sb = new StringBuffer();
    	sb.append(String.format("<decision name=\"%s\" g=\"%d,%d,%d,%d\">\n", name,x1,y1,x2-x1,y2-y1));
		sb.append(getTransitionsXML());
		sb.append("</decision>");
		return sb.toString();
    }


	@Override
	public String getObjectName() {
		return "Decision";
	}
	
}
