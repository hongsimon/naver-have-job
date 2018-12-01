package jobless.dao.mapper;

import java.util.List;

import jobless.model.ClipVO;

@MyAnnotMapper
public interface IClipMapper {
	void insertClip(ClipVO clipVO);
	List<ClipVO> selectClipList();
	ClipVO selectClipById(int clip_id);
	void updateClip(ClipVO clipVO);
	void deleteClip(int clip_id);
}
