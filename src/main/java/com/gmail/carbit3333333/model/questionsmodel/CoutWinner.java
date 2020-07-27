package com.gmail.carbit3333333.model.questionsmodel;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CoutWinner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int count;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "coutWinner")
    public Set<UserModel> userModel;

    public Set<UserModel> getUserModel() {
        return userModel;
    }

    public void setUserModel(Set<UserModel> userModel) {
        this.userModel = userModel;
    }

    public CoutWinner() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
