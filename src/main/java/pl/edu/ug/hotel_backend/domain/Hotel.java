package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phoneNumber;
    @OneToOne(fetch = FetchType.EAGER)
    Address address;
    @OneToMany(fetch = FetchType.LAZY)
    List<Room> rooms;
    @OneToOne(fetch = FetchType.EAGER)
    Director director;

}
