package com.bitforge.splitwise.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SettleUpGroupRequestDTO {
    private Long groupId;
}
