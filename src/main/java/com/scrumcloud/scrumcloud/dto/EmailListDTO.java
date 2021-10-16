package com.scrumcloud.scrumcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class EmailListDTO {
    private Long idTime;

    private List<String> listEmails;

}
