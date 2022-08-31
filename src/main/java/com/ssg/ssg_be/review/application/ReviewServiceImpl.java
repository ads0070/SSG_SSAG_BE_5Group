package com.ssg.ssg_be.review.application;
import com.ssg.config.BaseException;
import com.ssg.ssg_be.product.domain.Product;
import com.ssg.ssg_be.product.infrastructure.ProductRepository;
import com.ssg.ssg_be.review.domain.*;
import com.ssg.ssg_be.review.infrastructure.ReviewImgRepository;
import com.ssg.ssg_be.review.infrastructure.ReviewRepository;
import com.ssg.ssg_be.signup.domain.User;
import com.ssg.ssg_be.signup.infrastucture.UserRepository;
import com.ssg.utils.s3.S3UploaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import static com.ssg.config.BaseResponseStatus.*;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;
    private UserRepository userRepository;
    private ProductRepository productRepository;
    private ReviewImgRepository reviewImgRepository;
    private S3UploaderService s3UploaderService;

    @Override
    public void createReview(ReviewDtoReq reviewDtoReq, Long userId, List<MultipartFile> multipartFile) throws BaseException {
        User user = userRepository.findByUserId(userId).orElseThrow(() -> new BaseException(NO_EXIST_USER));
        try {
            Product product = productRepository.getById(reviewDtoReq.getProductId());
            Review review = reviewRepository.save(reviewDtoReq.toEntity(product, user));
            //TODO #1 : S3UploadDto 만들기 (String saveName, String imgUrl)

            //TODO #2 : S3UploadService로 multipart 파일 업로드하기

            //TODO #3 : 반환 값으로 reviewImgRepo에 데이터 저장
        } catch (Exception exception) {
            throw new BaseException(REVIEW_INSERT_FAILED);
        }
    }

    @Override
    public List<ReviewDtoRes> retrieveReview(Long productId) throws BaseException {
        try {
            return reviewRepository.findByProductProductId(productId);
        } catch (Exception exception) {
            throw new BaseException(REVIEW_RETRIEVE_FAILED);
        }
    }

    @Override
    public List<ReviewDtoRes> retrieveMyReview(Long userId) throws BaseException {
        try {
            return reviewRepository.findByUserUserId(userId);
        } catch (Exception exception) {
            throw new BaseException(REVIEW_RETRIEVE_FAILED);
        }
    }

    @Override
    public void deleteReview(Long reviewId) throws BaseException {
        try {
            reviewRepository.deleteById(reviewId);
        } catch (Exception exception) {
            throw new BaseException(REVIEW_DELETE_FAILED);
        }
    }

    @Override
    public void updateReview(ReviewPatchDtoReq reviewPatchDtoReq) throws BaseException {
        try {
            User user = userRepository.getById(reviewPatchDtoReq.getUserId());
            Product product = productRepository.getById(reviewPatchDtoReq.getProductId());
            reviewRepository.save(reviewPatchDtoReq.toEntity(product, user));
        } catch (Exception exception) {
            throw new BaseException(REVIEW_UPDATE_FAILED);
        }
    }
}
