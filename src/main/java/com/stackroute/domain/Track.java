package com.stackroute.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "tracks")
@Data
public class Track {


    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ApiModelProperty(notes="Track name")
    private String trackName;
    @ApiModelProperty(notes="Give your comment on this track")
    private String trackComment;


}
