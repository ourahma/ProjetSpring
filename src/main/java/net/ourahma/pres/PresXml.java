package net.ourahma.pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.ourahma.metier.IRecommendationMetier;

public class PresXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IRecommendationMetier metier = context.getBean("metier", IRecommendationMetier.class);
        System.out.println("********** Bienvenue dans le système de recommandation de livres **********");
        System.out.println("********** Voici un livre que nous vous recommandons **********");
        System.out.println(metier.recommander());
        System.out.println("********** Merci de votre visite **********");
    }
}
