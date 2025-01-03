package com.ll.mutiChat.domain.chat.ChatRoom.repository;

import com.ll.mutiChat.domain.chat.ChatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}
//repository는 데이터베이스에 접근해서 데이터를 가져오거나 저장하는 역할