package service;

import dao.AuthorDao;
import dao.AuthorDaoImpl;
import entities.Author;

public class AuthorServiceImpl implements AuthorService
{
    private AuthorDao dao;
    public AuthorServiceImpl()
    {
    	dao=new AuthorDaoImpl();
    }
    
	@Override
	public Author getAuthorById(int id)
	{
		return dao.getAuthorById(id);
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
		System.out.println("Author added..");
	}

	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
		System.out.println("Author updated..");
		
	}

	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
		System.out.println("Author deleted..");
		
	}

}