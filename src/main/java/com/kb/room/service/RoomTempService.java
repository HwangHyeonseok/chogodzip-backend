package com.kb.room.service;

import com.kb.room.dto.RoomParam;
import com.kb.room.dto.request.GosiwonPostDTO;
import com.kb.room.dto.response.RoomHomeDTO;
import com.kb.room.dto.response.RoomHomeMapDTO;
import com.kb.room.dto.response.RoomTempDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface RoomTempService {
    List<RoomTempDTO> fetchAllRooms();
    Integer addRoom(GosiwonPostDTO dto, List<MultipartFile> pics) throws IOException; //고시원 작성
    List<RoomHomeDTO> fetchRoomsAtInterestArea(String interestArea);
    List<RoomHomeMapDTO> fetchRoomsAtInterestAreaMap(RoomParam param);
}
