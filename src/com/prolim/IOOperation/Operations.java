package com.prolim.IOOperation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Operations {
	File fileHandlerObj;
	String dir;

	public Operations(String dir) {
		this.fileHandlerObj = new File(dir); 
		this.dir = dir;
	}

	public void displayFilesInAscOrder() {
		//display list of files

		File allFiles[] = this.fileHandlerObj.listFiles();
		for(File fileIter:allFiles) {
			System.out.println(fileIter.getName());
		}
	}

	public void addAFile() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to be added");
		String filename=sc.next();
		String path=this.dir+filename;

		//create a File
		File fileCreatorObject = new File(path);
		boolean isFileCreated = fileCreatorObject.createNewFile();
		if(isFileCreated==true) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file is not created");
		}

	}

	public void deleteAFile() {
		//delete a file
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to be deleted");
		String filename=sc.next();
		String path=this.dir+filename;
		File fileDeleterObject = new File(path);
		fileDeleterObject.delete();
		System.out.println("file deleted");

	}

	public void searchAFile() {
		//search the file
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to be searched");
		String filename=sc.next();
		String path=this.dir+filename;
		File fileSearcherObject = new File(dir);

		int isfileFound=0;
		File file[]=fileSearcherObject.listFiles();
		for(File fileIterator:file) {
			if(fileIterator.getName().equals(filename)) {
				isfileFound=1;
				break;
			}
			else {
				isfileFound=0;
			}
		}


		if(isfileFound==1) {
			System.out.println("found the file");
		}
		else{
			System.out.println("file is not found");
		}

	}
}
