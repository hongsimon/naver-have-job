package jobless.dao.mapper;

import java.util.List;

import jobless.model.ClipVO;

@MyAnnotMapper
public interface IClipMapper {
	void insertClip(ClipVO clipVO);
	List<ClipVO> selectClipList();
	List<ClipVO> selectClipByWriterId(int writerId);
	List<ClipVO> selectClipByBroadcasterId(int broadCasterId);
	ClipVO selectClipById(int clipId);
	void updateClip(ClipVO clipVO);
	void deleteClip(int clipId);
}
