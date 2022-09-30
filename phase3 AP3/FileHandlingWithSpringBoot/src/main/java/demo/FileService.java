package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
@Autowired
	FileRepo repo;
	        private final String FOLDER_PATH="‪C:\\Users\\Kalviyarasi\\Desktop\\";
	        
	        public String uploadImageFromPath(MultipartFile file) throws IllegalStateException, IOException {
	        	String filePath=FOLDER_PATH+file.getOriginalFilename();
	 FileData data=repo.save(FileData.builder()
	        			.name(file.getOriginalFilename())
	        			.type(file.getContentType())
	        			.filePath(filePath).build());
	        	file.transferTo(new File(filePath));
	        	if(data!=null) {
	        		return "file uploaded sucessfully.."+filePath;
	        	
	        	}
	        	return null;
	        }
	        
	        
	
	        
	        
 public byte[] downloadImageFromPath(String fileName) throws IOException {
	 Optional<FileData> filedata=repo.findByName(fileName);
	        	String filePath=filedata.get().getFilePath();
	        	byte[] images=Files.readAllBytes(new File(filePath).toPath());
	        	return images;
	        }
	        


	
}

