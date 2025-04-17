package net.ourahma.pres;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import net.ourahma.metier.IRecommendationMetier;
import org.springframework.context.ApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.ourahma");
        IRecommendationMetier metier = context.getBean( IRecommendationMetier.class);
        System.out.println("********************** Bienvenue dans le système de recommandation de livres **********************");
        System.out.println("******************** Voici un livre que nous vous recommandons ***********************");
        System.out.println(metier.recommander());
        System.out.println("********** Merci de votre visite **********");
    }
}
