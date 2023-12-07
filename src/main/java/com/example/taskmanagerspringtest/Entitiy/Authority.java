package com.example.taskmanagerspringtest.Entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Entity
@Getter
@Setter
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String authority;

//    @ManyToMany
//    @Cascade(CascadeType.MERGE)
//    private List<User> users;

    @Override
    public String getAuthority() {
        return authority;
    }

}
