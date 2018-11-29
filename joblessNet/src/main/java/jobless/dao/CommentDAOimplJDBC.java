package jobless.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jobless.dao.mapper.ICommentMapper;

@Repository("CommentDAO")
public class CommentDAOimplJDBC implements CommentDAO {
	@Autowired
	private ICommentMapper mapper;
}
