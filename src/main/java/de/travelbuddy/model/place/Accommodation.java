package de.travelbuddy.model.place;

        import com.sun.istack.NotNull;
        import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * Accommodation is a extension from place
 */
@Entity

@Getter @Setter
@NoArgsConstructor
public class Accommodation extends Place {

    @Enumerated()
    @Column(columnDefinition = "smallint", nullable = false)
    private accommodationType type;

    public enum accommodationType
    {
        HOTEL,HOSTEL,CAMPING,COUCHSURF,AIRBNB
    }

    public accommodationType getType() {return type;}

    public void setType(accommodationType type) {this.type = type;}
}
