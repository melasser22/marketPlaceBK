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
    private String question_en;
    @Column(name = "answer_en", nullable = false)
    private String answer_en;
    @Column(name = "question_ar", nullable = false)
    private String question_ar;
    @Column(name = "answer_ar", nullable = false)
    private String answer_ar;
	public String getQuestion_en() {
		return question_en;
	}

	public void setQuestion_en(String question_en) {
		this.question_en = question_en;
	}

	public String getAnswer_en() {
		return answer_en;
	}

	public void setAnswer_en(String answer_en) {
		this.answer_en = answer_en;
	}

	public String getQuestion_ar() {
		return question_ar;
	}

	public void setQuestion_ar(String question_ar) {
		this.question_ar = question_ar;
	}

	public String getAnswer_ar() {
		return answer_ar;
	}

	public void setAnswer_ar(String answer_ar) {
		this.answer_ar = answer_ar;
	}

	public ProductFaq() {
	}

	public ProductFaq(Long id, String productCode, String question_en, String answer_en, String question_ar, String answer_ar) {
		this.id = id;
		this.productCode = productCode;
		this.question_en = question_en;
		this.answer_ar = answer_ar;
		this.question_ar = question_ar;
		this.answer_en = answer_en;
		
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

	
	
}
