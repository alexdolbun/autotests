package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Page {
    private boolean isTest;
    private String title;
    private  String[] features;

}
