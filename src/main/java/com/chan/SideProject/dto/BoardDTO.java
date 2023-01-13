package com.chan.SideProject.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDTO {

    private Long bno;

    private String content;

    private String nickname;

}
