package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
@Entity
@Table(name = "Cases")
public class Cases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    @Column(name = "id")
    private int id;
    @SerializedName(value = "section_id")
    @Column(name = "Section_Id")
    private int sectionId;
    @SerializedName(value = "title")
    @Column(name = "Title")
    private String title;
    @SerializedName(value = "template_id")
    @Column(name = "Template_Id")
    private int templateId;
    @SerializedName(value = "type_id")
    @Column(name = "Type_Id")
    private int typeId;
    @SerializedName(value = "priority_id")
    @Column(name = "Priority_Id")
    private int priorityId;
}
