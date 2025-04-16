package org.example.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ContextData {
    private Integer id;
    private String name;
    private Date dateOfBirth;

    @Override
    public String toString() {
        return "ContextData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
