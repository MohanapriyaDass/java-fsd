package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepo extends JpaRepository<ImageData, Long> {

	Optional<ImageData> findByName(String fileName);
	
}


