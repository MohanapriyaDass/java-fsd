package com.example.demo;

import java.io.IOException;
import java.util.zip.DataFormatException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
//@RequestMapping("/image")
public class ImageRest {
@Autowired
	FileService service;
	
@PostMapping("/image")
public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException{

	String uploadImage=service.uploadImageFromPath(file);
	return ResponseEntity.status(HttpStatus.OK).body(uploadImage);
	
	
}


@GetMapping("/{filename}")
public ResponseEntity<?> downloadImage(@PathVariable String filename) throws DataFormatException, IOException{
	byte[] imagedata=service.downloadImageFromPath(filename);
	return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imagedata);
}


}

