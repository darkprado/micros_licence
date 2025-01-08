package home.micros.licensing_service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author S.Melekhin
 * @since 08 янв. 2025 г.
 */
@Getter
@Setter
@ToString
public class License {

    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;

}
