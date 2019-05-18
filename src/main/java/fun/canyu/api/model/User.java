package fun.canyu.api.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@ToString
@Accessors(chain = true)
@Document
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    // 权限字符串存储
    private Set<Role> roles;
}