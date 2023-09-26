package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Milestone {
    @SerializedName(value = "name")
    private String name;
    @SerializedName(value = "description")
    private String description;
}