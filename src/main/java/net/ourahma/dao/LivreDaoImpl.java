package net.ourahma.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.ourahma.models.Livre;
@Repository("dao")
public class LivreDaoImpl implements IRecommendationDao {
    @Override
    public List<Livre> getLivre() {
       
        return Arrays.asList(
            new Livre("Le Petit Prince", "Antoine de Saint-Exupéry"),
            new Livre("1984", "George Orwell"),
            new Livre("To Kill a Mockingbird", "Harper Lee"),
            new Livre("The Great Gatsby", "F. Scott Fitzgerald"),
            new Livre("The Catcher in the Rye", "J.D. Salinger"),
            new Livre("Pride and Prejudice", "Jane Austen"),
            new Livre("The Lord of the Rings", "J.R.R. Tolkien"),
            new Livre("The Hobbit", "J.R.R. Tolkien")
        );
    }

}
