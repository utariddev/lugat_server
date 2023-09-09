package org.utarid.lugat.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "words")
public class WordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String word;
    @Column(nullable = false, length = 1000)
    private String description;
    @Column(nullable = false)
    private boolean isActive;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private String titles;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }
}
