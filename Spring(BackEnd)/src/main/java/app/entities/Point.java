package app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Самая простая модель того, как это все будет храниться в базе данных
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "points")
public class Point {
    private @Id
    @GeneratedValue
    Long id;
    private double x;
    private double y;
    private double r;
    private boolean result;

    @ManyToOne
    private User user;

}
