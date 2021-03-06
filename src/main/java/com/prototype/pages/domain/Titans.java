package com.prototype.pages.domain;

import com.prototype.pages.mapper.TitanVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@SqlResultSetMappings({
        @SqlResultSetMapping(name = "titansMapping.count", columns = @ColumnResult(name = "count")),
        @SqlResultSetMapping(name= "Titans.findTitansPageMapping", classes = @ConstructorResult(targetClass = TitanVO.class, columns = {
                @ColumnResult(name = "titan_id", type = Long.class),
                @ColumnResult(name = "titan_name", type = String.class),
                @ColumnResult(name="boy_id", type = Long.class),
                @ColumnResult(name="boy_name", type = String.class)
        })),
        /*@SqlResultSetMapping(name= "Titans.findTitansPageMapping", columns = {
                @ColumnResult(name = "titan_id", type = Long.class),
                @ColumnResult(name = "titan_name", type = String.class),
                @ColumnResult(name="boy_id", type = Long.class),
                @ColumnResult(name="boy_name", type = String.class)
        })*/
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "Titans.findTitansPage", query="select t.titan_id, t.titan_name, b.boy_id, b.boy_name from titans t inner join boys b on t.titan_id = b.boy_id", resultSetMapping = "Titans.findTitansPageMapping"),
        @NamedNativeQuery(name = "Titans.findTitansPage.count", resultSetMapping = "titansMapping.count", query = "Select count(titan_id) as count from titans")
})

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
