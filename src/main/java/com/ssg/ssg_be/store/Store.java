package com.ssg.ssg_be.store;


import com.ssg.ssg_be.BaseTimeEntity;
import com.ssg.ssg_be.paymentmethod.domain.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Store extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long storeId;

    @Column(nullable = false)
    private String rank;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int state;

    // sell 엔티티 넣어서 반영
    // 비식별자 OneToOne 매핑인데 어떻게 해결해야 할지 고민중
//    @OneToOne
//    @JoinColumn(name = "sellerId")
//    private Long sellerId;

}