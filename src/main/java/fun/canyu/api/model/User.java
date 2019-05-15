package fun.canyu.api.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Data
@ToString
@Accessors(chain = true)
public class User {
    @Id
    private String id;
    private String username;
    private String password;
}