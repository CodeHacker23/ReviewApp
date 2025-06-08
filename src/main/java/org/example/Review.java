package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Review {
    private Long id;
    private  LocalDate localDate;
    private String text;
    private String  name;


    public Review(Long id, LocalDate localDate, String text, String name) {
        this.id = id;
        this.localDate = localDate;
        this.text = text;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(localDate, review.localDate) && Objects.equals(text, review.text) && Objects.equals(name, review.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localDate, text, name);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id: " + id +
                ", localDate: " + localDate +
                ", text: " + text + '\'' +
                ", name: " + name +
                '}';
    }
}
