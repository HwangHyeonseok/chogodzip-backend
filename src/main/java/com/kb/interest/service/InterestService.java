package com.kb.interest.service;

import com.kb.interest.dto.InterestRoom;
import com.kb.interest.mapper.InterestMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Log4j
@Service
@RequiredArgsConstructor
@PropertySource({"classpath:/application.properties"})
public class InterestService {

    private final InterestMapper interestMapper;


    public List<InterestRoom> getInterestRooms(Long userId) {

        return interestMapper.getUserInterestRoom(userId);
    }

    public int addInterestRoom(Long userId, Long roomId) {

       int result = interestMapper.addInterestRoom(userId,roomId);
       if(result == 1) {
           return 1;
       }
       return 0;
    }

    public int deleteInterestRoom(Long userId, Long roomId) {

        int result = interestMapper.deleteInterestRoom(userId,roomId);
        if(result == 1) {
            return 1;
        }
        return 0;
    }
}
