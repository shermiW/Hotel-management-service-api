package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="room")
public class Room {
    @Id
    @Column(name="room_id",length=80)
    private String roomId;

    @Column(name="room_number",length=80)
    private String roomNumber;

    @Column(name="room_type",length=80,nullable = false)
    private String type;

    @Column(name="bed_count",length=80)
    private int bedCount;

    @Column(name="price",length=80)
    private BigDecimal price;

    @Column(name="is_available",length=80)
    private boolean isAvailable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="branch_id" )
    private Branch branch;

    @OneToMany(mappedBy = "room")
    private List<Facility> facilities;

    @OneToMany(mappedBy = "room")
    private List<RoomImage> roomImages;

}
