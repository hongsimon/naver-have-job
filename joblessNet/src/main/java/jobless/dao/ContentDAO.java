package jobless.dao;

import jobless.model.ContentVO;

public interface ContentDAO {

	public void insert(ContentVO content);
	public void update(ContentVO content);
	public void delete(int id);
	public ContentVO read(int id);
}
