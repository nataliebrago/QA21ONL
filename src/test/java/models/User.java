package models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @ToString.Include
    private String userName;

    @ToString.Exclude
    private String password;
}
