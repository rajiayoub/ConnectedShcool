package com.connected.ui.tags;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import com.connected.ui.tags.utils.Constants;

public class ComponentTag extends BodyTagSupport {

	private String id;
	private String css = "";
	private String title;
	private String icon;
	private String label;
	private String href;
	
	
	
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	private String columnWidth;

	public String getColumnWidth() {
		return columnWidth;
	}

	public void setColumnWidth(String columnWidth) {
		this.columnWidth = columnWidth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	private static final long serialVersionUID = 1L;
	private Map<String, Object> tagAttrs = new HashMap<String, Object>();

	public Map<String, Object> getTagAttrs() {
		return tagAttrs;
	}

	public void setTagAttrs(Map<String, Object> tagAttrs) {
		this.tagAttrs = tagAttrs;
	}

	public void setDynamicAttribute(String uri, String name, Object value) {
		tagAttrs.put(name, value);
	}

	protected String cssClass() {
		return null;
	}

	protected String elementType() {
		return Constants.ELEMENT_DIV;
	}

	protected String componentCorp() {
		return null;
	}

	protected String componentEnd() {
		return null;
	}

	public String createHtmlElement(String element, String cssClass,
			String colWidth) {
		StringBuffer htmlEl = new StringBuffer();
		htmlEl.append(Constants.START_TAG).append(elementType())
				.append(Constants.SPACE);
		if (cssClass != null) {
			htmlEl.append(Constants.ATTRIBUTE_CLASS).append(Constants.EQUELS)
					.append(Constants.VAR);
			htmlEl.append(cssClass);
			if (colWidth != null) {
				htmlEl.append(Constants.SPACE).append("col-lg-")
						.append(colWidth);
			}
			htmlEl.append(Constants.VAR);
		}
		if (href != null) {
			htmlEl.append(Constants.ATTRIBUTE_HREF).append(Constants.EQUELS)
					.append(Constants.VAR);
			htmlEl.append(href);
			htmlEl.append(Constants.VAR);
		}
		htmlEl.append(Constants.END_TAG);

		return htmlEl.toString();
	}

	@Override
	public int doStartTag() throws JspException {
		StringBuffer cmpHTML = new StringBuffer();
		cmpHTML.append(createHtmlElement(elementType(), cssClass(),
				this.columnWidth));
		if (componentCorp() != null) {
			cmpHTML.append(componentCorp());
		}
		try {
			pageContext.getOut().append(cmpHTML.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			if (componentEnd() != null){
				pageContext.getOut().append(componentEnd());				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

}
