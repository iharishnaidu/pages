package com.prototype.pages.mapper;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TitanVO implements Serializable {

    private static final long serialVersionUID = -4462609869819991627L;

    private Long titanId;

    private String titanName;

    private Long boyId;

    private String boyName;

}
