package com.chan.SideProject.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wno;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private Long password;

}
