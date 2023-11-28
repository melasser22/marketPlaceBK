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
	 @Column(name = "question", nullable = false)
    private String question;
    @Column(name = "answer", nullable = false)
    private String answer;
	public ProductFaq() {
	}
	public ProductFaq(Long id, String productCode, String question, String answer) {
		this.id = id;
		this.productCode = productCode;
		this.question = question;
		this.answer = answer;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
    
}
