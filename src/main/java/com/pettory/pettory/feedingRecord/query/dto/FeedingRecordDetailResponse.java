package com.pettory.pettory.feedingRecord.query.dto;

import com.pettory.pettory.feedingRecord.command.domain.aggregate.FeedingRecordFeedingType;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class FeedingRecordDetailResponse {

    private LocalDateTime feedingRecordUserInsertDatetime;
    private FeedingRecordFeedingType feedingRecordFeedingType;
    private String feedingRecordName;
    private String feedingRecordType;
    private String feedingRecordAmount;
    private String feedingRecordMemo;
    private String userNickname;

}
