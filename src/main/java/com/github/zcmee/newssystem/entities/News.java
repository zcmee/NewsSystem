package com.github.zcmee.newssystem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "news")
public final class News implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "data")
    private String data;

    public News() {
        // default constructor
    }

    public News(String title, String text, String data) {
        this.title = title;
        this.text = text;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
