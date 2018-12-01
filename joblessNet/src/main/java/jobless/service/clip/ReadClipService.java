package jobless.service.clip;

import java.util.List;

import jobless.model.ClipVO;

public interface ReadClipService {
	List<ClipVO> readAllClip();

	List<ClipVO> readClipByUserId(int userId);

	List<ClipVO> readClipByBoardId(int boardId);

	List<ClipVO> readClipByCategoryId(int categoryId);
}
