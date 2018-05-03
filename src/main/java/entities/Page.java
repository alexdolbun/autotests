package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@ToString
public class Page {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("isTest")
    @Expose
    private Boolean isTest;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("features")
    @Expose
    private List<Feature> features = null;
}
