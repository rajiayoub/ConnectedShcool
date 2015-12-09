package com.connected.ui.tags.page;

import com.connected.ui.tags.ComponentTag;
import com.connected.ui.tags.utils.Constants;

public class Actions extends ComponentTag {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String cssClass() {
		return "panel-tools pull-right";
	}
	
	@Override
	protected String componentEnd() {
		StringBuilder builder = new StringBuilder();
		builder.append(Constants.END_DIV);
		builder.append(Constants.END_DIV);
		return builder.toString();
	}
}
