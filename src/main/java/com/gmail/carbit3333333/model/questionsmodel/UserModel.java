package com.gmail.carbit3333333.model.questionsmodel;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String login;
    private String userPassword;
    @ManyToMany
    @JoinTable(name="usermodel_countwinner",
            joinColumns = @JoinColumn(name="usermodel_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="coutwinner_id", referencedColumnName="id"))
    private Set<CoutWinner> coutWinner;

    public UserModel() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Set<CoutWinner> getCoutWinner() {
        return coutWinner;
    }

    public void setCoutWinner(Set<CoutWinner> coutWinner) {
        this.coutWinner = coutWinner;
    }
}
