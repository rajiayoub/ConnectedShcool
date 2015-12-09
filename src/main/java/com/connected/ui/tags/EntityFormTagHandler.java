package com.connected.ui.tags;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.springframework.util.StringUtils;

import com.connected.ui.tags.utils.Utils;
import com.connected.ui.tags.utils.annotations.DetailsField;
import com.connected.ui.tags.utils.annotations.FormField;
import com.connected.ui.tags.utils.annotations.FormWidgetType;

/**
 *
 * @author lroman
 */
public class EntityFormTagHandler extends SimpleTagSupport {

    private String className;

    private String formModel = "form";

    /**
     * Called by the container to invoke this tag. The implementation of this method is provided by the tag library developer, and
     * handles all tag processing, body iteration, etc.
     *
     * @throws javax.servlet.jsp.JspException
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        Class<?> filterClass;
        try {
            filterClass = Class.forName(className);
        } catch (ClassNotFoundException ex) {
            throw new JspException("Error in FormFilterTag tag", ex);
        }

        Field[] fields = filterClass.getDeclaredFields();

        List<FormField> sortedAnnotations = new ArrayList<FormField>();

        for (Field field : fields) {
            FormField formFieldAnnotation = field.getAnnotation(FormField.class);
            if (formFieldAnnotation != null) {

                if (Utils.isEmpty(formFieldAnnotation.name())) {
                    formFieldAnnotation = new FormFieldDTO(
                            formFieldAnnotation.order(),
                            field.getName(), formFieldAnnotation.label(), formFieldAnnotation.type(),
                            formFieldAnnotation.cssClasses(),
                            formFieldAnnotation.attributes(),
                            formFieldAnnotation.optionsExpression());
                }

                sortedAnnotations.add(formFieldAnnotation);

            }
        }

        Collections.sort(sortedAnnotations, new Comparator<FormField>() {

            @Override
            public int compare(FormField o1, FormField o2) {
                return o1.order() - o2.order();
            }
        });

        StringBuilder builder = new StringBuilder();
        builder.append("<form class=\"ajaxLink\" ");
        builder.append(" id=\"").append(formModel).append("\" ");
        builder.append(" name=\"").append(formModel).append("\" ");
        builder.append(">");
        builder.append("<div class=\"box-body\">");
        for (FormField fieldViewAnnotation : sortedAnnotations) {
            builder.append(createFormField(formModel, fieldViewAnnotation));
        }
        builder.append("</div>");        
        builder.append("</form>");

        try {
            out.write(builder.toString());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setModel(String model) {
        this.formModel = model;
    }

    private Object createFormField(String baseModel, FormField formFieldAnnotation) {

        List<String> attributes = createAttributes(baseModel, formFieldAnnotation);

        String elementHTML = String.format("<%s %s></%s>",
                formFieldAnnotation.type().getDomElement(),
                StringUtils.collectionToDelimitedString(attributes, " "),
                // If we are using a directive with a custom template we cannot add data-validate to the element, as it won't work.
                formFieldAnnotation.type().getDomElement());

        if (!StringUtils.isEmpty(formFieldAnnotation.type().getWrapper())) {
            elementHTML = String.format(formFieldAnnotation.type().getWrapper(), elementHTML);
        }

        String rowHTML = String.format(
                "<div class=\"form-group\" id=\"div-field-%s\">"
                + "<label for=\"%s\" id=\"label-%s\">%s</label>"
                + "%s</div>",
                formFieldAnnotation.name(),
                formFieldAnnotation.name(),
                formFieldAnnotation.name(),
                formFieldAnnotation.label(),
                elementHTML);
               // createErrorsRepeater(formFieldAnnotation.name()));

        return rowHTML;
    }

    private List<String> createAttributes(String baseModel, FormField formFieldAnnotation) {
        List<String> attributes = new ArrayList<String>();

        String[] fixedAttributes = formFieldAnnotation.type().getAttributes();
        if (fixedAttributes != null) {
            attributes.addAll(Arrays.asList(fixedAttributes));
        }

        String[] customAttributes = formFieldAnnotation.attributes();
        if (customAttributes != null) {
            attributes.addAll(Arrays.asList(customAttributes));
        }

        if (formFieldAnnotation.type().isUsingOptionsModel()) {
            String optionsModelAttribute = "options";
            if (!StringUtils.isEmpty(formFieldAnnotation.optionsExpression())) {
                optionsModelAttribute = formFieldAnnotation.optionsExpression();
            }

            attributes.add(String.format("data-ng-options=\"%s\"", optionsModelAttribute));
        }

        attributes.add(String.format("name=\"%s\"", formFieldAnnotation.name()));

        attributes.add(String.format("class=\"%s %s\"", formFieldAnnotation.type().getCssClasses(), formFieldAnnotation.cssClasses()));

        return attributes;
    }

    private String createErrorsRepeater(String scopeName) {
        return String.format(
                "<ul class=\"help-block\"data-ng-show=\"errors.%s.length\">"
                + "<li data-ng-repeat=\"error in errors.%s\">{{error}}</li>"
                + "</ul>", scopeName, scopeName);
    }

    /**
     * Auxiliary class to hold data from the FormField annotation and be able to handle it normally so we can sort fields etc.
     */
    private class FormFieldDTO implements FormField {

        private final String label;
        private final String name;
        private final int order;
        private final FormWidgetType type;
        private final String cssClasses;
        private final String[] attributes;
        private final String optionsExpression;

        public FormFieldDTO(
                int order, String name, String label, FormWidgetType type,
                String cssClasses, String[] attributes, String optionsScopeName) {

            this.order = order;
            this.name = name;
            this.label = label;
            this.type = type;
            this.cssClasses = cssClasses;
            this.attributes = attributes;
            this.optionsExpression = optionsScopeName;
        }

        /**
         * @return the label
         */
        @Override
        public String label() {
            return label;
        }

        /**
         * @return the scopeName
         */
        @Override
        public String name() {
            return name;
        }

        /**
         * @return the order
         */
        @Override
        public int order() {
            return order;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return DetailsField.class;
        }

        @Override
        public FormWidgetType type() {
            return type;
        }

        @Override
        public String cssClasses() {
            return cssClasses;
        }

        @Override
        public String[] attributes() {
            return attributes;
        }

        /**
         * @return the optionsExpression
         */
        @Override
        public String optionsExpression() {
            return optionsExpression;
        }

    }
}
