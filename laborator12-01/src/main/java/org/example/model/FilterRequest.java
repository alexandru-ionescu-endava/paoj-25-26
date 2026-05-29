package org.example.model;

import java.util.Map;

public class FilterRequest {
    private Map<String, String> filters;

    public Map<String, String> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, String> filters) {
        this.filters = filters;
    }
}
