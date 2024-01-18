package fr.nsurget.nicolasexamspringboot.Citydex.entity;


import fr.nsurget.nicolasexamspringboot.Citydex.entity.interfaces.SluggerInterface;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User implements SluggerInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Please, give a proper name")
    @Size(message = "The account name must have at least 5 characters", min = 5)
    private String name;

    private String email;

    private String password;

    private String slug;

    private String roles = "[]";


    public boolean isAdmin() {
        return roles.contains("[\"ROLE_ADMIN\"]");
    }


    public String getField() {
        return name + "-" + id;
    }
}