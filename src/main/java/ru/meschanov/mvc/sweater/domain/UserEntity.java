package ru.meschanov.mvc.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import ru.meschanov.mvc.sweater.domain.baseEntity.BaseEntity;

@Entity
@Table(name = "usr")
public class UserEntity extends BaseEntity {

    private String username;
    private String password;
    private boolean active;
}
