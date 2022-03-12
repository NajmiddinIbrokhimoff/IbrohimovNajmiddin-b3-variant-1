package uz.ibrokhimoff.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Login {
    private String username;
    private String password;
    private String role;

}
