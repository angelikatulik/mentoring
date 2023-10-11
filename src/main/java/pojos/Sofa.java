package pojos;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
public class Sofa {
    private String material;
    private String type;
}
