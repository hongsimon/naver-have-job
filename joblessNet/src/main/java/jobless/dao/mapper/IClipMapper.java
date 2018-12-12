package jobless.dao.mapper;

import java.util.List;

import jobless.dao.condition.Condition;
import jobless.model.ClipDetailVO;
import jobless.model.ClipVO;
import jobless.model.CriteriaVO;

@MyAnnotMapper
public interface IClipMapper {
	void insertClip(ClipVO clipVO);
	List<ClipVO> selectClipList();
	List<ClipVO> selectClipByWriterId(int writerId);
	List<ClipVO> selectClipByBroadcasterId(int broadCasterId);
	ClipDetailVO selectClipDetail(int clipId);
	List<ClipDetailVO> selectClipDetailList(Condition condition);
	ClipVO selectClipById(int clipId);
	void updateClip(ClipVO clipVO);
	void deleteClip(int clipId);
	void readToIncreaseViews(int clipId);
	List<ClipDetailVO> readListCriteria(CriteriaVO cri);
	Integer readTotalCount();
}
