package com.example.demo.payload;

public class Response {

	private String fileName;
	private String fileDownloadUri;
	private String fileType;
	private long size;

	public Response(String fileName, String fileDownloadUri, String fileType, long size) {
		super();
		this.fileName = fileName;
		this.fileDownloadUri = fileDownloadUri;
		this.fileType = fileType;
		this.size = size;
	}

}
