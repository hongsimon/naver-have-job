package jobless.dao.mapper;

import java.util.List;

import jobless.model.ClipDetailVO;
import jobless.model.ClipVO;

@MyAnnotMapper
public interface IClipMapper {
	void insertClip(ClipVO clipVO);
	List<ClipVO> selectClipList();
	List<ClipVO> selectClipByWriterId(int writerId);
	List<ClipVO> selectClipByBroadcasterId(int broadCasterId);
	ClipDetailVO selectClipDetail(int clipId);
	List<ClipDetailVO> selectClipDetailList();
	ClipVO selectClipById(int clipId);
	void updateClip(ClipVO clipVO);
	void deleteClip(int clipId);
	void readToIncreaseViews(int clipId);
}
