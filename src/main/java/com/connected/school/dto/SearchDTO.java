package com.connected.school.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author KHTIFOU SAAD
 */
public class SearchDTO  {
    
    private String searchTerm;

    public SearchDTO() {

    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
