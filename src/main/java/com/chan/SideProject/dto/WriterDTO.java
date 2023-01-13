package com.chan.SideProject.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WriterDTO {

    private Long wno;

    private String nickname;

    private Long password;
}
