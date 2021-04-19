package ru.meschanov.mvc.sweater.domain;

import javax.persistence.Entity;
import ru.meschanov.mvc.sweater.domain.baseEntity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MessageEntity extends BaseEntity {
    private String text;
    private String tag;
}
