package net.ourahma.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.ourahma.dao.IRecommendationDao;
import net.ourahma.models.Livre;
@Service("metier")
public class RecommandationMetierImpl implements IRecommendationMetier {
    @Autowired
    @Qualifier("dao")
    private IRecommendationDao dao;
    public RecommandationMetierImpl(@Qualifier("dao") IRecommendationDao dao) {
        this.dao = dao;
        
    }
   
    @Override
    public Livre recommander() {
        List<Livre> livres = dao.getLivre();
        if (livres.isEmpty()) {
            return null; 
        }
        
        int randomIndex = (int) (Math.random() * livres.size());
        return livres.get(randomIndex);
        
    }
    

    

}
