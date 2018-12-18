package com.example;

import javax.ws.rs.FormParam;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class FileUploadForm {
public FileUploadForm(){}
private byte[] fileData;
public byte[] getFileData() {
	return fileData;
}
@FormParam("selectedFiel")
@PartType("application/octet-stream")
public void setFileData(byte[] fileData) {
	this.fileData = fileData;
}
public String getFileName() {
	return fileName;
}
@FormParam("fileName")
public void setFileName(String fileName) {
	this.fileName = fileName;
}
private String fileName;

}
