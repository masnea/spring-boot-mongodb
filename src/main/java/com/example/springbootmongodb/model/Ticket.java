package com.example.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {

    @Id
    private String id;
    private String title;
    private String description;
    private String appId;
    private String status;

    public Ticket() {
    }

    public Ticket(String title, String description, String appId, String status) {
        this.title = title;
        this.description = description;
        this.appId = appId;
        this.status = status;
    }

    public Ticket(String title, String description, String status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", application_id=" + appId +
                ", status='" + status + '\'' +
                '}';
    }
}
