package com.builtbroken.builder.mapper.mappers;

import com.builtbroken.builder.converter.ConversionHandler;
import com.builtbroken.builder.converter.JsonConverter;
import com.google.gson.JsonElement;

/**
 * Created by Dark(DarkGuardsman, Robert) on 2019-03-11.
 */
public interface IJsonMapper<O extends Object>
{

    void map(O object, JsonElement data, ConversionHandler converter);

    /**
     * Checks if the mapper has
     * valid data for the field or
     * method it set.
     *
     * @return
     */
    boolean isValid(O object);

    String[] getKeys();
}