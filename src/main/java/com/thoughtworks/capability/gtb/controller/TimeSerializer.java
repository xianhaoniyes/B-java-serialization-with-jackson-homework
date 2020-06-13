package com.thoughtworks.capability.gtb.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeSerializer extends StdSerializer<LocalDateTime> {

    protected TimeSerializer(){super(LocalDateTime.class);}


    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(value.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli());
    }
}
