package com.ssg.ssg_be.productInquiry.domain;

import com.ssg.ssg_be.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductInquiry extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long qnaId;

    // user 엔티티 넣어서 반영
//    @ManyToOne
//    @JoinColumn(name = "userId", nullable = false)
//    private User user;

    // product 엔티티 넣어서 반영
//    @ManyToOne
//    @JoinColumn(name = "productId")
//    @Column(nullable = false)
//    private Product product;

    @Column(nullable = false)
    private int type;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int secret;

    @Column(nullable = false)
    private int answerStatus;


}