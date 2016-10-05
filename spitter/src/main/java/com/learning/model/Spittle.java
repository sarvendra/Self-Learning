package com.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "spittle")
public class Spittle {
  @Id
  @Column(name = "id")
  private final Long id;
  @Column(name = "message")
  private final String message;
  @Column(name = "spitterId")
  private final Long spitterId;
  @Column(name = "time")
  private final Date time;
  @Column(name = "latitude")
  private Double latitude;
  @Column(name = "longitude")
  private Double longitude;

  public Spittle(String message, long spitterId, Date time) {
    this(null, message, spitterId, time, null, null);
  }
  
  public Spittle(Long id, String message, Long spitterId, Date time, Double longitude, Double latitude) {
    this.id = id;
    this.message = message;
    this.spitterId = spitterId;
    this.time = time;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public long getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public Long getSpitterId() {
    return spitterId;
  }

  public Date getTime() {
    return time;
  }
  
  public Double getLongitude() {
    return longitude;
  }
  
  public Double getLatitude() {
    return latitude;
  }
  
//  @Override
//  public boolean equals(Object that) {
//    return EqualsBuilder.reflectionEquals(this, that, "id", "time");
//  }
//
//  @Override
//  public int hashCode() {
//    return HashCodeBuilder.reflectionHashCode(this, "id", "time");
//  }
  
}
