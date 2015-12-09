package com.connected.ui.tags.page;

import com.connected.ui.tags.ComponentTag;
import com.connected.ui.tags.utils.Constants;

public class Action extends ComponentTag {

	
	private static final long serialVersionUID = 1L;
	private String type = "default";
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	protected String elementType() {
		return Constants.ELEMENT_LINK;
	}
	

	@Override
	protected String cssClass() {
		StringBuilder builder = new StringBuilder("ajaxlink btn btn-");
		builder.append(type);
		builder.append(Constants.SPACE).append("btn-xs");
		return builder.toString();
	}
	@Override
	protected String componentCorp() {
		StringBuilder builder = new StringBuilder("<i class=\"fa ");
		builder.append(this.getIcon()).append("\"> </i> ");
		builder.append(this.getLabel());
		return builder.toString();
	}
	@Override
	protected String componentEnd() {
		return Constants.END_LINK;
	}
	
}
