package com.ssg.ssg_be.qna.infrastructure;

import com.ssg.ssg_be.qna.domain.Qna;
import com.ssg.ssg_be.qna.domain.QnaDtoRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QnaRepository extends JpaRepository<Qna, Long> {
    List<QnaDtoRes> findByProductProductId(Long productId);;
    List<QnaDtoRes> findByUserUserId(Long userId);
}