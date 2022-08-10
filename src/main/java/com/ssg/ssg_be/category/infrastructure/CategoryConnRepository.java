package com.ssg.ssg_be.category.infrastructure;

import com.ssg.ssg_be.category.domain.CategoryConn;
import com.ssg.ssg_be.product.domain.MediumProductDtoRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryConnRepository extends JpaRepository<CategoryConn, Long> {

    List<MediumProductDtoRes> findByMediumCategoryId(Long mediumCategoryId);
}
