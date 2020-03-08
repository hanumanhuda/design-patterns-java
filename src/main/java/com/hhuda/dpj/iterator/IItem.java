package com.hhuda.dpj.iterator;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhuda.dpj.bridge.Artist;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(typeAbstract  = "I*",
        typeImmutable = "*",
        visibility = Value.Style.ImplementationVisibility.PUBLIC)
@JsonSerialize(as = Item.class)
@JsonDeserialize(as = Item.class)
public interface IItem {
    String getName();
}
