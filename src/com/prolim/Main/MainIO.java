package com.prolim.Main;

import java.io.IOException;
import java.util.Scanner;

import com.prolim.IOOperation.Operations;

public class MainIO {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory");
		String dir = sc.nextLine();
		Operations operationsObj = new Operations(dir);
		while(true) {
			System.out.println("Menu: Option 1: Files in Ascending Order, Option 2: File Operations, Option 3: Close the file operations");
			int option = sc.nextInt();
			switch(option) {
			case 1: operationsObj.displayFilesInAscOrder();
			break;
			case 2:
				while(true) {
					System.out.println("Option 2 SubMenu: 1. Add a file, 2. Delete a file, 3.  Search a file, 4. Close the submenu");
					int subOption = sc.nextInt();
					if (subOption == 1) {
						operationsObj.addAFile();
					}
					else if(subOption == 2) {
						operationsObj.deleteAFile();
					}
					else if(subOption == 3) {
						operationsObj.searchAFile();
					}else {
						break;
					}
				}
			break;
			case 3: System.exit(0);
			}
		}
	}
}
