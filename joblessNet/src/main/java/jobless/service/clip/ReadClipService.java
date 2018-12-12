package jobless.service.clip;

import java.util.List;

import jobless.dao.condition.Condition;
import jobless.model.ClipDetailVO;
import jobless.model.ClipVO;
import jobless.model.CriteriaVO;

public interface ReadClipService {
	ClipVO readClip(int clipId);
	
	ClipDetailVO readClipDetail(int clipId);
	
	List<ClipVO> readAllClip();

	List<ClipVO> readClipByUserId(int userId);

	List<ClipVO> readClipByBoardId(int boardId);

	List<ClipVO> readClipByCategoryId(int categoryId);

	List<ClipDetailVO> readClipDetailList(Condition condition);
	
	List<ClipDetailVO> readListCriteria(CriteriaVO cri);
	
	Integer readTotalCount();
}
