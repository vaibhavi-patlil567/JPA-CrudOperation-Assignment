package client;

import java.util.Scanner;

import entities.Author;
import exceptions.AuthorNotFoundException;
import service.AuthorService;
import service.AuthorServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		AuthorService service=new AuthorServiceImpl();
		int ch=5;
		try (Scanner sc = new Scanner(System.in)) 
		{
			/*int author_Id;
			 String First_name;
			 String Middle_name;
			 String Last_name;
			 int Phone_no;*/
			Author p1;
			do
			{
				System.out.println("------------------Author Menu-------------");
				System.out.println("1. Insert Author");
				System.out.println("2. Update Author");
				System.out.println("3. Delete Author");
				System.out.println("4. Display Author");
				System.out.println("5. Exit");
				System.out.println("Enter Choice(1..5) ");
				ch=sc.nextInt();
					switch(ch)
				{
					case 1:
							System.out.println("Enter Author Id, First_name, Middle_name, Last_name, Phone_no");
							int author_Id=sc.nextInt();
							String First_name=sc.next();
							String Middle_name=sc.next();
							String Last_name=sc.next();
							long Phone_no=sc.nextInt();
							p1=new Author();
							p1.setAuthor_Id(author_Id);
							p1.setFirst_name(First_name);
							p1.setMiddle_name(Middle_name);
							p1.setLast_name(Last_name);
							p1.setPhone_no(Phone_no);
							
							service.addAuthor(p1);
							break;
					case 2:
							System.out.println("Enter Author Id and  updated Phone_no ");
							author_Id=sc.nextInt();
							Phone_no=sc.nextInt();
							p1=service.getAuthorById(author_Id);
							if (p1==null)
							//	System.out.println("Product not found");
								throw new AuthorNotFoundException();								
							else
							{
								p1.setPhone_no(Phone_no);
								service.updateAuthor(p1);
							}
							break;
					case 3:	System.out.println("Enter Author Id to be delete ");
					        author_Id=sc.nextInt();
							p1=service.getAuthorById(author_Id);
							if (p1==null)
								
								throw new AuthorNotFoundException();
							else
							{
								service.removeAuthor(p1);
							}
							break;
					case 4:	System.out.println("Enter Author Id to be search...");
					        author_Id=sc.nextInt();
							p1=service.getAuthorById(author_Id);
							if (p1==null)
								throw new AuthorNotFoundException();
								
							else
							{
								System.out.println("author id "+p1.getAuthor_Id()+"\tFirst name "+p1.getFirst_name()+"\tMiddle name "+p1.getMiddle_name()+"\tLast name "+p1.getLast_name()+"\tPhone_no "+p1.getPhone_no());
							}
							
							break;
					case 5: System.exit(0);
					
				}						
			}while(ch!=5);
		}
		catch(Exception e) {
			System.out.println("Error..."+e.getMessage());
		}
	}

}