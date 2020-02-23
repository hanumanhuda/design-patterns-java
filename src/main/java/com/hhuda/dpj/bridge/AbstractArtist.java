package com.hhuda.dpj.bridge;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeAbstract  = "Abstract*",
        typeImmutable = "*",
        visibility = Value.Style.ImplementationVisibility.PUBLIC)
@JsonSerialize(as = Artist.class)
@JsonDeserialize(as = Artist.class)
public interface AbstractArtist {
     String getFname();
     String getLname();
     String getUrl();
}
