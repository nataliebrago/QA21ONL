package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString

public class Case {
    @EqualsAndHashCode.Exclude
    private int id;
    @SerializedName(value = "section_id")
    private int sectionId;
    @SerializedName(value = "title")
    private String title;
    @SerializedName(value = "template_id")
    private int templateId;
    @SerializedName(value = "type_id")
    private int typeId;
    @SerializedName(value = "priority_id")
    private int priorityId;
}