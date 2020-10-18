package com.prototype.pages.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "titans")
public class Titans {

    @Id
    @Column(name = "titan_id")
    private Long titanId;

    @Column(name = "titan_name")
    private String titanName;

    @Column(name = "titan_weapon")
    private String titanWeapon;

}
