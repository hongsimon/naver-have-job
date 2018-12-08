package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.IContentMapper;
import jobless.model.ContentVO;

@Repository("ContentDAO")
public class ContentDAOimplJDBC implements ContentDAO {
	@Autowired
	private IContentMapper mapper;
	
	@Override
	public void insert(ContentVO content) {
		mapper.insertContent(content);
	}
	
	@Override
	public void update(ContentVO content) {
		mapper.updateContent(content);
	}
	
	@Override
	public void delete(int id) {
		mapper.deleteContent(id);
	}
	
	@Override
	public ContentVO read(int id) {
		return mapper.selectContentById(id);
	}
}
