import javax.persistence.Entity;
import javax.persistence.ExcludeSuperclassListeners;

@Entity
@ExcludeSuperclassListeners
public class EntityListenersDipnotuKullanimi extends ListenersKullanimi {

}

/*
try {
    em.getTransaction().begin();
    // Varlýk nesnelerinin iþlem kodlarý bu arada olur.
    em.getTransaction().commit();
}
finally {
    if (em.getTransaction().isActive()) //Eðer transaction aktifse
        em.getTransaction().rollback(); //tüm iþlemleri baþa geri sar.
}
*/














