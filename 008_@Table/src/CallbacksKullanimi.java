import javax.persistence.Entity;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

@Entity
public class CallbacksKullanimi {
	@PrePersist
	void kaydetmeOncesi() {
		System.out.println("KAYDETME ÖNCESÝNDE ÇAÐIRILIR");
	}

	@PostPersist
	void kaydetmeSonrasi() {
		System.out.println("KAYDETME SONRASINDA ÇAÐIRILIR");
	}

	@PostLoad
	void yuklemeSonrasi() {
		System.out.println("YÜKLEME SONRASINDA ÇAÐIRILIR");
	}

	@PreUpdate
	void guncellemeOncesi() {
		System.out.println("GÜNCELLEME ÖNCESÝNDE ÇAÐIRILIR");
	}

	@PostUpdate
	void guncellemeSonrasi() {
		System.out.println("GÜNCELLEME SONRASINDA ÇAÐIRILIR");
	}

	@PreRemove
	void silmeOncesi() {
		System.out.println("SÝLME ÖNCESÝNDE ÇAÐIRILIR");
	}

	@PostRemove
	void silmeSonrasi() {
		System.out.println("SÝLME SONRASINDA ÇAÐIRILIR");
	}
}















