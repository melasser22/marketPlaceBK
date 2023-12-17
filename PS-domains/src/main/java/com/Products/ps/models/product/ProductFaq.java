package com.Products.ps.models.product;
import jakarta.persistence.*;

@Entity
@Table(name="product_faq_view")
public class ProductFaq {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	 @Column(name = "product_code", nullable = false)
    private String productCode;
	 @Column(name = "question_en", nullable = false)
    private String questionEn;
    @Column(name = "answer_en", nullable = false)
    private String answerEn;

	@Column(name = "question_ar", nullable = false)
	private String questionAr;

	@Column(name = "answer_ar", nullable = false)
	private String answerAr;
	public ProductFaq() {
	}

	public ProductFaq(Long id, String productCode, String questionEn, String answerEn, String questionAr, String answerAr) {
		this.id = id;
		this.productCode = productCode;
		this.questionEn = questionEn;
		this.answerEn = answerEn;
		this.questionAr = questionAr;
		this.answerAr = answerAr;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQuestionEn() {
		return questionEn;
	}

	public void setQuestionEn(String questionEn) {
		this.questionEn = questionEn;
	}

	public String getAnswerEn() {
		return answerEn;
	}

	public void setAnswerEn(String answerEn) {
		this.answerEn = answerEn;
	}

	public String getQuestionAr() {
		return questionAr;
	}

	public void setQuestionAr(String questionAr) {
		this.questionAr = questionAr;
	}

	public String getAnswerAr() {
		return answerAr;
	}

	public void setAnswerAr(String answerAr) {
		this.answerAr = answerAr;
	}
}
