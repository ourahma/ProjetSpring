package net.ourahma.ext;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.ourahma.dao.IRecommendationDao;
import net.ourahma.models.Livre;
@Repository("dao2")
public class LivreDaoImplV2 implements IRecommendationDao{
    
    @Override
    public List<Livre> getLivre() {
        System.out.println("********************** Le livre recommandé depuis l'AI *******************************");
        List<Livre> livres = Arrays.asList(
            new Livre("titre ai", "auteur AI")
            
        );
           
        return livres;
       
    }

}
