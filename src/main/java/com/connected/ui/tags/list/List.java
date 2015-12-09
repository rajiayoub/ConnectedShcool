package com.connected.ui.tags.list;

import com.connected.ui.tags.ComponentTag;
import com.connected.ui.tags.utils.Constants;


public class List extends ComponentTag {


	private static final long serialVersionUID = 1L;

	@Override
	protected String cssClass() {
		return "todo-list ui-sortable";
	}
	
	@Override
	protected String elementType() {
		return Constants.ELEMENT_UL;
	}
	@Override
	protected String componentEnd() {
		return Constants.END_UL;
	}
	
}
