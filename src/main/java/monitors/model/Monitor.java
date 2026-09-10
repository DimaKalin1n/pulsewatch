package monitors.model;

import jakarta.persistence.*;

@Entity
@Table(name="monitors")
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String url;

    private int intervalSeconds;

    private boolean enable;
}
