package com.kb.room.vo;

import lombok.*;
import java.math.BigDecimal;
import java.util.Date;


@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Room {
    private Long roomId;
    private Long userId;
    private BigDecimal roomLat;
    private BigDecimal roomLong;
    private String thumbnail;
    private Boolean canLoan;
    private Date createdAt;
    private Date updatedAt;
}