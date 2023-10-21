package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.entity.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Tweet extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "Person_ID", referencedColumnName = "id")
    private Person person;
    private String Text;

    public Tweet(Person person, String text) {
        this.person = person;
        Text = text;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "person=" + person +
                ", Text='" + Text + '\'' +
                '}';
    }
}
