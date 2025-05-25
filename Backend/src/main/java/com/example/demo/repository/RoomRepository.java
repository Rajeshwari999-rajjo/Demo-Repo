package com.example.demo.entity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Room;

public interface RoomRepository extends MongoRepository<Room, String>{

	//get room using room id
	Room findByRoomId(String roomId);
}
