package com.example.demo;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String from;

    private String to;

    private String body;

    private boolean deliveryStatus;

    private LocalDateTime dateTime;

    public User(Long id, String from, String to, String body, boolean deliveryStatus, LocalDateTime dateTime) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.body = body;
        this.deliveryStatus = deliveryStatus;
        this.dateTime = dateTime;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
