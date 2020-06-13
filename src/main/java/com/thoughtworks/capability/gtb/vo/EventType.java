package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.context.annotation.Bean;

/**
 * @author itutry
 * @create 2020-05-21_16:26
 */
public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  @JsonValue
  private String code;

  EventType(String code) {
    this.code = code;
  }
}
