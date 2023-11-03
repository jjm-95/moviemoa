package org.zerock.myapp.domain.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Crew {
    private Long crewInfoId;
    private Long id;
    private String name;
    @JsonProperty("profile_path")
    private String profilePath;
    private String department;
    private String job;
}
