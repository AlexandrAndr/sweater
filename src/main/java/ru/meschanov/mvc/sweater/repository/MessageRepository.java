package ru.meschanov.mvc.sweater.repository;

import ru.meschanov.mvc.sweater.domain.MessageEntity;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity,Long> {

        List<MessageEntity> findByTag(String tag);
}
