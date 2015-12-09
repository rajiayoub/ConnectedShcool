package com.connected.ui.tags.page;

import com.connected.ui.tags.ComponentTag;
import com.connected.ui.tags.utils.Constants;

public class Panel extends ComponentTag {

	private static final long serialVersionUID = 1L;

	@Override
	protected String cssClass() {
		return "hpanel " + getCss();
	}

	@Override
	protected String componentCorp() {
		StringBuilder builder = new StringBuilder();
		builder.append(createHtmlElement(Constants.ELEMENT_DIV,
				"panel-heading", null));
		if (this.getTitle() != null) {
			builder.append(this.getTitle());
		}else {
			builder.append(Constants.SPACE);

		}
		return builder.toString();
	}

	@Override
	protected String componentEnd() {
		StringBuilder builder = new StringBuilder();
		builder.append(Constants.END_DIV);
		builder.append(Constants.END_DIV);
		return builder.toString();
	}

}
