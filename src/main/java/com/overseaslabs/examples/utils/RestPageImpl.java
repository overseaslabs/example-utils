package com.overseaslabs.examples.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"pageable"})
public class RestPageImpl<T> extends PageImpl<T> {
    private int totalPages;
    private int numberOfElements;
    private boolean previousPage;
    private boolean first;
    private boolean nextPage;
    private boolean last;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public RestPageImpl(@JsonProperty("content") List<T> content,
                        @JsonProperty("number") int number,
                        @JsonProperty("size") int size,
                        @JsonProperty("totalElements") Long totalElements) {
        super(content, PageRequest.of(number, size), totalElements);
    }

    public RestPageImpl() {
        super(new ArrayList<>());
    }
}
