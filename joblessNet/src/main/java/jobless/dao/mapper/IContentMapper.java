package jobless.dao.mapper;

import jobless.model.ContentVO;

@MyAnnotMapper
public interface IContentMapper {
	
	public void insertContent(ContentVO content);
	public void updateContent(ContentVO content);
	public void deleteContent(int id);
	public ContentVO selectContentById(int id);
}
