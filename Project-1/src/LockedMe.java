import java.io.*;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) {
		int ch = 0, ch1 = 0, ch2 = 0;
		Scanner sc = new Scanner(System.in);
		File file = new File("E:\\HARSH\\Java\\Project-1\\LockedMe");
		file.mkdir();
		System.out.println("*********************************");
		System.out.println("*** Welcome to LockedMe.com ***");
		System.out.println("Application Name : LockedMe.com");
		System.out.print("Developer Detail : Harsh Joshi\n");
		System.out.println("*********************************");
		
		while(true)
		{
			System.out.println("You have the following Options");
			System.out.println("1. Retrieve the file names in an ascending order");
			System.out.println("2. Business-level file operations");
			System.out.println("3. Exit from Application");
			
			System.out.println("Enter your choice : ");
			try
			{
				ch = sc.nextInt();
			}catch(Exception e){System.out.println("Please enter valid number");}
			sc.nextLine();
			
			switch(ch)
			{
				case 1 :File file1 = new File("E:\\HARSH\\Java\\Project-1\\LockedMe");
						File array[] = file1.listFiles();
						System.out.println("***Listing out all files and Folders below***");
						for(int i = 0; i<array.length; i++)
						{
							System.out.println(array[i]);
						}
						System.out.println("\n");
						break;
						
				case 2 :while(true)
						{
							System.out.println("You have the following File Operations to perform");
							System.out.println("1. Add a file/folder to the LockedMe directory");
							System.out.println("2. Delete a file/folder from the LockedMe directory");
							System.out.println("3. Searching file/folder in LockedMe directory");	
							System.out.println("4. Return to Main Menu");
							System.out.println("5. Exit from Application");
								
							System.out.println("Enter your choice : ");
							try
							{
								ch1 = sc.nextInt();
							}catch(Exception e) {System.out.println("Please enter valid number");}
							sc.nextLine();
								
								if(ch1 == 1)
								{	
									System.out.println("Adding file/folder to the directory");
									System.out.println("Press 1. Add a file");
									System.out.println("Press 2. Add a folder");
									System.out.println("Enter your choice : ");
									try
									{
										ch2 = sc.nextInt();
									}catch(Exception e){System.out.println("Please enter valid number");}
									sc.nextLine();
									if(ch2 == 1)
									{
										System.out.println("Enter File Name with extension: ");
										String filename = sc.nextLine();
										File file2 = new File("E:\\\\HARSH\\\\Java\\\\Project-1\\\\LockedMe\\"+filename);
										try
										{
											file2.createNewFile();
										}
										catch(IOException e)
										{ }
										System.out.println("File added Successfully...");
									}
									else if(ch2 == 2)
									{
										System.out.println("Enter Folder Name : ");
										String foldername = sc.nextLine();
										File file2 = new File("E:\\\\HARSH\\\\Java\\\\Project-1\\\\LockedMe\\"+foldername);
										file2.mkdir();
										System.out.println("Folder added Successfully...");
									}
									else
									{
										System.out.println("You have entered wrong choice...");
									}
								}	
								
								
								else if(ch1 == 2)
								{
									System.out.println("Enter File/Folder Name to delete : ");
									String name = sc.nextLine();
									File file3 = new File("E:\\\\HARSH\\\\Java\\\\Project-1\\\\LockedMe\\"+name);
									if(file3.exists())
									{
										file3.delete();
										System.out.println("File/Folder deleted successfully...");
									}
									else
									{
										System.out.println("File/Folder not found...");
									}
								}
								
								
								else if(ch1 == 3)
								{
									System.out.println("Enter file/folder name to search in LockedMe directory : ");
									String searchname = sc.nextLine();
									File file4 = new File("E:\\HARSH\\Java\\Project-1\\LockedMe");
									File array1[] = file4.listFiles();
									int check = 0;
									for(int i = 0; i < array1.length; i++)
									{
										if(array1[i].getName().startsWith(searchname))
										{
											check = 1;
											System.out.println(array1[i]);
										}
									}
									if(check == 0)
									{
										System.out.println("File not found in directory!!!");
									}
								}
							
								
								else if(ch1 == 4)
								{
									break;
								}
								
								
								else if(ch1 == 5)
								{
									System.out.println("Thank You...Application Terminated Successfully!!!");
									System.exit(0);
								}
							
								
								else 
								{
									System.out.println("You have entered wrong choice...Please try again!!!\n");
								}
						} 
						break;
						
				case 3 :System.out.println("Thank You...Application Terminated Successfully!!!");
						System.exit(0);
						break;
					
				default :System.out.println("You have entered wrong choice...Please try again!!!\n");
			}
		}
	}
}
