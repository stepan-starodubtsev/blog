package com.firstprogect.blog.models;

import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons, fullText;
    private int views;

    public Post(String title, String anons, String fullText) {
        this.id = id;
        this.title = title;
        this.anons = anons;
        this.fullText = fullText;
        this.views = views;
    }

    public  Post(){
    }


    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAnons() {
        return this.anons;
    }

    public String getFullText() {
        return this.fullText;
    }

    public int getViews() {
        return this.views;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Post post = (Post) o;
        return id != null && Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public String toString() {
        return "Post(id=" + this.getId() + ", title=" + this.getTitle() + ", anons=" + this.getAnons() + ", fullText=" + this.getFullText() + ", views=" + this.getViews() + ")";
    }
}
